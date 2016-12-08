public class Barcode implements Comparable<Barcode>{
    // instance variables
    private String zip;
    private int checkDigit;
    private int digit;
    private String code;

    // constructors
    //precondtion: _zip.length() = 5 and zip contains only digits.
    //postcondition: throws a runtime exception zip is not the correct length
    //or zip contains a non digit
    //_zip and _checkDigit are initialized.
    public Barcode(String zip){

	//Throws an exception if zip isn't a String of 5 ints 
	if((zip.length() != 5) || checkChar(zip)){
	    throw new IndexOutOfBoundsException();
	}
	
	this.zip = zip;
	checkDigit = sumDigit(zip) % 10;
    }

    //sumDigit helper method (sums the digits in zip)
    private int sumDigit(String num){
	int sum = 0;
	for(int p = 0; p < 5; p++){
	    sum = sum + num.charAt(p);
	}
	return sum;
    }

    //checkChar checks for char in zip
    private boolean checkChar(String num){
	for(int p = 0; p < 5; p++){
	    if(Character.isDigit(num.charAt(p))){
		return false;
	    }
	}
	return true;
    }
    
    // postcondition: Creates a copy of a bar code.
    public Barcode clone(){
	String zipCopy = zip;
	Barcode copy = new Barcode(zipCopy);

	return copy;
    }


    // postcondition: computes and returns the check sum for _zip
    private int checkSum(){
	
	return -1;
    }

   
    
    //postcondition: format zip + check digit + Barcode 
    //ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
    public String toString(){
	String bar = "";

	//Switch Block
	switch(digit){
	case 0:  code = "||:::";
	    break;
	case 1:  code = ":::||";
	    break;
	case 2:  code = "::|:|";
	    break;
	case 3:  code = "::||:";
	    break;
	case 4:  code = ":|::|";
	    break;
	case 5:  code = ":|:|:";
	    break;
	case 6:  code = ":||::";
	    break;
	case 7:  code = "|:::|";
	    break;
	case 8:  code = "|::|:";
	    break;
	case 9:  code = "|:|::";
	    break;
	}
	
	for(int p = 0; p < 5; p++){
	    digit = zip.charAt(p);
	    bar = bar + digit;
	}

	digit = checkDigit;
	bar = bar + digit;

	System.out.println(bar);
	
	return bar;
    }


    // postcondition: compares the zip + checkdigit, in numerical order. 
    public int compareTo(Barcode other){

	return -1;
    }

    //MAIN

    public static void main(String[]args){
	Barcode barcode1 = new Barcode("01234");

	barcode1.toString();





	
    }
    
}
