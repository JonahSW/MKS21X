public class Barcode implements Comparable<Barcode>{
    // instance variables
    private String zip;
    private int checkDigit;
    public static String[] Reference = {"||:::", ":::||", "::|:|", "::||:", ":|::|", ":|:|:", ":||::", "|:::|", "|::|:", "|:|::"};
    
    // constructors
    //precondtion: _zip.length() = 5 and zip contains only digits.
    //postcondition: throws a runtime exception zip is not the correct length
    //or zip contains a non digit
    //_zip and _checkDigit are initialized.
    public Barcode(String zip){

	//Throws an exception if zip isn't a String of 5 ints 
	if(zip.length() != 5){
	    throw new IndexOutOfBoundsException("Arg is wrong length");
	}
	if(checkChar(zip)){
	    throw new IndexOutOfBoundsException("Arg must contain only ints");
	}
	
	this.zip = zip;
	checkDigit = sumDigit() % 10;
    }

    //get method for checkdigit
    public int checkDigit(){
	return checkDigit;
    }

    //sumDigit returns the sum of all the digits of the zip
    private int sumDigit(){
	int sum = 0;
	for(int p = 0; p < 5; p++){
	    sum = sum + Integer.parseInt(zip.substring(p, p + 1));
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


    // postcondition: computes and returns the check sum for _zip, ensures zip and checkDigit match
    private static boolean checkSum(Barcode bc){
	if(bc.checkDigit() == bc.sumDigit() % 10){
	    return true;
	}

	return false;
    }


    //converts a zip string into a barcode      
    public String toCode(){
	String bar = "";

	for(int p = 0; p < 5; p++){
	    bar = bar + Reference[Integer.parseInt(zip.substring(p, p + 1))];
	}

	bar = bar + Reference[checkDigit];

	bar = "|" + bar + "|";
	
	return bar;
    }

    //converts a barcoe into a zip string
    public String toZip(){

	return "unwritten";
    }

    //postcondition: format zip + check digit + Barcode 
    //ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"
    //prints out a barcode
    public String toString(){

	System.out.println(toCode());

	return toCode();
    }


    // postcondition: compares the zip + checkdigit, in numerical order. 
    public int compareTo(Barcode other){

	return -1;
    }

    //MAIN

    public static void main(String[]args){
	Barcode barcode1 = new Barcode("01234");

	System.out.println(checkSum(barcode1));
	System.out.println(barcode1.sumDigit());
	System.out.println(barcode1.toString().length());

	System.out.println("___________________________");
	
	Barcode barcode2 = new Barcode("87623");

	System.out.println(checkSum(barcode2));
	System.out.println(barcode2.sumDigit());
	System.out.println(barcode2.toString().length());

	System.out.println("___________________________");
	
	Barcode barcode3 = new Barcode("00000");

	System.out.println(checkSum(barcode3));
	System.out.println(barcode3.sumDigit());
	System.out.println(barcode3.toString().length());

	System.out.println("___________________________");

	Barcode barcode4 = new Barcode("093h3");

	System.out.println(checkSum(barcode4));
	System.out.println(barcode4.sumDigit());
	System.out.println(barcode4.toString().length());

	
    }
    
}
