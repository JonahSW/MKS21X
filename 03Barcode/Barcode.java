import java.util. *;

public class Barcode implements Comparable<Barcode>{
    // instance variables
    private String zip;
    private int checkDigit;
    public static String[] Reference = {"||:::", ":::||", "::|:|", "::||:", ":|::|", ":|:|:", ":||::", "|:::|", "|::|:", "|:|::"};
    
    // constructors
    //mx/precondtion: _zip.length() = 5 and zip contains only digits.
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
        
	if((sumDigit(code.substring(0, 5)) % 10) == Integer.parseInt(code.substring(5, 6))){
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

	//exception throwers
	if(zip.length() != 5){
	    throw new IllegalArgumentException("zip is the wrong length");
	}
	checkChar(zip);
	

	for(int p = 0; p < 5; p++){
	    bar = bar + Reference[Integer.parseInt(zip.substring(p, p + 1))];
	}

	bar = bar + Reference[checkSum(zip)];

	bar = "|" + bar + "|";
	
	return bar;
    }

    //converts a barcode into a zip string, including the checkDigit
    public static String toZip(String code){
	String bar = "";
	boolean matched = true;

	if(code.length() != 32){
	    throw new IllegalArgumentException("Barcode is wrong length");
	}
	if((code.charAt(0) != '|') || (code.charAt(31) != '|')){
	    throw new IllegalArgumentException("Barcode has bad edges");
	}
	for(int p = 0; p < 32; p++){
	    if((code.charAt(p) != '|') && (code.charAt(p) != ':')){
		System.out.println(code.charAt(p));
		throw new IllegalArgumentException("Barcode has bad characters");
	    }
	}

	//section of toZip that actually creates the zip to be printed out
	for(int p = 1; p < 26; p = p + 5){
	    for(int i = 0; i < 10; i++){
		if(code.substring(p, p + 5).equals(Reference[i])){
		    bar = bar + i;
		    matched = false;
		    i = 10;
		}
		else{
		    matched = true;
		}
	    }
	}

	if(matched){
	    throw new IllegalArgumentException("Barcode does not match any ints");
	}

	int s = -1;

	for(int i = 0; i < 10; i++){
	    if(code.substring(26, 31).equals(Reference[i])){
		s = i;
		//System.out.println(s);
		i = 10;
	    }
	}
		
	if(!(checkDigitChecker(bar + s))){
	    //System.out.println(bar + s);
	    throw new IllegalArgumentException("checkSum of barcode does not match");
	}
	//System.out.println(checkDigitChecker(bar + s));

	    return bar;
	}

	//postcondition: format zip + check digit + Barcode 
	//ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"
    //prints out a barcode
    public java.lang.String toString(){

	System.out.println(zip + checkSum(zip) + "  " + toCode(zip));

	return zip + checkSum(zip) + "  " + toCode(zip);
    }
    


    // postcondition: compares the zip + checkdigit, in numerical order. 
    public int compareTo(Barcode other){
	int first = checkSum(zip);
	int second = checkSum(other.zip());

	if(first == second){
	    return 0;
	}
	
	if(first < second){
	    return -1;
	}

	if(first > second){
	    return  1;
	}

	return 2;
    }

    //MAIN

    public static void main(String[]args){
	
	Barcode barcode6 = new Barcode("01234");

	barcode6.toString();
	System.out.println(toZip(toCode(barcode6.zip())));
	System.out.println(toCode(barcode6.zip()).length());
	System.out.println("___________________________________");

	Barcode barcode2 = new Barcode("54321");

	barcode2.toString();
	System.out.println(toZip(toCode(barcode2.zip())));
	System.out.println("___________________________________");

	Barcode barcode3 = new Barcode("00000");

	barcode3.toString();
	System.out.println(toZip(toCode(barcode3.zip())));
	System.out.println("___________________________________");

	Barcode barcode4 = new Barcode("77777");

	barcode4.toString();
	System.out.println(toZip(toCode(barcode4.zip())));
	System.out.println("___________________________________");

	System.out.println(barcode2.compareTo(barcode2));
	System.out.println(barcode4.compareTo(barcode3));
	
	System.out.println("___________________________________");

	//EXCEPTION TESTING
	System.out.println(Arrays.toString(Reference));
	Barcode barcode1 = new Barcode("12345");
	//Barcode barcode7 = new Barcode("162o02");
	barcode1.toString();
	System.out.println(toCode("12345"));
	//System.out.println(toZip(""));
	System.out.println(toZip(toCode("12345")));

	//System.out.println(toZip(toCode("1232o")));
	System.out.println(toZip(toCode("12344")));
	
	System.out.println(toZip(toCode("00000")));
	
	System.out.println(toZip(toCode("00001")));
	
	System.out.println(toZip("|:::||::|:|:::||::|:|:::||:|:|:|"));
	//System.out.println(toZip("|::||:::|:|:::||::|:|:::||::||:|"));
	

    }
    
}
