public class Book{
    private String author;
    private String title;

    //format XXX-X-XX-XXXXXX-X
    private String isbn;

    //null constructor
    public Book(){
    }

    //constructor accepts parameters
    public Book(String author, String title, String isbn){
	this.author = author;
	this.title = title;
	this.isbn = isbn;
    }

    //METHODS
    
    //get method for author
    public String author(){
	return author;
    }

    //get method for title
    public String title(){
	return title;
    }
    //get method for isbn
    public String isbn(){
	return isbn;
    }

    //set method for author, returns original value for author
    public  String setAuthor(String newAuthor){
	String temp = author;
	author = newAuthor;

	return temp;
    }

    //set method for title, returns original value for title
    public String setTitle(String newTitle){
	String temp = title;
	title = newTitle;

	return temp;
    }

    //set method for isbn, returns original value for isbn
    public String setISBN(String newISBN){
	String temp = isbn;
	isbn = newISBN;

	return temp;
    }

    //toString method for Book
    public String toString(){
	return "Title: " + title + '\n' + "Author: " + author + '\n' + "ISBN: " + isbn;
    }

	
}
