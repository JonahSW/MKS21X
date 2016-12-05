import java.util.Iterator;

public class SuperArrayIterator exends StringySuperArray implements Iterator<String>{
    public int counter;
    public int end;
    
    //constructor to initialize state of iterator
    public SuperArrayIterator(){
	counter = 0;
	size() = end;
    }
    
    //hasNext function:
    public boolean hasNext(){
	//System.out.println("I like to cause problems");
	//System.out.println(counter);
	
	if(counter < end - 1){
	    //System.out.println("I like to cause problems");
	    return true;
	}
	
	return false;
    }

    //next function:
    public String next(){
	String temp = get(counter);
	counter++;
	return temp;
    }

    //remove function (UNSUPPORTED)
    public void remove(){
	throw new UnsupportedOperationException();
    }

}
