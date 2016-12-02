//Ordered SuperArray

public class OrderedSuperArray extends SuperArray{
    private int capacity;

    //Constructors

    
    //same as original SuperArray Constructor
    public OrderedSuperArray(){
	super();
    }
    
    //same as original SuperArray Constructor
    ////*
    public OrderedSuperArray(int initCap){
	super(initCap);
    }
    
    //Takes an array, and orders it according to the add function
    public OrderedSuperArray(int[] ary){
	int[] ordered = new int[ary.length];
	
	for(int p = 0; p < size(); p++){
	    add(data(p));
	}

	ary = ordered;
    }

    
    //METHODS

    //Add and set indexes are overriden because they change the order of the
    //SuperArray
    
    //Add and set methods for given indexes mess with the ordered superarray
    //set(int index, int element)
    //throw an UnsupportedOperationException
    public int set(int index, int element){

	    throw new UnsupportedOperationException();

    }

    //add(int index, int element)
    //throw an UnsupportedOperationException
    public void add(int index, int element){

	    throw new UnsupportedOperationException();

    }
    

    //add/order method -> add (int element) 
    //You should write a private method to find the index that you want
    //to add the element to.
    //Adds the element to the proper place in the ordered superarray
    public void add(int newelement){
	
	int size1 = size();
	boolean a = true;

	for(int p = 0; p < size1; p++){
	    if(newelement < data(p)){
		super.add(p, newelement);
		a = false;
		p = size1;
	    }
	}

	if(a){
	    super.add(size1, newelement);
	}	
    }


    //MAIN

    public static void main(String[]args){

	//SuperArray Tests
	SuperArray supry1 = new SuperArray();
	SuperArray supry2 = new SuperArray(5);
	SuperArray supry3 = new SuperArray(1);
	SuperArray supry4 = new SuperArray(10);
	SuperArray supry5 = new SuperArray(0);

	
	//test add(int n), toStringDebug(), toString(),  size()
	//supry1;
	/*
	System.out.println(supry1.toStringDebug());
	System.out.println(supry1.toString());
	System.out.println(supry1.size());
	supry1.add(3);
	System.out.println(supry1.toStringDebug());
	System.out.println(supry1.toString());
	System.out.println(supry1.size());
	supry1.add(4);
	System.out.println(supry1.toStringDebug());
	System.out.println(supry1.toString());
	System.out.println(supry1.size());
	supry1.add(6);
	System.out.println(supry1.toStringDebug());
	System.out.println(supry1.toString());
	System.out.println(supry1.size());
	//supry2
	System.out.println(supry2.toStringDebug());
	System.out.println(supry2.toString());
	System.out.println(supry2.size());
	supry2.add(3);
	System.out.println(supry2.toStringDebug());
	System.out.println(supry2.toString());
	System.out.println(supry2.size());
	supry2.add(4);
	System.out.println(supry2.toStringDebug());
	System.out.println(supry2.toString());
	System.out.println(supry2.size());
	supry2.add(-6);
	System.out.println(supry2.toStringDebug());
        System.out.println(supry2.toString());
	System.out.println(supry2.size());
	supry2.add(7);
	System.out.println(supry2.toStringDebug());
        System.out.println(supry2.toString());
	System.out.println(supry2.size());
	supry2.add(8);
	System.out.println(supry2.toStringDebug());
        System.out.println(supry2.toString());
	System.out.println(supry2.size());
	supry2.add(27);
	System.out.println(supry2.toStringDebug());
        System.out.println(supry2.toString());
	System.out.println(supry2.size());
	supry2.add(42);
	System.out.println(supry2.toStringDebug());
        System.out.println(supry2.toString());
	System.out.println(supry2.size());
	//supry3
	System.out.println(supry3.toStringDebug());
        System.out.println(supry3.toString());
	System.out.println(supry3.size());
	supry3.add(3);
	System.out.println(supry3.toStringDebug());
        System.out.println(supry3.toString());
	System.out.println(supry3.size());
	supry3.add(4);
	System.out.println(supry3.toStringDebug());
        System.out.println(supry3.toString());
	System.out.println(supry3.size());
	supry3.add(6);
	System.out.println(supry3.toStringDebug());
        System.out.println(supry3.toString());
	System.out.println(supry3.size());
	//supry4
	System.out.println(supry4.toStringDebug());
        System.out.println(supry4.toString());
	System.out.println(supry4.size());
	supry4.add(3);
	System.out.println(supry4.toStringDebug());
        System.out.println(supry4.toString());
	System.out.println(supry4.size());
	supry4.add(4);
	System.out.println(supry4.toStringDebug());
        System.out.println(supry4.toString());
	System.out.println(supry4.size());
	supry4.add(6);
	System.out.println(supry4.toStringDebug());
        System.out.println(supry4.toString());
	System.out.println(supry4.size());
	//supry5
	System.out.println(supry5.toStringDebug());
        System.out.println(supry5.toString());
	System.out.println(supry5.size());
	supry5.add(3);
	System.out.println(supry5.toStringDebug());
        System.out.println(supry5.toString());
	System.out.println(supry5.size());
	supry5.add(4);
	System.out.println(supry5.toStringDebug());
        System.out.println(supry5.toString());
	System.out.println(supry5.size());
	supry5.add(6);
	System.out.println(supry5.toStringDebug());
        System.out.println(supry5.toString());
	System.out.println(supry5.size());
	*/

	/*
	//test length()
	System.out.println(supry5.toStringDebug());
	System.out.println(supry5.length());

	System.out.println(supry2.toStringDebug());
	System.out.println(supry2.length());

	System.out.println(supry1.toStringDebug());
	System.out.println(supry1.length());
	supry1.add(1);
	System.out.println(supry1.toStringDebug());
	System.out.println(supry1.length());
	supry1.add(2);
	supry1.add(3);
	supry1.add(4);
	supry1.add(5);
	System.out.println(supry1.toStringDebug());
	System.out.println(supry1.length());
	supry1.add(6);
	supry1.add(7);
	supry1.add(8);
	System.out.println(supry1.toStringDebug());
	System.out.println(supry1.length());

	supry1.trimToSize();
	System.out.println(supry1.toStringDebug());
	System.out.println(supry1.length());
	*/
	
	//additional tests for the above functions
	//grow
	/*
	supry1.grow();
	supry2.grow();
	supry3.grow();
	supry4.grow();
	supry5.grow();
	System.out.println(supry1.toStringDebug());
	System.out.println(supry2.toStringDebug());
	System.out.println(supry3.toStringDebug());
	System.out.println(supry4.toStringDebug());
	System.out.println(supry5.toStringDebug());
	*/

	/*
	//test get(int index)
	//System.out.println(supry1.get(0));
	//System.out.println(supry1.get(-1));
	//System.out.println(supry2.get(0));
	//System.out.println(supry3.get(0));
	//System.out.println(supry4.get(0));
	//System.out.println(supry5.get(0));
	supry1.add(5);
	supry2.add(5);
	supry3.add(5);
	supry4.add(5);
	supry5.add(5);
	System.out.println(supry1.get(0));
	System.out.println(supry2.get(0));
	System.out.println(supry3.get(0));
	System.out.println(supry4.get(0));
	System.out.println(supry5.get(0));

	supry1.add(15);
        supry2.add(20);
        supry3.add(15);
        supry4.add(15);
        supry5.add(15);
	System.out.println(supry1.get(1));
	System.out.println(supry2.get(1));
	System.out.println(supry3.get(1));
	System.out.println(supry4.get(1));
	System.out.println(supry5.get(1));

	//System.out.println(supry2.get(2));
	//System.out.println(supry2.get(4));
	//System.out.println(supry2.get(5));
	//System.out.println(supry2.get(6));
	
	supry2.add(-3);
	supry2.add(13);
	supry2.add(12);
	supry2.add(0);
	supry2.add(16);
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

	supry1.add(8);
	supry1.clear();
	System.out.println(supry1.toStringDebug());
	supry1.add(8);
	supry1.add(8);
	supry1.add(8);
	supry1.add(8);
	supry1.add(8);
	supry1.add(8);
	supry1.add(8);
	supry1.add(8);
	supry1.add(8);
	supry1.add(8);
	supry1.add(8);
	System.out.println(supry1.toStringDebug());
	supry1.clear();
	System.out.println(supry1.toStringDebug());

	supry2.add(8);
	supry2.add(0);
	supry2.add(8);
	supry2.add(128);
	supry2.add(8);
	supry2.add(-8);
	System.out.println(supry2.toStringDebug());
	supry2.clear();
	System.out.println(supry2.toStringDebug());

	supry5.add(8);
	supry5.add(0);
	supry5.add(8);
	supry5.add(128);
	supry5.add(8);
	supry5.add(-8);
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

	supry1.add(-2);
	supry2.add(-2);
	supry3.add(-2);
	supry4.add(-2);
	supry5.add(-2);

        System.out.println(supry1.isEmpty());
	System.out.println(supry2.isEmpty());
	System.out.println(supry3.isEmpty());
	System.out.println(supry4.isEmpty());
	System.out.println(supry5.isEmpty());

	supry2.add(-2);
	supry2.add(0);
	supry2.add(35);
	supry2.add(452);
	supry2.add(22);
	supry2.add(-2);

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
	//supry1.set(0, 2);
	//System.out.println(supry1.get(0));
	supry2.add(17);
	supry2.add(17);
	supry2.add(17);
	//supry2.set(2, 9);
	System.out.println(supry2.set(2, 19));
	System.out.println(supry2.get(2));

	supry1.add(12);
	System.out.println(supry1.get(0));
	//supry1.set(0, 2);
	System.out.println(supry1.set(0, 2));
	System.out.println(supry1.get(0));

	//supry5.set(0, 9);
	//supry5.set(-2, 9);
	//supry5.set(1, 9);
	
	supry4.add(-3);
	supry4.add(-3);
	supry4.add(-3);
	supry4.add(-3);
	supry4.add(-3);
	supry4.add(-3);
	supry4.add(-3);
	supry4.add(-3);
	supry4.add(-3);
	supry4.add(-3);
	supry4.add(-3);
	supry4.add(-3);
	System.out.println(supry4.get(9));
	System.out.println(supry4.size());
	//supry4.set(9, 42);
	System.out.println(supry4.set(9, 42));
	System.out.println(supry4.get(9));

	*/

	/*
	//test add(int index, int element)
	supry2.add(3);
	supry2.add(65);
	supry2.add(9);
	supry2.add(45);
	supry2.add(32);
	supry2.add(32);
	System.out.println(supry2.toStringDebug());
	supry2.add(56);
	System.out.println(supry2.toStringDebug());
	supry2.add(5, 99);
	System.out.println(supry2.toStringDebug());
	supry2.add(2, 44);
	System.out.println(supry2.toStringDebug());
	supry2.grow();
	supry2.add(3, 75);
	System.out.println(supry2.size());
	System.out.println(supry2.toStringDebug());
	supry2.add(4, 77);
	System.out.println(supry2.toStringDebug());
	supry2.add(1, 106);
	System.out.println(supry2.toStringDebug());

	
	supry5.add(66);
	supry5.add(92);
	supry5.add(7);
	supry5.add(79);
	System.out.println(supry5.toStringDebug());
	supry5.add(2, 69);
	System.out.println(supry5.toStringDebug());
	supry5.add(3, 88);
	System.out.println(supry5.toStringDebug());
	//supry5.add(6, 888);
	System.out.println(supry5.toStringDebug());
	
	supry2.add(69);
	supry2.add(69);
	supry2.add(69);
	supry2.add(69);
	supry2.add(69);
	supry2.add(3, 111);
	supry2.add(69);
	System.out.println(supry2.toStringDebug());

	*/

	/*
	//test remove(int index);
	supry1.add(42);
	supry1.add(42);
	supry1.add(42);
	supry1.add(1, 4);
	supry1.add(42);
	supry1.add(3, 2);
	System.out.println(supry1.toStringDebug());
	System.out.println(supry1.remove(3));
	System.out.println(supry1.toStringDebug());
	System.out.println(supry1.remove(4));
	System.out.println(supry1.toStringDebug());

	System.out.println(supry4.remove(2));
	supry2.add(23);
	supry2.add(9);
	supry2.add(23);
	supry2.add(23);
	supry2.add(2, 3);
	supry2.add(9);
	System.out.println(supry2.toStringDebug());
	System.out.println(supry2.remove(0));
        
	supry5.add(2);
	supry5.add(3);
	supry5.add(8);
	System.out.println(supry5.toStringDebug());
	System.out.println(supry5.remove(2));
	System.out.println(supry5.toStringDebug());
	supry5.add(4);
	supry5.add(5);
	System.out.println(supry5.toStringDebug());
	System.out.println(supry5.remove(4));
	System.out.println(supry5.toStringDebug());
	supry5.add(6);
	supry5.add(7);
	System.out.println(supry5.toStringDebug());
	System.out.println(supry5.remove(6));
	System.out.println(supry5.toStringDebug());

	*/
	
	/*
	//test toArray
	supry2.toArray();
	supry2.add(3);
	supry2.add(-5);
	supry2.toArray();
	supry2.add(1, -92);
	supry2.add(16);
	//supry2.remove(3);
	supry2.toArray();
	
	 */

	/*
	 //test indexOf

	System.out.println(supry2.indexOf(1));
	supry2.add(1);
	supry2.add(1);
	supry2.add(1);
	System.out.println(supry2.indexOf(1));
	supry2.add(1);
	supry2.add(1);
	supry2.add(2);
	System.out.println(supry2.indexOf(2));
	System.out.println(supry2.indexOf(3));

	System.out.println(supry4.indexOf(3));
	supry4.add(1);
	supry4.add(2);
	supry4.add(3);
	System.out.println(supry4.indexOf(3));
	supry4.add(4);
	supry4.add(5);
	System.out.println(supry4.indexOf(2));
	supry4.add(6);
	supry4.add(7);
	System.out.println(supry4.indexOf(7));
	
	 */

	 /*
	 //test lastIndexOf

	System.out.println(supry2.lastIndexOf(1));
	supry2.add(1);
	supry2.add(1);
	supry2.add(1);
	System.out.println(supry2.lastIndexOf(1));
	supry2.add(1);
	supry2.add(1);
	supry2.add(2);
	supry2.add(1);
	System.out.println(supry2.lastIndexOf(2));
	System.out.println(supry2.lastIndexOf(3));

	System.out.println(supry4.lastIndexOf(3));
	supry4.add(1);
	supry4.add(2);
	supry4.add(3);
	System.out.println(supry4.lastIndexOf(3));
	supry4.add(4);
	supry4.add(5);
	System.out.println(supry4.lastIndexOf(2));
	supry4.add(6);
	supry4.add(7);
	supry4.add(7);
	supry4.add(7);
	System.out.println(supry4.lastIndexOf(7));
	
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
	supry4.add(1);
	supry4.add(2);
	supry4.add(3);
	supry4.add(4);
	supry4.add(5);
	supry4.add(6);
	System.out.println(supry4.size());
	System.out.println(supry4.toStringDebug());
	supry4.trimToSize();
	System.out.println(supry4.toStringDebug());
	System.out.println(supry4.size());

	supry1.add(1);
	supry1.add(2);
	supry1.add(3);
	supry1.add(4);
	System.out.println(supry1.toStringDebug());
	supry1.trimToSize();
	System.out.println(supry1.toStringDebug());
	System.out.println(supry1.size());

	*/

	//ADDITIONAL TESTS
	/*
	supry1.grow();
	System.out.println(supry1.toStringDebug());
	supry5.grow();
	System.out.println(supry5.toStringDebug());

	//supry1.add(5, 6);
	supry4.add(0, 1);
	supry4.add(1, 2);
	supry4.add(2, 3);
	supry4.add(3, 4);
	supry4.add(4, 5);
	supry4.add(5, 6);
	supry4.add(6, 7);
	supry4.add(7, 8);
	supry4.add(8, 9);
	supry4.add(9, 10);
	System.out.println(supry4.toStringDebug());
	System.out.println(supry4.size());
	supry4.remove(5);
	System.out.println(supry4.toStringDebug());
	supry4.add(7, 11);
	System.out.println(supry4.toStringDebug());
	System.out.println(supry4.size());
	supry4.add(9, 12);
	System.out.println(supry4.toStringDebug());
	supry4.add(11, 13);
	System.out.println(supry4.toStringDebug());
	supry4.remove(12);
	System.out.println(supry4.toStringDebug());
	supry4.remove(0);
	System.out.println(supry4.toStringDebug());
	supry4.add(0, -1);
	System.out.println(supry4.toStringDebug());
	System.out.println(supry4.lastIndexOf(12));
	System.out.println(supry4.lastIndexOf(10));
	System.out.println(supry4.lastIndexOf(-1));
	System.out.println(supry4.lastIndexOf(-2));

	System.out.println("__________________________________________");

	System.out.println(supry4.indexOf(12));
	System.out.println(supry4.indexOf(10));
	System.out.println(supry4.indexOf(-1));
	System.out.println(supry4.indexOf(-2));

	System.out.println(supry4.toStringDebug());
	System.out.println(supry4.get(0));
	System.out.println(supry4.get(10));
	System.out.println(supry4.get(5));
	//System.out.println(supry4.get(11));

	supry4.clear();
	System.out.println(supry4);
	System.out.println(supry4.remove(0));
	System.out.println(supry4);
	
	*/

	//More Attempts to Break SuperArray
	/*
	SuperArray ary = new SuperArray();
	ary.add(10);
	ary.add(-32);
	ary.add(100);
	ary.add(5);
	ary.add(5);
	ary.add(5);
	ary.add(5);	
	ary.add(5);
	ary.add(5);
	ary.add(5);
	ary.add(5);
	ary.add(5);
	ary.add(5);
	ary.add(5);
	ary.add(5);
	ary.add(5);
	ary.add(5);
	ary.add(5);
	ary.add(5);
	ary.add(5);
	ary.add(5);
	ary.add(5);
	ary.add(100);
	ary.add(5);	
	ary.add(5);
	ary.add(5);
	ary.add(5);
	ary.add(5);
	ary.add(5);
	ary.add(5);
	ary.add(5);
	ary.add(5);
	ary.add(5);
	ary.add(5);
	ary.add(5);
	ary.add(5);
	System.out.println(ary.indexOf(5));
	System.out.println(ary.lastIndexOf(5));
	System.out.println(ary.indexOf(100));
	System.out.println(ary.lastIndexOf(100));
	*/

	//More Tests
	/*
	supry1.add(3);
	supry1.add(3);
	supry1.add(3);
	supry1.add(3);
	System.out.println(supry1.toStringDebug());
	supry1.growTo(35);
	System.out.println(supry1.toStringDebug());
	supry1.growTo(5);
	System.out.println(supry1.toStringDebug());

	System.out.println("__________________________________________");

	supry2.add(1);
	supry2.add(2);
	supry2.add(3);
	supry2.add(4);
	supry2.add(5);
	supry2.add(6);
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


	//OrderedSuperArray Tests
	
	int[] ary1 = new int[1];
	int[] ary2 = new int[5];
	
	OrderedSuperArray ordry1 = new OrderedSuperArray(ary1);
	OrderedSuperArray ordry2 = new OrderedSuperArray();
	OrderedSuperArray ordry3 = new OrderedSuperArray(ary2);
	OrderedSuperArray ordry4 = new OrderedSuperArray(2);
	
	
	//Basic Tests
	/*
	System.out.println(ordry1.toStringDebug());
	System.out.println(ordry1.size());
	ordry1.add(1);
	System.out.println(ordry1.toStringDebug());
	System.out.println(ordry1.size());
	ordry1.add(2);
	System.out.println(ordry1.toStringDebug());
	System.out.println(ordry1.size());
	ordry1.add(3);
	System.out.println(ordry1.toStringDebug());
	System.out.println(ordry1.size());
	ordry1.add(4);
	System.out.println(ordry1.toStringDebug());
	System.out.println(ordry1.size());

	System.out.println("__________________________________________");
	
	System.out.println(ordry2.toStringDebug());
	System.out.println(ordry2.size());
	ordry2.add(1);
	System.out.println(ordry2.toStringDebug());
	System.out.println(ordry2.size());
	ordry2.add(2);
	System.out.println(ordry2.toStringDebug());
	System.out.println(ordry2.size());
	ordry2.add(3);
	System.out.println(ordry2.toStringDebug());
	System.out.println(ordry2.size());
	ordry2.add(4);
	System.out.println(ordry2.toStringDebug());
	System.out.println(ordry2.size());

	System.out.println("__________________________________________");

	ordry1.add(-2);
	System.out.println(ordry1.toStringDebug());
	ordry1.add(15);
	System.out.println(ordry1.toStringDebug());
	ordry1.add(12);
	System.out.println(ordry1.toStringDebug());
	ordry1.add(-1);
	System.out.println(ordry1.toStringDebug());
	ordry1.add(0);
	System.out.println(ordry1.toStringDebug());
	ordry1.remove(3);
	System.out.println(ordry1.toStringDebug());
	*/

	//Testing Additional Constructors
	///*
	System.out.println(ordry3.toStringDebug());
	System.out.println(ordry4.toStringDebug());
	ordry4.add(4);
	ordry4.add(3);
	ordry4.add(9);
	ordry4.add(7);
	ordry4.add(8);
	ordry4.add(2);
	ordry4.add(1);
	ordry4.add(5);
	ordry4.add(6);
	ordry4.add(0);
	System.out.println(ordry4.toStringDebug());
	System.out.println(ordry4.size());
	ordry4.remove(0);
	System.out.println(ordry4.toStringDebug());
	System.out.println(ordry4.size());

	ordry3.add(36456);
	ordry3.add(35345);
	ordry3.add(74659);
	ordry3.add(87585);
	ordry3.add(47586);
	ordry3.add(86748);
	ordry3.add(53454);
	ordry3.add(52525);
	ordry3.add(25572);
	System.out.println(ordry3.toStringDebug());

        ordry3.remove(3);
	System.out.println(ordry3.toStringDebug());

	ordry3.remove(0);
	System.out.println(ordry3.toStringDebug());

	ordry3.add(75434);
	System.out.println(ordry3.toStringDebug());

	ordry3.add(-579345983);
	System.out.println(ordry3.toStringDebug());

	ordry3.trimToSize();
	System.out.println(ordry3.toStringDebug());
	//*/


    }


}
