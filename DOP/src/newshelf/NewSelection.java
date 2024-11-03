package Bonus;

import java.util.*;

public class NewSelection {

	// TODO: Complete this method 
	/**
	 * 
	 * @param o object
	 * returns if o is not a book, returns empty string, if Comic, returns title, of Fiction
	 * returns name, and if TextBook, returns subject.
	 */
	public static String getAgeOrTitle(Object o) {
		
		// if (o instanceof Comic c) {
		// 	return ((Comic) o).Title();
		// }
		// else if(o instanceof TextBook t){
		// 	return ((TextBook) o).subject();
		// }	
		// else if(o instanceof Fiction f){
		// 	return ((Fiction) o).name();
		// }
		switch(o){
			case Comic(String Title,int ageOfMainCharacter) -> {
				return Title;
			}
			case Fiction(String name,FictionType type) -> {
				return name;
			}
			case TextBook(String subject) -> {
				return subject;
			}
			default -> {
				return null;
			}
		}
		

	}

	public static void main(String[] args) {
		
		// TODO: Write a test code here and execute and text.
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
