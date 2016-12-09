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
	checkDigit = sumDigit() % 10;
    }

    //get method for checkdigit
    public int checkDigit(){
	return checkDigit;
    }
    //get method for zip
    public String zip(){
	return zip;
    }

    //sumDigit returns the sum of all the digits of the zip
    private int sumDigit(){
	int sum = 0;
	for(int p = 0; p < 5; p++){
	    sum = sum + Integer.parseInt(zip.substring(p, p + 1));
	}
	return sum;
    }
    
    //checkChar checks for chars in zip, throws an exception if it finds one
    private void checkChar(String num){
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


    // postcondition: computes and returns the check sum for _zip, ensures zip and checkDigit match
    private static boolean checkSum(Barcode bc){
	if(bc.checkDigit() == bc.sumDigit() % 10){
	    return true;
	}

	return false;
    }


    //converts a zip string into a barcode      
    public static String toCode(String zip){
	String bar = "";

	for(int p = 0; p < 5; p++){
	    bar = bar + Reference[Integer.parseInt(zip.substring(p, p + 1))];
	}

	bar = bar + Reference[checkDigit()];

	bar = "|" + bar + "|";
	
	return bar;
    }

    //converts a barcoe into a zip string
    public static String toZip(String code){
	String bar = "";

	for(int p = 1; p < 31; p = p + 4){
	    for(int i = 0; i < 10; i++){
		if(code.substring(p, p + 5) == Reference[i]){
		    bar = bar + i;
		}
		else{
		    throw new IllegalArgumentException("Bad barcode");
		}
	    }
	}

	return bar;
    }

    //postcondition: format zip + check digit + Barcode 
    //ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"
    //prints out a barcode
    public String toStringCode(){

	System.out.println(toCode(zip));

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
	System.out.println(barcode1.toStringCode().length());

	System.out.println(toZip(toCode(zip())));
	System.out.println("___________________________");
	
	Barcode barcode2 = new Barcode("87623");

	System.out.println(checkSum(barcode2));
	System.out.println(barcode2.sumDigit());
	System.out.println(barcode2.toStringCode().length());

	System.out.println("___________________________");
	
	Barcode barcode3 = new Barcode("00000");

	System.out.println(checkSum(barcode3));
	System.out.println(barcode3.sumDigit());
	System.out.println(barcode3.toStringCode().length());

	System.out.println("___________________________");

	/*
	Barcode barcode4 = new Barcode("000000");

	System.out.println(checkSum(barcode4));
	System.out.println(barcode4.sumDigit());
	System.out.println(barcode4.toStringCode().length());
	System.out.println(barcode4.toStringZip().length());

	System.out.println("___________________________");
	*/

	Barcode barcode5 = new Barcode("093h3");

	System.out.println("___________________________");
	System.out.println(checkSum(barcode5));
	System.out.println(barcode5.sumDigit());
	System.out.println(barcode5.toStringCode().length());

	
    }
    
}
