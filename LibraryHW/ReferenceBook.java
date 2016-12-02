Class ReferenceBook extends LibraryBook{
    String collection;

    //ReferenceBook constructor
    public ReferenceBook(String author, String title, String isbn, String callNumber, String collection){
	this.author = author;
	this.title = title;
	this.isbn = isbn;
	this.callNumber = callNumber;
	this.collection = collection;
    }

    //METHODS

    //get method for collection
    private String collection(){
	return collection;
    }
    

    //set method for collection, returns original value for collection
    private String setCollection(String newCollection){
	String temp = newCollection;
	collection = newCollection;

	return temp;
    }

    //toString method for ReferenceBook
    public String toString(){
	return super.toString() + '\n' + "Collection: " + collection;
    }

    //tells the user they cannot check out a reference book
    private void checkout(){
	System.out.println("You cannot check out a reference book!");
    }

    //tells teh user a reference book cannot be returned
    private void returned(){
	System.out.println("This reference book could not have been checked out -- return is impossible");
    }

    //tells the user the book's circulation status
    private String circulationStatus(){
	System.out.println("Non-circulating reference book.");
    }




}
