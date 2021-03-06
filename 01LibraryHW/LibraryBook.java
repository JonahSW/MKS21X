public abstract class LibraryBook extends Book implements Comparable<LibraryBook>{
    String callNumber;

    //null constructor
    public LibraryBook(){
    }

    //LibraryBook Constructor
    public LibraryBook(String author, String title, String isbn, String callNumber){
	setAuthor(author);
	setTitle(title);
	setISBN(isbn);
	setCallNumber(callNumber);
    }

    //METHODS

    //get method for callNumber
    public String callNumber(){
	return callNumber;
    }

    //set method for callNumber, returns original value for callNumber
    public String setCallNumber(String newCallNumber){
	String temp = newCallNumber;
	callNumber = newCallNumber;

	return temp;
    }

    //toString method for LibraryBook
    public String toString(){
	return super.toString() + '\n' + "Call Number: " + callNumber;
    }

    //compareTo allows comparison/ordering of library books by callNumber, following the format of Java's Comparable interface
    //returns -2 if nothing else works
    public int compareTo(LibraryBook book){
	//System.out.println("hi");
	if(callNumber.compareTo(book.callNumber) == 0){
	    return 0;
	}
	
	if(callNumber.compareTo(book.callNumber) < 0){
	    return -1;
	}

	if(callNumber.compareTo(book.callNumber) > 0){
	    return 1;
	}

	return -2;
    }
    
    //Abstract methods
    abstract void checkout(String patron, String due);
    abstract void returned();
    abstract String circulationStatus();
 
}
