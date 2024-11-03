package Bonus;

public sealed interface IBook<T> extends Comparable<IBook<T>> permits Comic, Fiction, TextBook {
  

    @Override
    int compareTo(IBook<T> other);
}
enum FictionType {

	Comedy,
	Tragedy,
	GoK
}

record Comic(String Title,int ageOfMainCharacter) implements IBook<Integer> {
	
	 @Override
    public int compareTo(IBook<Integer> other) {
        if (other instanceof Comic otherComic) {
            return this.ageOfMainCharacter-otherComic.ageOfMainCharacter;
        }
        return 0; 
    }

}

record Fiction(String name,FictionType type) implements IBook<FictionType> {

	 public int compareTo(IBook<FictionType> other) {
        if (other instanceof Fiction otherFiction) {
            return this.type.compareTo(otherFiction.type); 
        }
        return 0; 

	}
}

record TextBook(String subject) implements IBook<String>{

	@Override
    public int compareTo(IBook<String> other) {
        if (other instanceof TextBook otherTextBook) {
            return this.subject.compareTo(otherTextBook.subject);
        }
        return 0; 
    }
}