abstract Class LibraryBook extends Book implements Comparable<LibraryBook>{
    String callNumber;

    //null constructor
    private LibraryBook();

    //LibraryBook Constructor
    private LibraryBook(String author, String title, String isbn, String callNumber){
	this.author = author;
	this.title = title;
	this.isbn = isbn;
	this.callNumber = callNumber;
    }

    //METHODS

    //get method for callNumber
    private String callNumber(){
	return callNumber;
    }

    //set method for callNumber, returns original value for callNumber
    private String setCallNumber(String newCallNumber){
	String temp = newCallNumber;
	callNumber = newCallNumber;

	return temp;
    }

    //toString method for LibraryBook
    private String toString(){
	return super.toString() + '\n' + "Call Number: " + callNumber;
    }

    //compareTo allows comparison/ordering of library books by callNumber, following the format of Java's Comparable interface
    
    //Abstract methods
    abstract void checkout(String patron, String due);
    abstract void returned();
    abstract String circulationStatus();

    
}