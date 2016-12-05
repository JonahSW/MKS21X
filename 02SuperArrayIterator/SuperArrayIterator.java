import java.util.Iterator;

public class SuperArrayIterator implements Iterator<String>{
    public int counter;
    public StringySuperArray supry;
    
    //constructor to initialize state of iterator
    public SuperArrayIterator(){
	counter = 0;
    }
    
    //hasNext function:
    public boolean hasNext(){
	System.out.println(supry.size());
	if(counter < supry.size() - 1){
	    System.out.println("I like to cause problems");
	    return true;
	}

	return false;
    }

    //next function:
    public String next(){
	String temp = supry.data(counter);
	counter++;
	return temp;
    }

    //remove function (UNSUPPORTED)
    public void remove(){
	throw new UnsupportedOperationException();
    }

}
