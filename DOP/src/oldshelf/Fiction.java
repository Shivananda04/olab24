package oldshelf;

public class Fiction extends Book {

	/* TODO: Add most strict modifiers here*/ private final String name;
	// TODO: change 
	/**
	 * type is  a per instance object and it is initialized only once.
	 * 
	 */
	private final FictionType type;
	public Fiction(String title,FictionType t) {
		super();
		this.name = title;
		this.type = t;
		// TODO  correct the above.
	}
	public String getName(){
		return this.name;
	}

}
