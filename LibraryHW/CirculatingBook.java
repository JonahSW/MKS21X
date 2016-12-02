Class CirculatingBook extends LibraryBook{
    private String currentHolder;
    private String dueDate;

    //CirculatingBook constructor
    private CirculatingBook(String author, String title, String isbn, String callNumber, Strign currentHolder, String dueDate){
	this.author = author;
	this.title = title;
	this.isbn = isbn;
	this.callNumber = callNumber;
    }

    //METHODS

    //get method for currentHolder
    private String currentHolder(){
	return currentHolder;
    }

    //get method for dueDate
    private String dueDate(){
	return dueDate;
    }

    //set method for curentholder
    private String setCurrentHolder(String newCurrentHolder){
	String temp = currentHolder;
	currentHolder = newCurrentHolder;

	return temp;
    }

    //set method for dueDate
    private String setDueDate(String newDueDate){
	String temp = dueDate;
	dueDate = newDueDate;

	return temp;
    }
    
    //toString method for CirculatingBook
    public String toString(){
	return super.toString() + '\n' + "Current Holder: " + currentHolder + '\n' + "Due Date: " + dueDate;
    }

    //handles processing when a book is checked out, storing the patron's name and the date the book is due in the fields.
    private void checkout(String patron, String due){
	setCurrentHolder = patron;
	setDueDate = due;
    }

    //handles process when a book is returned (currentHolder and dueDate are set to null)
    private void returned(){
	setCurrentHolder = new String;
	setDueDate = new String;
    }

    //should return the currentHolder's name and due date, if the book has been checked out; or "book available on shelves" if the book is available.
    private String circulationStatus()










}
