
public class NewSelection {

    public static String getAgeOrTitle(Object o) {
        if (o instanceof Comic c) {
            return c.title();
        } else if (o instanceof TextBook t) {
            return t.subject();
        } else if (o instanceof Fiction f) {
            return f.name();
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
        IBook<Integer> c1 = new Comic("Superhero Adventures", 12);
        IBook<Integer> c2 = new Comic("Mystery Island", 15);
        IBook<FictionType> f1 = new Fiction("Romeo and Juliet", FictionType.Tragedy);
        IBook<FictionType> f2 = new Fiction("The Comedy of Errors", FictionType.Comedy);
        IBook<String> t1 = new TextBook("Mathematics");
        IBook<String> t2 = new TextBook("Physics");

        System.out.println("\nTesting compareTo method:");
        System.out.println("c1 vs c2: " + c1.compareTo(c2)); 
        System.out.println("f1 vs f2: " + f1.compareTo(f2));
        System.out.println("t1 vs t2: " + t1.compareTo(t2));
    }
}

// Define the records or classes
record Comic(String title, int ageOfMainCharacter) implements IBook<Integer> {
    @Override
    public int compareTo(IBook<Integer> other) {
        return this.title.compareTo(((Comic) other).title());
    }
}

record Fiction(String name, FictionType type) implements IBook<FictionType> {
    @Override
    public int compareTo(IBook<FictionType> other) {
        return this.name.compareTo(((Fiction) other).name());
    }
}

record TextBook(String subject) implements IBook<String> {
    @Override
    public int compareTo(IBook<String> other) {
        return this.subject.compareTo(((TextBook) other).subject());
    }
}

// Enum for FictionType
enum FictionType {
    Tragedy,
    Comedy
}

// Interface definition
interface IBook<T> extends Comparable<IBook<T>> {
    // Add any common methods here if needed
}
