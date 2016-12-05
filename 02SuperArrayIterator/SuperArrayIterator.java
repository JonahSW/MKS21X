import java.util.Iterator;

public class SuperArrayIterator implements Iterator<String> {
    private StringySuperArray array;
    public int counter;
    private int size;
    //public int end;
    
    //constructor to initialize state of iterator
    public SuperArrayIterator(StringySuperArray array){
	counter = 0;
	this.array = array;
    }
    
    //hasNext function:
    public boolean hasNext(){
	//System.out.println("I like to cause problems");
	//System.out.println(size());
	
	if(counter < array.size()){
	    //System.out.println("I like to cause problems");
	    return true;
	}
	
	return false;
    }

    //next function:
    public String next(){
	String temp = array.get(counter);
	counter++;
	return temp;
    }

    //remove function (UNSUPPORTED)
    public void remove(){
	throw new UnsupportedOperationException();
    }

}
