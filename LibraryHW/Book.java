public class Book{
    private String author;
    private String title;

    //format XXX-X-XX-XXXXXX-X
    private String isbn;

    //null constructor
    private Book(){
    }

    //constructor accepts parameters
    private Book(String author, String title, String isbn){
	this.author = author;
	this.title = title;
	this.isbn = isbn;
    }

    //METHODS
    
    //get method for author
    private String author(){
	return author;
    }

    //get method for title
    private String title(){
	return title;
    }
    //get method for isbn
    private String isbn(){
	return isbn;
    }

    //set method for author, returns original value for author
    private String setAuthor(String newAuthor){
	String temp = author;
	author = newAuthor;

	return temp;
    }

    //set method for title, returns original value for title
    private String setTitle(String newTitle){
	String temp = title;
	title = newTitle;

	return temp;
    }

    //set method for isbn, returns original value for isbn
    private String setISBN(String newISBN){
	String temp = isbn;
	isbn = newISBN;

	return temp;
    }

    //toString method for Book
    private String toString(){
	return "Title: " + title + '\n' + "Author: " + author + '\n' + "ISBN: " + isbn;
    }

	
}