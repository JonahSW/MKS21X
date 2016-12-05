//Stringy SuperArray

//Functions do not print out their own values, only return them. This is because
//I find it easier to to control when I want something to print in the test case.
//I don't lose track of the output of a series of tests if there are a lot
//of function calls, and it is easier to troubleshoot

public class StringySuperArray implements Iterable<String>{
    private String[] data;
    private int size;

    //CONSTRUCTORS
    
    //0
    //tested
    //constructor make an empty superArray should make size 0, 
    //but the data capacity 10.
    public StringySuperArray(){
	data = new String[10];
    }

    //0.1
    //tested
    //constructor make an empty superArray should make size 0, 
    //but the data capacity is initialized by the user.
    public StringySuperArray(int initCap){
	data = new String[initCap];
	if (initCap < 0){
	    throw new IllegalArgumentException();
	}
    }

    //ITERATOR METHOD
    public SuperArrayIterator iterator(){
	return new SuperArrayIterator();
    }

    //ACCESSORS
    
    //-3
    //tested
    //Accessor Method for data[index]
    public String data(int p){
	if((p < 0) || (p > size)){
	    throw new IndexOutOfBoundsException();
	}
	else{
	    return data[p];
	}
    }
    
    //-2
    //tested
    //Accessor Method for data.length
    //unused
    public int length(){
	return data.length;
    }
    
    //-1
    //tested
    //accessor method for size
    public int size(){
	return size;
    }

    
    //MUTATORS

    //-4
    //Mutator method for size, increments size by 1
    //unused
    // public void incrementSize(){
    //	size++;
    //}

    //-5
    //Mutator method for size, decrements size by 1
    //unused
    //public void decrementSize(){
    //	size--;
    //}

    //OTHER METHODS
   //1
    //tested
    /**add the value n to the next available slot in the superArray.
     *this will change the size. This function should always work
     *And will resize the SuperArray if needed.*/
    public boolean add(String str){
	boolean a = false;
	//System.out.println("I cause problems");
	
	if(size == length()){
	    grow();
	}

       	data[size] = str;
	
	
	if(data[size] == str){
	    a = true;
	}

	size++;
	
	return a;
    }


    //2
    //tested
    /**Resize the data, by making a new array, then copying over elements,
    //use this as your data.
     */

    public void grow(){
	String[] temp = new String[data.length + 10];
	
	//System.out.println(data[1]);
	for(int p = 0; p < size(); p++){
	    //System.out.println(p);
	    //System.out.println(temp[p]);
	    //System.out.println(data[1]);
	    //System.out.println(data[p]);
	    temp[p] = data[p];
	    //System.out.println("---");
	    //System.out.println(temp[p]);
	    //System.out.println(data[p]);
	    //System.out.println("----------");
	}

	data = temp;
    }

    
    //3
    //tested
    /**format the super array like this :   [ 1, 3, 6, 8, 23, 99, -4, 5] 
     *commas between... square bracket start/end and no comma at end.*/

    public String toString(){
        String str = "";

	if(size == 0){
	    return "[]";
	}
	
	for(int p = 0; p < size() - 1; p++){
	    str = str + data[p] + ", ";
	}	
	return "[" + str + data[size - 1] + "]";
    }

    //3.1
    //For testing toArray/troublehooting
    //toString function that returns a string based off of a normal array
    //requires an array, doesnt work with a SuperArray
    public String toString(String[] array){
	String str = "";
	
	for(int p = 0; p < array.length - 1; p++){
	    str = str + array[p] + ", ";
	}
	return "[" + str + array[size - 1] + "]";
    }
    
    //4
    //tested
    /**format the super array like this :   [ 1, 8, 23, 99, -4, 5, _, _, _, _]   
     *(capacity is 10, but only 6 are used)
     *commas between... square bracket start/end and no comma at end.
     *unused slots should be printed as _ (underscores)
     */
    public String toStringDebug(){
	String str = "";

	//Deals with the empty array
	if(data.length == 0){
	    return "[]";
	}

	//Prevents IndexOutOfBounds when size == 0
	if(size == 0){
	    str = "_";
	    for(int p = 0; p < data.length - 1; p++){
		str = str + ", _";
	    }
	    return "[" + str + "]";
	}
	
	//For normal arrays
	for(int p = 0; p < size() - 1; p++){
	    str = str + data[p] + ", ";
	}
	str = str + data[size - 1];

	for(int p = 0; p < data.length - size; p++){
	    str = str + ", _";
	}

	return "[" + str + "]";
    }

    

    //6
    //tested
    //accessor method for getting the number at a given index of a SuperArray
    /*private int get(int n){
	return data[n];
	}
	Parameters:
	index - index of the element to return
	Returns:
	the element at the specified position in this list
	Throws:
	IndexOutOfBoundsException - if the index is out of range
	(index < 0 || index >= size())*/
    public String get(int index) {
	if ((index < 0) || (index >= size())){
	    throw new IndexOutOfBoundsException();
	}
	else
	return data[index];
    }

    //7
    //tested
    // Removes all of the elements from this list
    public void clear(){
	size = 0;
	
    }

    //8
    //tested
    //Returns true if this list contains no elements.
    public boolean isEmpty(){
	if(size == 0){
	    return true;
	}
	else
	    return false;
    }

    //9
    //tested
    //Replaces the element at the specified position in this list with the
    //specified element. Returns the value of the element replaced.
    /*Parameters:
      index - index of the element to replace
      element - element to be stored at the specified position
      Returns:
      the element previously at the specified position
      Throws:
      IndexOutOfBoundsException - if the index is out of range
      (index < 0 || index >= size())
    */
    public String set(int index, String element){
	if((index < 0) || (index >= size())){
	    throw new IndexOutOfBoundsException();
	}
	
	String deleted = data[index];
	data[index] = element;
	return deleted;
    }

    //10
    //tested
    //Inserts the specified element at the specified position in this list.
    //Shifts the element currently at that position (if any) and any subsequent
    //elements to the right (adds one to their indices).
    /*
      Parameters:
      index - index at which the specified element is to be inserted
      element - element to be inserted
      Throws:
      IndexOutOfBoundsException - if the index is out of range
      (index < 0 || index > size())
    */
    public void add(int index, String element){
	String[] temp = new String[data.length + 1];
	
	//System.out.println(data.toString()); //(Added for debugging)

	if((index < 0) || (index > size())){
	    throw new IndexOutOfBoundsException();
	}

	if(size ==  data.length){
	    grow();
	}
	
	for(int p = 0; p < index; p++){
	    temp[p] = data[p];
	}

	for(int p = index; p < size; p++){
	    temp[p + 1] = data[p];
	}

	temp[index] = element;
	
	data = temp;
        size++;
    }
    
    //11
    //tested
    //Removes the element at the specified position in this list. Shifts any
    //subsequent elements to the left (subtracts one from their indices). The
    //value returned is the value of the element removed.
    /*
      Parameters:
      index - the index of the element to be removed
      Returns:
      the element that was removed from the list
      Throws:
      IndexOutOfBoundsException - if the index is out of range
      (index < 0 || index >= size())
     */
    public String remove(int index){
	if((index < 0) || (index >= size())){
	    throw new IndexOutOfBoundsException();
	}

	size--;
	String deleted = data[index];
	for(int p = index; p < size; p++){
	    data[p] = data[p + 1];
	}

	return deleted;
    }

    //12
    //tested
    // Returns an array containing all of the elements in this list in proper
    //sequence (from first to last element).

    public String[] toArray(){
	String[] array = new String[size];

	for(int p = 0; p < size; p++){
	    array[p] = data[p];
	}

	//for testing. why does this not work
	//System.out.println(toString(array));
	return array;
    }

    //13
    //tested
    //Returns the index of the first occurrence of the specified element in
    //this list, or -1 if this list does not contain the element.
    public int indexOf(String element){
	int x = 0;
	
	for(int p = 0; p < size; p++){
	    if(data[p] == element){
		x = p;
		p = size;
		return x;
	    }
	}
	return -1;
    }

    //14
    //tested
    //Returns the index of the last occurrence of the specified element in
    //this list, or -1 if this list does not contain the element.
    public int lastIndexOf(String element){
	int x = -1;
	
	for(int p = 0; p < size; p++){
	    if(data[p] == element){
		x = p;
	    }
	}
	return x;
    }
    
    //15
    //Trims the capacity of this SuperArray instance to be the list's
    //current size.
    //When tested with toStringDebug, string has an extra underscore when
    //array does not.
    public void trimToSize(){
	String[] temp;
	
	if(size == 0){
	    temp = new String[0];
	} else {
	    temp = new String[size];
	}

	for(int p = 0; p < size; p++){
	    temp[p] = data[p];
	}
	
	data = temp;
    }

    //16
    //growTo changes the capacity of the array to a given capacity
    public void growTo(int newcap){
	if(newcap < size){
	    throw new IndexOutOfBoundsException();
	}

	String[] temp = new String[newcap];

	for(int p = 0; p < size; p++){
	    temp[p] = data[p];
	}
	
	data = temp;
    }
    //END

    public static void main(String[]args){

    }
       }
