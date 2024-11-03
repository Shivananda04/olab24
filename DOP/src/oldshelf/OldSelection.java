package oldshelf;

public class OldSelection {

	// TODO: Complete this method.
	/**
	 * 
	 * @param o object
	 * returns if o is not a book, returns empty string, if Comic, returns title, of Fiction
	 * returns name, and if TextBook, returns subject.
	 */
	public static String getAgeOrTitle(Object o) {
		
		if (o instanceof Book) {
			// if(o instanceof Comic) return ((Comic)o).getTitle();
			// else if(o instanceof Fiction) return ((Fiction)o).getName();
			// else if(o instanceof TextBook) return ((TextBook)o).getSubject();
			switch (o) {
				case Comic c -> {return c.getTitle();}
				case Fiction f -> {return f.getName();}
				case TextBook t -> {return t.getSubject();}
				default -> throw new AssertionError();
			}
		}
		return null;
	}

	public static void main(String[] args) {
		
		// TODO: Write a test code here and execute and text.
		TextBook t = new TextBook("Biology");
		System.out.println(getAgeOrTitle(t));
		Fiction f = new Fiction("Harry Potter",FictionType.GoK);
		System.out.println(getAgeOrTitle(f));
		Comic c = new Comic("Avenger's SECRET WARS", 54);
		System.out.println(getAgeOrTitle(c));
	}
}
