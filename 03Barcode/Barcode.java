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

	checkChar(zip);
	
	this.zip = zip;
	checkDigit = checkSum(zip);
    }

    //get method for checkdigit
    public int checkDigit(){
	return checkDigit;
    }
    //get method for zip
    public String zip(){
	return zip;
    }

    //sumDigit sums the digits of a 5 char string
    private static int sumDigit(String zip){

	checkChar(zip);
	
	int sum = 0;
	for(int p = 0; p < 5; p++){
	    sum = sum + Integer.parseInt(zip);
	}

	return sum;
    }

    //checkDigitChecker returns true if the zip and checkdigit match
    private static boolean checkDigitChecker(String code){
        
	if(sumDigit(code.substring(0, 5)) == Integer.parseInt(code.substring(5, 5))){
	    return true;
	}

	return false;
    }
    
    //checkChar checks for chars in zip, throws an exception if it finds one
    private static void checkChar(String num){
	for(int p = 0; p < 5; p++){
	    if(!Character.isDigit(num.charAt(p))){
		throw new IllegalArgumentException("zip must contain only ints");
	    }
	}
    }
    
    // postcondition: Creates a copy of a bar code.
    public Barcode clone(){
	String zipCopy = zip;
	Barcode copy = new Barcode(zipCopy);

	return copy;
    }


    // postcondition: computes and returns the check sum for _zip
    private static int checkSum(String code){        
	return sumDigit(code) % 10;
    }


    //converts a zip string of length 5 into a barcode      
    public static String toCode(String zip){
	String bar = "";

	for(int p = 0; p < 5; p++){
	    bar = bar + Reference[Integer.parseInt(zip.substring(p, p))];
	}

	bar = bar + Reference[checkSum(zip)];

	bar = "|" + bar + "|";
	
	return bar;
    }

    //converts a barcoe into a zip string
    public static String toZip(String code){
	String bar = "";
	boolean matched = false;
	
	for(int p = 1; p < 26; p = p + 5){
	    for(int i = 0; i < 10; i++){
		if(code.substring(p, p + 5).equals(Reference[i])){
		    bar = bar + i;
		    matched = true;
		}
		
	    }
	}

        if(!checkDigitChecker(bar)){
	    throw new IllegalArgumentException("zip and checksum don't match");
	}

	return bar;
    }

    //postcondition: format zip + check digit + Barcode 
    //ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"
    //prints out a barcode
    public java.lang.String toString(){

	System.out.println(zip + "  " + toCode(zip));

	return zip + "  " + toCode(zip);
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
