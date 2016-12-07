//Stringy Ordered SuperArray

public class StringyOrderedSuperArray extends StringySuperArray{

    //CONSTRUCTORS
    //Same as original SuperArray() Constructor
    public StringyOrderedSuperArray(){
	super();
    }
    
    //Same as original SuperArray(initCap)  Constructor
    public StringyOrderedSuperArray(int initCap){
	super(initCap);
    }

    //New OrderedSuperArray constructor
    //Takes an array, and orders it according to the add function
    public StringyOrderedSuperArray(String[] ary){
	String[] ordered = new String[ary.length];
	
	for(int p = 0; p < size(); p++){
	    add(data(p));
	}

	ary = ordered;
    }

    
    //METHODS
    //Add and set indexes are overriden because they change the order of the
    //elements of the OrderedSuperArray
    
    //set(int index, int element) throws an UnsupportedOperationException
    public String set(int index, String element){

	    throw new UnsupportedOperationException();

    }

    //add(int index, int element)
    //throw an UnsupportedOperationException
    public void add(int index, String element){

	    throw new UnsupportedOperationException();

    }
    

    //add/order method -> add (int element) 
    //Adds the element to the proper place in the OrderedSuperArray
    public boolean add(String newelement){
	
	int size1 = size();
	boolean a = true;

	for(int p = 0; p < size1; p++){
	    if(data(p).compareTo(newelement) >= 0){
		super.add(p, newelement);
		a = false;
		p = size1;
	    }
	}

	if(a){
	    super.add(size1, newelement);
	}

	return a;
    }


    //MAIN
    public static void main(String[]args){

	//SUPERARRAY TESTS
	StringySuperArray supry1 = new StringySuperArray();
	StringySuperArray supry2 = new StringySuperArray(5);
	StringySuperArray supry3 = new StringySuperArray(1);
	StringySuperArray supry4 = new StringySuperArray(10);
	StringySuperArray supry5 = new StringySuperArray(0);

	
	//test add(int n), toStringDebug(), toString(),  size()
	/*

	//supry1.grow();
	//System.out.println(supry1.toStringDebug());
	
	//supry1;
	System.out.println(supry1.toStringDebug());
	System.out.println(supry1.toString());
	System.out.println(supry1.size());
	supry1.add("A");
	System.out.println(supry1.size());
	//System.out.println(supry1.data(0));
	System.out.println(supry1.toStringDebug());
	System.out.println(supry1.toString());
	
	supry1.add("B");
	System.out.println(supry1.toStringDebug());
	System.out.println(supry1.toString());
	System.out.println(supry1.size());
	supry1.add("C");
	System.out.println(supry1.toStringDebug());
	System.out.println(supry1.toString());
	System.out.println(supry1.size());
	supry1.add("D");
	System.out.println(supry1.toStringDebug());
	System.out.println(supry1.toString());
	System.out.println(supry1.size());
       	supry1.add("E");
	System.out.println(supry1.toStringDebug());
	System.out.println(supry1.toString());
	System.out.println(supry1.size());
       	supry1.add("F");
	System.out.println(supry1.toStringDebug());
	System.out.println(supry1.toString());
	System.out.println(supry1.size());
	System.out.println(supry1.length());

	//System.out.println("__________________________________________");
	
       	supry1.add("G");
	System.out.println(supry1.toStringDebug());
	System.out.println(supry1.toString());
	System.out.println(supry1.size());
       	supry1.add("H");
	System.out.println(supry1.toStringDebug());
	System.out.println(supry1.toString());
	System.out.println(supry1.size());
       	supry1.add("I");
	System.out.println(supry1.toStringDebug());
	System.out.println(supry1.toString());
	System.out.println(supry1.size());
	System.out.println(supry1.length());

	
       	supry1.add("J");
	
	System.out.println(supry1.toStringDebug());
	System.out.println(supry1.toString());
	System.out.println(supry1.size());
	System.out.println(supry1.length());

	System.out.println("__________________________________________");

	//System.out.println(supry1.get(5));
	//System.out.println(supry1.get(2));
	//System.out.println(supry1.get(9));
	//System.out.println(supry1.get(0));
	//System.out.println("________________________________________");	
       	supry1.add("K");
	//System.out.println("________________________________________");	
	//System.out.println(supry1.get(5));
	//System.out.println(supry1.get(2));
	//System.out.println(supry1.get(9));
	//System.out.println(supry1.get(0));

	//System.out.println("---------------");
	
	System.out.println(supry1.toStringDebug());
	System.out.println(supry1.toString());
	System.out.println(supry1.size());
	System.out.println(supry1.length());
       	supry1.add("L");
	System.out.println(supry1.toStringDebug());
	System.out.println(supry1.toString());
	System.out.println(supry1.size());
	System.out.println(supry1.length());
       	supry1.add("M");
	System.out.println(supry1.toStringDebug());
	System.out.println(supry1.toString());
	System.out.println(supry1.size());
	System.out.println(supry1.length());
	
	System.out.println("__________________________________________");

	///*
	//supry2
	System.out.println(supry2.toStringDebug());
	System.out.println(supry2.toString());
	System.out.println(supry2.size());
	System.out.println(supry2.length());
	supry2.add("A");
	System.out.println(supry2.toStringDebug());
	System.out.println(supry2.toString());
	System.out.println(supry2.size());
	supry2.add("B");
	System.out.println(supry2.toStringDebug());
	System.out.println(supry2.toString());
	System.out.println(supry2.size());
	supry2.add("C");
	System.out.println(supry2.toStringDebug());
        System.out.println(supry2.toString());
	System.out.println(supry2.size());
	System.out.println(supry2.length());
	supry2.add("D");
	System.out.println(supry2.toStringDebug());
        System.out.println(supry2.toString());
	System.out.println(supry2.size());
	supry2.add("E");
	System.out.println(supry2.toStringDebug());
        System.out.println(supry2.toString());
	System.out.println(supry2.size());
	supry2.add("F");
	System.out.println(supry2.toStringDebug());
        System.out.println(supry2.toString());
	System.out.println(supry2.size());
	System.out.println(supry2.length());
	supry2.add("G");
	System.out.println(supry2.toStringDebug());
        System.out.println(supry2.toString());
	System.out.println(supry2.size());
	System.out.println(supry2.length());

	supry2.add("H");
	supry2.add("I");
	supry2.add("J");
	supry2.add("K");
	supry2.add("L");
	supry2.add("M");
	supry2.add("N");
	supry2.add("O");
	supry2.add("P");
	supry2.add("Q");
	supry2.add("R");
	supry2.add("S");
	supry2.add("T");
	supry2.add("U");

	System.out.println(supry2.toStringDebug());
        System.out.println(supry2.toString());
	System.out.println(supry2.size());
	System.out.println(supry2.length());
	
	System.out.println("__________________________________________");

	//supry3
	System.out.println(supry3.toStringDebug());
        System.out.println(supry3.toString());
	System.out.println(supry3.size());
	supry3.add("A");
	System.out.println(supry3.toStringDebug());
        System.out.println(supry3.toString());
	System.out.println(supry3.size());
	supry3.add("B");
	System.out.println(supry3.toStringDebug());
        System.out.println(supry3.toString());
	System.out.println(supry3.size());
	supry3.add("C");
	System.out.println(supry3.toStringDebug());
        System.out.println(supry3.toString());
	System.out.println(supry3.size());
	
	System.out.println("__________________________________________");

	//supry4
	System.out.println(supry4.toStringDebug());
        System.out.println(supry4.toString());
	System.out.println(supry4.size());
	supry4.add("A");
	System.out.println(supry4.toStringDebug());
        System.out.println(supry4.toString());
	System.out.println(supry4.size());
	supry4.add("B");
	System.out.println(supry4.toStringDebug());
        System.out.println(supry4.toString());
	System.out.println(supry4.size());
	supry4.add("C");
	System.out.println(supry4.toStringDebug());
        System.out.println(supry4.toString());
	System.out.println(supry4.size());
	supry4.add("D");
	System.out.println(supry4.toStringDebug());
        System.out.println(supry4.toString());
	System.out.println(supry4.size());
	supry4.add("E");
	System.out.println(supry4.toStringDebug());
        System.out.println(supry4.toString());
	System.out.println(supry4.size());
	supry4.add("F");
	System.out.println(supry4.toStringDebug());
        System.out.println(supry4.toString());
	System.out.println(supry4.size());
	supry4.add("G");
	System.out.println(supry4.toStringDebug());
        System.out.println(supry4.toString());
	System.out.println(supry4.size());
	
	System.out.println("__________________________________________");

	//supry5
	System.out.println(supry5.toStringDebug());
        System.out.println(supry5.toString());
	System.out.println(supry5.size());
	supry5.add("A");
	System.out.println(supry5.toStringDebug());
        System.out.println(supry5.toString());
	System.out.println(supry5.size());
	supry5.add("B");
	System.out.println(supry5.toStringDebug());
        System.out.println(supry5.toString());
	System.out.println(supry5.size());
	supry5.add("C");
	System.out.println(supry5.toStringDebug());
        System.out.println(supry5.toString());
	System.out.println(supry5.size());
	
	//*/
	//*/

	/*
	//test length()
	System.out.println(supry5.toStringDebug());
	System.out.println(supry5.length());

	System.out.println(supry2.toStringDebug());
	System.out.println(supry2.length());

	System.out.println(supry1.toStringDebug());
	System.out.println(supry1.length());
	supry1.add("A");
	System.out.println(supry1.toStringDebug());
	System.out.println(supry1.length());
	supry1.add("B");
	supry1.add("C");
	supry1.add("D");
	supry1.add("E");
	System.out.println(supry1.toStringDebug());
	System.out.println(supry1.length());
	supry1.add("F");
	supry1.add("G");
	supry1.add("H");
	System.out.println(supry1.toStringDebug());
	System.out.println(supry1.length());

	supry1.trimToSize();
	System.out.println(supry1.toStringDebug());
	System.out.println(supry1.length());

	supry5.trimToSize();
	System.out.println(supry5.toStringDebug());
	System.out.println(supry5.length());
	*/
	
	//Additional tests for the functions tested above
	//testing grow()
	/*
	supry1.grow();
	supry2.grow();
	supry3.grow();
	supry4.grow();
	supry5.grow();
	System.out.println(supry1.toStringDebug());
	System.out.println(supry1.length());
	System.out.println(supry2.toStringDebug());
	System.out.println(supry2.length());
	System.out.println(supry3.toStringDebug());
	System.out.println(supry3.length());
	System.out.println(supry4.toStringDebug());
	System.out.println(supry4.length());
	System.out.println(supry5.toStringDebug());
	System.out.println(supry5.length());
	*/

	/*
	//testing get(int index)
	
	//System.out.println(supry1.get(0));
	//System.out.println(supry1.get(-1));
	//System.out.println(supry2.get(0));
	//System.out.println(supry3.get(0));
	//System.out.println(supry4.get(0));
	//System.out.println(supry5.get(0));
	supry1.add("A");
	supry2.add("W");
	supry3.add("R");
	supry4.add("J");
	supry5.add("Q");
	System.out.println(supry1.get(0));
	System.out.println(supry2.get(0));
	System.out.println(supry3.get(0));
	System.out.println(supry4.get(0));
	System.out.println(supry5.get(0));

	supry1.add("B");
        supry2.add("G");
        supry3.add("K");
        supry4.add("Z");
        supry5.add("X");
	System.out.println(supry1.get(1));
	System.out.println(supry2.get(1));
	System.out.println(supry3.get(1));
	System.out.println(supry4.get(1));
	System.out.println(supry5.get(1));

	//System.out.println(supry2.get(2));
	//System.out.println(supry2.get(4));
	//System.out.println(supry2.get(5));
	//System.out.println(supry2.get(6));
	
	supry2.add("V");
	supry2.add("T");
	supry2.add("C");
	supry2.add("G");
	supry2.add("E");
	System.out.println(supry2.get(2));
	System.out.println(supry2.get(3));
	System.out.println(supry2.get(4));
	System.out.println(supry2.get(5));
	System.out.println(supry2.get(6));
	//System.out.println(supry2.get(7));
	*/

	//test clear()
	/*
	supry1.clear();
	System.out.println(supry1.toStringDebug());

	supry2.clear();
	System.out.println(supry2.toStringDebug());

	supry3.clear();
	System.out.println(supry3.toStringDebug());

	supry4.clear();
	System.out.println(supry4.toStringDebug());

	supry5.clear();
	System.out.println(supry5.toStringDebug());

	System.out.println("__________________________________________");
	
	supry1.add("d");
	supry1.clear();
	System.out.println(supry1.toStringDebug());
	supry1.add("f");
	supry1.add("d");
	supry1.add("f");
	supry1.add("v");
	supry1.add("F");
	supry1.add("D");
	supry1.add("G");
	supry1.add("N");
	supry1.add("C");
	supry1.add("x");
	supry1.add("g");
	System.out.println(supry1.toStringDebug());
	supry1.clear();
	System.out.println(supry1.toStringDebug());

	supry2.add("f");
	supry2.add("n");
	supry2.add("f");
	supry2.add("c");
	supry2.add("z");
	supry2.add("q");
	System.out.println(supry2.toStringDebug());
	supry2.clear();
	System.out.println(supry2.toStringDebug());

	supry5.add("c");
	supry5.add("m");
	supry5.add("x");
	supry5.add("f");
	supry5.add("l");
	supry5.add("p");
	System.out.println(supry5.toStringDebug());
	supry5.clear();
	System.out.println(supry5.toStringDebug());

	System.out.println("__________________________________________");
	
	supry5.add("c");
	supry5.add("m");
	supry5.add("x");
	supry5.add("f");
	supry5.add("l");
	supry5.add("p");
	supry5.add("c");
	supry5.add("m");
	supry5.add("x");
	supry5.add("f");
	supry5.add("l");
	supry5.add("p");
	supry5.add("c");
	supry5.add("m");
	supry5.add("x");
	supry5.add("f");
	supry5.add("l");
	supry5.add("l");
	supry5.add("l");
	supry5.add("p");
	System.out.println(supry5.toStringDebug());
	supry5.clear();
	System.out.println(supry5.toStringDebug());
	*/

	//test isEmpty()
	/*
	System.out.println(supry1.isEmpty());
	System.out.println(supry2.isEmpty());
	System.out.println(supry3.isEmpty());
	System.out.println(supry4.isEmpty());
	System.out.println(supry5.isEmpty());

	System.out.println("__________________________________________");

	supry1.add("F");
	supry2.add("t");
	supry3.add("k");
	supry4.add("j");
	supry5.add("f");

        System.out.println(supry1.isEmpty());
	System.out.println(supry2.isEmpty());
	System.out.println(supry3.isEmpty());
	System.out.println(supry4.isEmpty());
	System.out.println(supry5.isEmpty());

	System.out.println("__________________________________________");
	
	supry2.add("n");
	supry2.add("e");
	supry2.add("w");
	supry2.add("e");
	supry2.add("s");
	supry2.add("d");

	System.out.println(supry2.isEmpty());
	supry2.clear();
	System.out.println(supry2.isEmpty());

	supry1.clear();
	supry5.clear();
	System.out.println(supry1.isEmpty());
	System.out.println(supry5.isEmpty());
	*/

	//test set(int index, int element)
	/*
	//supry1.set("f", "d");
	//System.out.println(supry1.get(0));
	supry2.add("w");
	supry2.add("");
	supry2.add("p");
	supry2.set(0, "d");
	System.out.println(supry2.set(2, "S"));
	System.out.println(supry2.get(2));

	System.out.println("__________________________________________");

	supry1.add("12");
	System.out.println(supry1.get(0));
	//supry1.set(2, "Z");
	System.out.println(supry1.set(0, "fff"));
	System.out.println(supry1.get(0));

	System.out.println("__________________________________________");

	//supry5.set(0, "G");
	//supry5.set(1, "S");
	//supry5.set(2, "v");
	
	supry4.add("sdasd");
        supry4.add("sdasd");
	supry4.add("sdasd");
	supry4.add("sdasd");
	supry4.add("sdasd");
	supry4.add("sdasd");
	supry4.add("sdasd");
	supry4.add("sdasd");
	supry4.add("sdasd");
	supry4.add("sdasd");
	supry4.add("sdasd");
	supry4.add("sdasd");
	supry4.add("sdasd");
	supry4.add("sdasd");;
	System.out.println(supry4.get(9));
	System.out.println(supry4.size());
	//supry4.set(9, "4");
	System.out.println(supry4.set(9, "42"));
	System.out.println(supry4.get(9));

	System.out.println(supry4.toStringDebug());
	System.out.println(supry4.set(13, "gamma"));
	System.out.println(supry4.get(13));
	System.out.println(supry4.toStringDebug());
	*/

	/*
	//test add(int index, int element)
	supry2.add("f");
	supry2.add("65");
	supry2.add("9");
	supry2.add("45");
	supry2.add("32");
	supry2.add("32");
	System.out.println(supry2.toStringDebug());
	supry2.add("d6");
	System.out.println(supry2.toStringDebug());
	supry2.add(5, "dewe55e");
	System.out.println(supry2.toStringDebug());
	supry2.add(2, "fs'");
	System.out.println(supry2.toStringDebug());
	supry2.grow();
	supry2.add(3, "ff");
	System.out.println(supry2.size());
	System.out.println(supry2.toStringDebug());
	supry2.add(4, "44");
	System.out.println(supry2.toStringDebug());
	supry2.add(1, "?????????");
	System.out.println(supry2.toStringDebug());
	supry2.add(0, "?????????");
	System.out.println(supry2.toStringDebug());

	System.out.println("__________________________________________");

	supry5.add("66");
	supry5.add("eaw2");
	supry5.add("sefs");
	supry5.add("da");
	System.out.println(supry5.toStringDebug());
	supry5.add(2, "rr");
	System.out.println(supry5.toStringDebug());
	supry5.add(3, "ff");
	System.out.println(supry5.toStringDebug());
	//supry5.add(6, "888");
	System.out.println(supry5.toStringDebug());
	
	supry2.add("69");
	supry2.add("6]sf9");
	supry2.add("6s9");
	supry2.add("69sdf");
	supry2.add("6sssss9");
	supry2.add(3, "wra111");
	supry2.add("g69");
	System.out.println(supry2.toStringDebug());

	*/

	/*
	//test remove(int index);
	supry1.add("42");
	supry1.add("42");
	supry1.add("4o2");
	supry1.add(1, "4seffd");
	supry1.add("4sdf2");
	supry1.add(3, "2");
	System.out.println(supry1.toStringDebug());
	System.out.println(supry1.remove(3));
	System.out.println(supry1.toStringDebug());
	System.out.println(supry1.remove(4));
	System.out.println(supry1.toStringDebug());

	System.out.println("__________________________________________");

	supry2.add("asdfsfsdfsdw23");
	supry2.add("asdfsfsdfsdw23");
	supry2.add("asdfsfsdfsdw23");
	System.out.println(supry2.remove(2));
	supry2.add("aw23");
	supry2.add("9");
	supry2.add("sf.23");
	supry2.add("23sfsd");
	supry2.add(2, "3SDAJFGJHDHJFGJ");
	supry2.add("9efs");
	System.out.println(supry2.toStringDebug());
	System.out.println(supry2.remove(0));
	System.out.println(supry2.toStringDebug());
        
	System.out.println("__________________________________________");

	supry5.add("s2");
	supry5.add("3sa");
	supry5.add("ds8");
	System.out.println(supry5.toStringDebug());
	System.out.println(supry5.remove(2));
	System.out.println(supry5.toStringDebug());
	supry5.add("4");
	supry5.add("5");
	supry5.add("6");
	System.out.println(supry5.toStringDebug());
	System.out.println(supry5.remove(4));
	System.out.println(supry5.toStringDebug());
	supry5.add("6");
	supry5.add("7adsa");
	supry5.add("7adsa");
	supry5.add("7adsa");
	System.out.println(supry5.toStringDebug());
	System.out.println(supry5.remove(6));
	System.out.println(supry5.toStringDebug());

	System.out.println("__________________________________________");

	supry4.add("A");
	supry4.add("B");
	supry4.add("C");
	supry4.add("D");
	supry4.add("E");
	supry4.add("F");
	supry4.add("G");
	supry4.add("H");
	supry4.add("I");
	supry4.add("J");

	System.out.println(supry4.toStringDebug());
	System.out.println(supry4.remove(0));
	System.out.println(supry4.toStringDebug());
	supry4.add(0, "A");
	supry4.add("K");
	System.out.println(supry4.toStringDebug());
	System.out.println(supry4.remove(10));
	System.out.println(supry4.toStringDebug());
	supry4.add("L");
	supry4.add("M");
	System.out.println(supry4.toStringDebug());
	System.out.println(supry4.remove(11));
	System.out.println(supry4.toStringDebug());
	System.out.println(supry4.remove(5));
	System.out.println(supry4.toStringDebug());
	*/
	
	/*
	//test toArray
	supry2.toArray();
	supry2.add("3");
	supry2.add("-5");
	System.out.println(supry2.toArray());
	supry2.add(1, "-92");
	supry2.add("16");
	//supry2.remove(3);
	supry2.toArray();
	System.out.println(supry2.toStringDebug());
	*/

	/*
	//test indexOf

	System.out.println(supry2.indexOf("A"));
	supry2.add("A");
	supry2.add("A");
	supry2.add("A");
	System.out.println(supry2.indexOf("A"));
	System.out.println(supry2.toStringDebug());
	supry2.add("A");
	supry2.add("A");
	supry2.add("B");
	System.out.println(supry2.toStringDebug());
	System.out.println(supry2.indexOf("B"));
	System.out.println(supry2.indexOf("C"));

	System.out.println("__________________________________________");
	
	supry4.add("A");
	supry4.add("B");
	supry4.add("C");
	System.out.println(supry4.toStringDebug());
	System.out.println(supry4.indexOf("C"));
	supry4.add("D");
	supry4.add("E");
	System.out.println(supry4.toStringDebug());
	System.out.println(supry4.indexOf("B"));
	supry4.add("F");
	supry4.add("G");
	System.out.println(supry4.toStringDebug());
	System.out.println(supry4.indexOf("G"));

	System.out.println("__________________________________________");

	supry1.add("DF");
	supry1.add("DG");
	supry1.add("DH");
	supry1.add("DI");
	supry1.add("DJ");
	supry1.add("DK");
	supry1.add("DL");
	supry1.add("DM");
	supry1.add("DN");
	supry1.add("DO");
	System.out.println(supry1.toStringDebug());
	System.out.println(supry1.indexOf("DF"));
	System.out.println(supry1.indexOf("DO"));

	supry1.add("DP");

	System.out.println(supry1.indexOf("DP"));
	
	*/

	/*
	//test lastIndexOf

	System.out.println(supry2.lastIndexOf("A"));
	supry2.add("A");
	supry2.add("A");
	supry2.add("A");
	System.out.println(supry2.toStringDebug());
	System.out.println(supry2.lastIndexOf("A"));
	supry2.add("A");
	supry2.add("A");
	supry2.add("B");
	supry2.add("A");
	System.out.println(supry2.toStringDebug());
	System.out.println(supry2.lastIndexOf("B"));
	System.out.println(supry2.lastIndexOf("C"));
	System.out.println(supry2.lastIndexOf("A"));

	System.out.println("__________________________________________");

	System.out.println(supry4.lastIndexOf("C"));
	supry4.add("A");
	supry4.add("B");
	supry4.add("C");
	supry4.add("C");
	System.out.println(supry4.toStringDebug());
	System.out.println(supry4.lastIndexOf("C"));
	supry4.add("D");
	supry4.add("E");
	System.out.println(supry4.toStringDebug());
	System.out.println(supry4.lastIndexOf("B"));
	supry4.add("F");
	supry4.add("G");
	supry4.add("G");
	supry4.add("G");
	System.out.println(supry4.toStringDebug());
	System.out.println(supry4.lastIndexOf("G"));

	System.out.println("__________________________________________");

	supry1.add("A");
	supry1.add("B");
	supry1.add("C");
	supry1.add("D");
	supry1.add("E");
	supry1.add("F");
	supry1.add("G");
	supry1.add("H");
	supry1.add("I");
	supry1.add("I");
	System.out.println(supry1.lastIndexOf("I"));
	supry1.add("A");
	System.out.println(supry1.toStringDebug());
	System.out.println(supry1.lastIndexOf("I"));
	System.out.println(supry1.lastIndexOf("A"));
	
	*/

	/*
	//test trimToSize()
	supry1.trimToSize();
	System.out.println(supry1.toStringDebug());
	supry2.trimToSize();
	System.out.println(supry2.toStringDebug());
	supry3.trimToSize();
	System.out.println(supry3.toStringDebug());
	supry4.trimToSize();
	System.out.println(supry4.toStringDebug());
	supry4.trimToSize();
	System.out.println(supry5.toStringDebug());

	System.out.println("__________________________________________");
	
	System.out.println(supry4.toStringDebug());
	supry4.add("a");
	supry4.add("b");
	supry4.add("c");
	supry4.add("d");
	supry4.add("e");
	supry4.add("f");
	System.out.println(supry4.size());
	System.out.println(supry4.length());
	System.out.println(supry4.toStringDebug());
	supry4.trimToSize();
	System.out.println(supry4.toStringDebug());
	System.out.println(supry4.length());
	System.out.println(supry4.size());

	System.out.println("__________________________________________");

	supry1.add("a");
	supry1.add("b");
	supry1.add("c");
	supry1.add("d");
	System.out.println(supry1.toStringDebug());
	System.out.println(supry1.length());
	System.out.println(supry1.size());
	supry1.trimToSize();
	System.out.println(supry1.toStringDebug());
	System.out.println(supry1.length());
	System.out.println(supry1.size());

	System.out.println("__________________________________________");

	System.out.println(supry2.toStringDebug());
	System.out.println(supry2.length());
	supry2.add("a");
	supry2.add("b");
	supry2.add("c");
	supry2.add("d");
	supry2.add("e");
	System.out.println(supry2.toStringDebug());
	supry2.trimToSize();
	System.out.println(supry2.toStringDebug());

	System.out.println("__________________________________________");

	supry4.add("a");
	supry4.add("a");
	supry4.add("a");
	supry4.add("a");
	supry4.add("a");
	supry4.add("a");
	supry4.add("a");
	supry4.add("a");
	supry4.add("a");
	supry4.add("a");
	System.out.println(supry4.toStringDebug());
	supry4.trimToSize();
	System.out.println(supry4.toStringDebug());
	
	*/

	//ADDITIONAL TESTS
	/*
	supry1.grow();
	System.out.println(supry1.toStringDebug());
	supry5.grow();
	System.out.println(supry5.toStringDebug());

	System.out.println("__________________________________________");

	//supry1.add(5, 6);
	supry4.add(0, "a");
	supry4.add(1, "b");
	supry4.add(2, "c");
	supry4.add(3, "d");
	supry4.add(4, "e");
	supry4.add(5, "f");
	supry4.add(6, "g");
	supry4.add(7, "h");
	supry4.add(8, "i");
	supry4.add(9, "j");
	supry4.remove(10);
	System.out.println(supry4.toStringDebug());
	System.out.println(supry4.size());
	supry4.remove(5);
	System.out.println(supry4.toStringDebug());
	supry4.add(7, "k");
	System.out.println(supry4.toStringDebug());
	System.out.println(supry4.size());
	supry4.add(9, "l");
	System.out.println(supry4.toStringDebug());
	supry4.add(10, "m");
	System.out.println(supry4.toStringDebug());
	supry4.remove(11);
	System.out.println(supry4.toStringDebug());
	supry4.remove(0);
	System.out.println(supry4.toStringDebug());
	supry4.add(0, "A");
	System.out.println(supry4.toStringDebug());
	System.out.println(supry4.lastIndexOf("l"));
	System.out.println(supry4.lastIndexOf("j"));
	System.out.println(supry4.lastIndexOf("A"));
	System.out.println(supry4.lastIndexOf("B"));

	System.out.println("__________________________________________");

	System.out.println(supry4.indexOf("l"));
	System.out.println(supry4.indexOf("j"));
	System.out.println(supry4.indexOf("A"));
	System.out.println(supry4.indexOf("B"));

	System.out.println(supry4.toStringDebug());
	System.out.println(supry4.get(0));
	System.out.println(supry4.get(10));
	System.out.println(supry4.get(5));
	//System.out.println(supry4.get(11));

	supry4.clear();
	System.out.println(supry4.toStringDebug());
	//System.out.println(supry4.remove(0));
	supry4.trimToSize();
	System.out.println(supry4);
	*/

	//More Attempts to Break SuperArray
	/*
	StringySuperArray ary = new StringySuperArray();
	ary.add("10");
	ary.add("-32");
	ary.add("100");
	ary.add("5bre");
        ary.add("5bre");
	ary.add("5bre");
	ary.add("5bre");
	ary.add("5bre");
	ary.add("5bre");
	ary.add("5bre");
	ary.add("5bre");
	ary.add("5bre");
	ary.add("5bre");
	ary.add("5bre");
	ary.add("5bre");	
	ary.add("5bre");
	ary.add("5bre");
	ary.add("5bre");
	ary.add("5bre");
	ary.add("5bre");
	ary.add("100");
        ary.add("5bre");
        ary.add("5bre");
	ary.add("5bre");
	ary.add("5bre");
	ary.add("5bre");
	ary.add("5bre");
	ary.add("5bre");
	ary.add("5bre");
	ary.add("5bre");
	ary.add("5bre");
	ary.add("5bre");
	ary.add("5bre");	
	ary.add("5bre");
	ary.add("5bre");
	ary.add("5bre");
	ary.add("5bre");
	ary.add("5bre");
	System.out.println(ary.indexOf("5bre"));
	System.out.println(ary.lastIndexOf("5bre"));
	System.out.println(ary.indexOf("100"));
	System.out.println(ary.lastIndexOf("100"));
	*/

	//More Tests
	/*
	System.out.println(supry1.toStringDebug());
	supry1.growTo(15);
	supry1.add("C");
	supry1.add("C");
	supry1.add("C");
	supry1.add("C");
	System.out.println(supry1.toStringDebug());
	supry1.growTo(35);
	System.out.println(supry1.toStringDebug());
	supry1.growTo(5);
	System.out.println(supry1.toStringDebug());
	supry1.add("C");
	supry1.growTo(35);
	System.out.println(supry1.toStringDebug());
	supry1.growTo(5);
	System.out.println(supry1.toStringDebug());
	supry1.growTo(5);
	System.out.println(supry1.toStringDebug());

	System.out.println("__________________________________________");

	supry2.add("a");
	supry2.add("b");
	supry2.add("c");
	supry2.add("d");
	supry2.add("e");
	supry2.add("f");
	System.out.println(supry2.toStringDebug());
	supry2.remove(0);
	System.out.println(supry2.toStringDebug());
	supry2.remove(0);
	System.out.println(supry2.toStringDebug());
	supry2.remove(2);
	System.out.println(supry2.toStringDebug());
	supry2.remove(0);
	System.out.println(supry2.toStringDebug());
	supry2.remove(0);
	System.out.println(supry2.toStringDebug());
	supry2.remove(0);
	System.out.println(supry2.toStringDebug());
	System.out.println(supry2.isEmpty());
	*/


	//ORDEREDSUPERARRAY TESTS
	
	String[] ary1 = new String[1];
	String[] ary2 = new String[5];
	
	StringyOrderedSuperArray ordry1 = new StringyOrderedSuperArray(ary1);
	StringyOrderedSuperArray ordry2 = new StringyOrderedSuperArray();
	StringyOrderedSuperArray ordry3 = new StringyOrderedSuperArray(ary2);
	StringyOrderedSuperArray ordry4 = new StringyOrderedSuperArray(2);
	
	
	//Basic Tests
	/*
	System.out.println(ordry1.toStringDebug());
	System.out.println(ordry1.size());
	ordry1.add("A");
	System.out.println(ordry1.toStringDebug());
	System.out.println(ordry1.size());
	ordry1.add("B");
	System.out.println(ordry1.toStringDebug());
	System.out.println(ordry1.size());
	ordry1.add("C");
	System.out.println(ordry1.toStringDebug());
	System.out.println(ordry1.size());
	ordry1.add("D");
	System.out.println(ordry1.toStringDebug());
	System.out.println(ordry1.size());

	System.out.println("__________________________________________");
	
	System.out.println(ordry2.toStringDebug());
	System.out.println(ordry2.size());
	ordry2.add("A");
	System.out.println(ordry2.toStringDebug());
	System.out.println(ordry2.size());
	ordry2.add("B");
	System.out.println(ordry2.toStringDebug());
	System.out.println(ordry2.size());
	ordry2.add("C");
	System.out.println(ordry2.toStringDebug());
	System.out.println(ordry2.size());
	ordry2.add("D");
	System.out.println(ordry2.toStringDebug());
	System.out.println(ordry2.size());

	System.out.println("__________________________________________");

	ordry1.add("B");
	System.out.println(ordry1.toStringDebug());
	ordry1.add("m");
	System.out.println(ordry1.toStringDebug());
	ordry1.add("l");
	System.out.println(ordry1.toStringDebug());
	ordry1.add("A");
	System.out.println(ordry1.toStringDebug());
	ordry1.add("Z");
	System.out.println(ordry1.toStringDebug());
	ordry1.add("C");
	System.out.println(ordry1.toStringDebug());
	ordry1.add("f");
	System.out.println(ordry1.toStringDebug());
	ordry1.add("R");
	System.out.println(ordry1.toStringDebug());
	ordry1.add("L");
	System.out.println(ordry1.toStringDebug());
	ordry1.add("Z");
	System.out.println(ordry1.toStringDebug());
	ordry1.add("c");
	System.out.println(ordry1.toStringDebug());
	ordry1.add("g");
	System.out.println(ordry1.toStringDebug());
	ordry1.add("h");
	System.out.println(ordry1.toStringDebug());
	ordry1.add("A");
	System.out.println(ordry1.toStringDebug());
	ordry1.add("z");
	System.out.println(ordry1.toStringDebug());
	ordry1.add("X");
	System.out.println(ordry1.toStringDebug());
	ordry1.add("G");
	System.out.println(ordry1.toStringDebug());
	ordry1.add("j");
	System.out.println(ordry1.toStringDebug());
	ordry1.add("F");
	System.out.println(ordry1.toStringDebug());
	ordry1.add("o");
	System.out.println(ordry1.toStringDebug());
	ordry1.add("Q");
	System.out.println(ordry1.toStringDebug());
	*/

	//Testing Additional Constructors
	/*
	System.out.println(ordry3.toStringDebug());
	System.out.println(ordry4.toStringDebug());
	ordry4.add("d");
	ordry4.add("c");
	ordry4.add("i");
	ordry4.add("g");
	ordry4.add("h");
	ordry4.add("b");
	ordry4.add("a");
	ordry4.add("e");
	ordry4.add("f");
	ordry4.add("A");
	System.out.println(ordry4.toStringDebug());
	System.out.println(ordry4.size());
	ordry4.remove(0);
	System.out.println(ordry4.toStringDebug());
	System.out.println(ordry4.size());

	ordry3.add("sdjkfskjsdf");
	ordry3.add("gdcxgxzf");
	ordry3.add("dgdfgdfg");
	ordry3.add("sgdgdfgdfg");
	ordry3.add("f.,bgmnhgjd");
	ordry3.add("ndgdnmf");
	ordry3.add("m,ndvkdjs");
	ordry3.add("xfdkgpdspw");
	ordry3.add(".f,w.,rwjr");
	System.out.println(ordry3.toStringDebug());

        ordry3.remove(3);
	System.out.println(ordry3.toStringDebug());

	ordry3.remove(0);
	System.out.println(ordry3.toStringDebug());

	ordry3.add("ls,dgsja");
	System.out.println(ordry3.toStringDebug());

	ordry3.add("AJFJAJFHKAHFSS");
	System.out.println(ordry3.toStringDebug());

	ordry3.trimToSize();
	System.out.println(ordry3.toStringDebug());
	*/

	//Final Attempts to Break StringyOrderedSuperArray
	///*
	ordry1.growTo(200);
	System.out.println(ordry1.toStringDebug());
	ordry1.add("A");
	ordry1.add("B");
	ordry1.add("v1");
	ordry1.add("C");
	ordry1.add("D");
	ordry1.add("T2");
	ordry1.add("U2");
	ordry1.add("V2");
	ordry1.add("u1");
	ordry1.add("T2");
	ordry1.add("U2");
	ordry1.add("V2");
	ordry1.add("u1");
	ordry1.add("v1");
	ordry1.add("y1");
	ordry1.add("z1");
	ordry1.add("A2");
	ordry1.add("B2");
	ordry1.add("C2");
	ordry1.add("D2");
	ordry1.add("E2");
	ordry1.add("F2");
	ordry1.add("G2");
	ordry1.add("H2");
	ordry1.add("I2");
	ordry1.add("J2");
	ordry1.add("v1");
	ordry1.add("y1");
	ordry1.add("z1");
	ordry1.add("A2");
	ordry1.add("B2");
	ordry1.add("C2");
	ordry1.add("D2");
	ordry1.add("E2");
	ordry1.add("F2");
	ordry1.add("G2");
	ordry1.add("H2");
	ordry1.add("I2");
	ordry1.add("J2");
	ordry1.add("E");
	ordry1.add("F");
	ordry1.add("G");
	ordry1.add("H");
	ordry1.add("I");
	ordry1.add("J");
	ordry1.add("K");
	ordry1.add("L");
	ordry1.add("M");
	ordry1.add("N");
	ordry1.add("O");
	ordry1.add("P");
	ordry1.add("Q");
	ordry1.add("R");
	ordry1.add("S");
	ordry1.add("T");
	ordry1.add("U");
	ordry1.add("V");
	ordry1.add("W");
	ordry1.add("X");
	ordry1.add("Y");
	ordry1.add("Z");
	ordry1.add("a");
	ordry1.add("T2");
	ordry1.add("U2");
	ordry1.add("V2");
	ordry1.add("u1");
	ordry1.add("T2");
	ordry1.add("U2");
	ordry1.add("V2");
	ordry1.add("u1");
	ordry1.add("v1");
	ordry1.add("y1");
	ordry1.add("z1");
	ordry1.add("A2");
	ordry1.add("B2");
	ordry1.add("C2");
	ordry1.add("D2");
	ordry1.add("E2");
	ordry1.add("F2");
	ordry1.add("G2");
	ordry1.add("H2");
	ordry1.add("I2");
	ordry1.add("J2");
	ordry1.add("v1");
	ordry1.add("y1");
	ordry1.add("z1");
	ordry1.add("A2");
	ordry1.add("B2");
	ordry1.add("C2");
	ordry1.add("D2");
	ordry1.add("E2");
	ordry1.add("F2");
	ordry1.add("G2");
	ordry1.add("H2");
	ordry1.add("I2");
	ordry1.add("J2");
	ordry1.add("E");
	ordry1.add("F");
	ordry1.add("G");
	ordry1.add("H");
	ordry1.add("I");
	ordry1.add("J");
	ordry1.add("K");
	ordry1.add("L");
	ordry1.add("M");
	ordry1.add("N");
	ordry1.add("O");
	ordry1.add("P");
	ordry1.add("Q");
	ordry1.add("R");
	ordry1.add("S");
	ordry1.add("T");
	ordry1.add("U");
	ordry1.add("V");
	ordry1.add("W");
	ordry1.add("X");
	ordry1.add("Y");
	ordry1.add("Z");
	ordry1.add("a");
	ordry1.add("b");
	ordry1.add("c");
	ordry1.add("d");
	ordry1.add("e");
	ordry1.add("f");
	ordry1.add("g");
	ordry1.add("h");
	ordry1.add("i");
	ordry1.add("j");
	ordry1.add("k");
	ordry1.add("l");
	ordry1.add("m");
	ordry1.add("n");
	ordry1.add("o");
	ordry1.add("p");
	ordry1.add("q");
	ordry1.add("r");
	ordry1.add("s");
	ordry1.add("b");
	ordry1.add("c");
	ordry1.add("d");
	ordry1.add("e");
	ordry1.add("f");
	ordry1.add("g");
	ordry1.add("h");
	ordry1.add("i");
	ordry1.add("j");
	ordry1.add("k");
	ordry1.add("l");
	ordry1.add("m");
	ordry1.add("n");
	ordry1.add("o");
	ordry1.add("p");
	ordry1.add("q");
	ordry1.add("r");
	ordry1.add("s");
	ordry1.add("t");
	ordry1.add("u");
	ordry1.add("v");
	ordry1.add("y");
	ordry1.add("z");
	ordry1.add("A1");
	ordry1.add("B1");
	ordry1.add("C1");
	ordry1.add("D1");
	ordry1.add("E1");
	ordry1.add("F1");
	ordry1.add("G1");
	ordry1.add("H1");
	ordry1.add("I1");
	ordry1.add("J1");
	ordry1.add("K1");
	ordry1.add("L1");
	ordry1.add("M1");
	ordry1.add("N1");
	ordry1.add("O1");
	ordry1.add("P1");
	ordry1.add("Q1");
	ordry1.add("R1");
	ordry1.add("S1");
	ordry1.add("T1");
	ordry1.add("U1");
	ordry1.add("V1");
	ordry1.add("W1");
	ordry1.add("X1");
	ordry1.add("Y1");
	ordry1.add("Z1");
	ordry1.add("a1");
	ordry1.add("b1");
	ordry1.add("c1");
	ordry1.add("d1");
	ordry1.add("e1");
	ordry1.add("f1");
	ordry1.add("g1");
	ordry1.add("h1");
	ordry1.add("i1");
	ordry1.add("K2");
	ordry1.add("L2");
	ordry1.add("M2");
	ordry1.add("N2");
	ordry1.add("O2");
	ordry1.add("P2");
	ordry1.add("Q2");
	ordry1.add("R2");
	ordry1.add("S2");
	ordry1.add("T2");
	ordry1.add("U2");
	ordry1.add("V2");
	ordry1.add("P");
	ordry1.add("Q");
	ordry1.add("R");
	ordry1.add("S");
	ordry1.add("T");
	ordry1.add("U");
	ordry1.add("j1");
	ordry1.add("k1");
	ordry1.add("l1");
	ordry1.add("m1");
	ordry1.add("n1");
	ordry1.add("o1");
	ordry1.add("p1");
	ordry1.add("q1");
	ordry1.add("r1");
	ordry1.add("s1");
	ordry1.add("t1");
	ordry1.add("G2");
	ordry1.add("H2");
	ordry1.add("I2");
	ordry1.add("J2");
	ordry1.add("K2");
	ordry1.add("L2");
	ordry1.add("M2");
	ordry1.add("N2");
	ordry1.add("O2");
	ordry1.add("P2");
	ordry1.add("Q2");
	ordry1.add("R2");
	ordry1.add("S2");
	ordry1.add("T2");
	ordry1.add("U2");
	ordry1.add("V2");
	ordry1.add("P");
	ordry1.add("Q");
	ordry1.add("R");
	ordry1.add("S");
	ordry1.add("T");
	ordry1.add("U");
	ordry1.add("V");
	ordry1.add("W");
	ordry1.add("X");
	ordry1.add("Y");
	ordry1.add("Z");
	ordry1.add("a");
	ordry1.add("b");
	ordry1.add("c");
	ordry1.add("d");
	ordry1.add("e");
	ordry1.add("f");
	ordry1.add("g");
	ordry1.add("h");
	ordry1.add("i");
	ordry1.add("j");;
	ordry1.add("u1");
	ordry1.add("v1");
	ordry1.add("y1");
	ordry1.add("z1");
	ordry1.add("A2");
	ordry1.add("B2");
	ordry1.add("C2");
	ordry1.add("D2");
	ordry1.add("c");
	ordry1.add("d");
	ordry1.add("e");
	ordry1.add("f");
	ordry1.add("g");
	ordry1.add("h");
	ordry1.add("i");
	ordry1.add("j");;
	ordry1.add("u1");
	ordry1.add("v1");
	ordry1.add("y1");
	ordry1.add("z1");
	ordry1.add("A2");
	ordry1.add("E2");
	ordry1.add("F2");
	ordry1.add("G2");
	ordry1.add("H2");
	ordry1.add("I2");
	ordry1.add("J2");
	ordry1.add("K2");
	ordry1.add("L2");
	ordry1.add("M2");
	ordry1.add("N2");
	ordry1.add("O2");
	ordry1.add("P2");
	ordry1.add("Q2");
	ordry1.add("R2");
	ordry1.add("S2");
	ordry1.add("T2");
	ordry1.add("U2");
	ordry1.add("V2");
	ordry1.add("W2");
	ordry1.add("X2");
	ordry1.add("Y2");
	ordry1.add("P");
	ordry1.add("Q");
	ordry1.add("R");
	ordry1.add("S");
	ordry1.add("T");
	ordry1.add("U");
	ordry1.add("V");
	ordry1.add("W");
	ordry1.add("X");
	ordry1.add("H2");
	ordry1.add("I2");
	ordry1.add("J2");
	ordry1.add("K2");
	ordry1.add("L2");
	ordry1.add("M2");
	ordry1.add("N2");
	ordry1.add("O2");
	ordry1.add("P2");
	ordry1.add("Q2");
	ordry1.add("R2");
	ordry1.add("Y");
	ordry1.add("Z");
	ordry1.add("a");
	ordry1.add("b");
	ordry1.add("c");
	ordry1.add("d");
	ordry1.add("e");
	ordry1.add("f");
	ordry1.add("g");
	ordry1.add("h");
	ordry1.add("i");
	ordry1.add("j");
	ordry1.add("Z2");
	ordry1.add("a2");
	ordry1.add("b2");
	ordry1.add("c2");
	ordry1.add("d2");
	ordry1.add("e2");
	ordry1.add("f2");
	ordry1.add("g2");
	ordry1.add("h2");
	ordry1.add("i2");
	ordry1.add("j2");
	ordry1.add("k2");
	ordry1.add("l2");
	ordry1.add("m2");
	ordry1.add("n2");
	ordry1.add("a");
	ordry1.add("b");
	ordry1.add("c");
	ordry1.add("d");
	ordry1.add("e");
	ordry1.add("f");
	ordry1.add("g");
	ordry1.add("h");
	ordry1.add("i");
	ordry1.add("j");
	ordry1.add("Z2");
	ordry1.add("a2");
	ordry1.add("b2");
	ordry1.add("c2");
	ordry1.add("d2");
	ordry1.add("e2");
	ordry1.add("f2");
	ordry1.add("g2");
	ordry1.add("h2");
	ordry1.add("i2");
	ordry1.add("j2");
	ordry1.add("k2");
	ordry1.add("l2");
	ordry1.add("m2");
	ordry1.add("n2");
	ordry1.add("o2");
	ordry1.add("p2");
	ordry1.add("q2");
	ordry1.add("r2");
	ordry1.add("s2");
	ordry1.add("t2");
	ordry1.add("u2");
	ordry1.add("v2");
	ordry1.add("y2");
	ordry1.add("z2");
	ordry1.trimToSize();
	System.out.println(ordry1.toStringDebug());
	System.out.println(ordry1.length());
	//*/


	

    }


}
