public class Barcode implements Comparable<Barcode>{
    // instance variables
    private String _zip;
    private int _checkDigit;
    private int digit;
    private String code;

    // constructors
    //precondtion: _zip.length() = 5 and zip contains only digits.
    //postcondition: throws a runtime exception zip is not the correct length
    //               or zip contains a non digit
    //               _zip and _checkDigit are initialized.
    public Barcode(String zip){
	this.zip = zip;
	
    }

    // postcondition: Creates a copy of a bar code.
    public Barcode clone(){

    }


    // postcondition: computes and returns the check sum for _zip
    private int checkSum(){

    }

    //postcondition: format zip + check digit + Barcode 
    //ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
    public String toString(){

    }


    // postcondition: compares the zip + checkdigit, in numerical order. 
    public int compareTo(Barcode other){

    }

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
    
}
