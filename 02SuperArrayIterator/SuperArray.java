//SuperArray
//Functions do not print out their own values, only return them. This is because
//I find it easier to to control when I want something to print in the test case.
//I don't lose track of the output of a series of tests if there are a lot
//of function calls, and it is easier to troubleshoot

public class SuperArray{
    private int[] data;
    private int size;

    //CONSTRUCTORS
    
    //0
    //tested
    //constructor make an empty superArray should make size 0, 
    //but the data capacity 10.
    public SuperArray(){
	data = new int[10];
    }

    //0.1
    //tested
    //constructor make an empty superArray should make size 0, 
    //but the data capacity is initialized by the user.
    public SuperArray(int initCap){
	data = new int[initCap];
	if (initCap < 0){
	    throw new IllegalArgumentException();
	}
    }

    //ACCESSORS
    
    //-3
    //tested
    //Accessor Method for data[index]
    public int data(int p){
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
    public void incrementSize(){
	size++;
    }

    //-5
    //Mutator method for size, decrements size by 1
    public void decrementSize(){
	size--;
    }

    //OTHER METHODS
    //1
    //tested
    /**add the value n to the next available slot in the superArray.
     *this will change the size. This function should always work
     *And will resize the SuperArray if needed.*/
    public void add(int n){
	if(size == data.length){
	    grow();
	}
	
	data[size] = n;
	size++;
    }


    //2
    //tested
    /**Resize the data, by making a new array, then copying over elements,
    //use this as your data.
     */

    public void grow(){
	int[] temp = new int[1];
	
	if(length() == 0){
	    data = temp;
	}
	else{
	    for(int p = 0; p < length(); p++){
		temp[p] = data[p];
		data = temp;
	    }
	}
    }

    //3
    //tested
    /**format the super array like this :   [ 1, 3, 6, 8, 23, 99, -4, 5] 
     *commas between... square bracket start/end and no comma at end.*/

    public String toString(){
	String str = "";
	for(int p = 0; p < size - 1; p++){
	    str = str + data[p] + ", ";
	}
	if(size == 0){
	    return "[" + str + "]";
	}
	else
	return "[" + str + data[size - 1] + "]";
    }

    //3.1
    //for testing toArray
    //toStrign function that returns a string based off of a normal array
    public String toString(int[] array){
	String str = "";
	for(int p = 0; p < array.length - 1; p++){
	    str = str + array[p] + ", ";
	}
	if(size == 0){
	    return "[" + str + "]";
	}
	else
	return "[" + str + array[array.length - 1] + "]";
    }
    
    //4
    //tested
    /**format the super array like this :   [ 1, 8, 23, 99, -4, 5, _, _, _, _]   
     *(capacity is 10, but only 6 are used)
     *commas between... square bracket start/end and no comma at end.
     *unused slots should be printed as _ (underscores) */
    //If data == size, returns an additional underscore after the array
    public String toStringDebug(){
	String str = "";
	String empt = "";
	
	for(int p = 0; p < size; p++){
	    str = str + data[p] + ", ";
	}
	for(int p = size; p < data.length - 1; p++){
	    empt = empt + "_, ";
	}
	
	return "[" + str + empt + "_]";
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
    public int get(int index) {
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
    public int set(int index, int element){
	if((index < 0) || (index >= size())){
	    throw new IndexOutOfBoundsException();
	}
	
	int deleted = data[index];
	data[index] = element;
	return deleted;
    }

    //10
    //tested
    //Inserts the specified element at the specified position in this list.
    //Shifts the element currently at that position (if any) and any subsequent
    //elements to the right (adds one to their indices).
    //Will not add properly  an element to the last place in an array
    /*
      Parameters:
      index - index at which the specified element is to be inserted
      element - element to be inserted
      Throws:
      IndexOutOfBoundsException - if the index is out of range
      (index < 0 || index > size())
    */
    public void add(int index, int element){
	int[] temp = new int[data.length + 1];
	
	//System.out.println(data.toString()); //(Added for debugging)

	if((index < 0) || (index > size())){
	    throw new IndexOutOfBoundsException();
	}

	if(size ==  data.length){
	    grow();
	}
	//System.out.println(data.toString());
	
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
    public int remove(int index){
	if((index < 0) || (index >= size())){
	    throw new IndexOutOfBoundsException();
	}

	size--;
	int deleted = data[index];
	for(int p = index; p < size; p++){
	    data[p] = data[p + 1];
	}

	return deleted;
    }

    //12
    //tested
    // Returns an array containing all of the elements in this list in proper
    //sequence (from first to last element).

    public int[] toArray(){
	int[] array = new int[size];

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
    public int indexOf(int i){
	int x = 0;
	
	for(int p = 0; p < size; p++){
	    if(data[p] == i){
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
    public int lastIndexOf(int i){
	int x = -1;
	
	for(int p = 0; p < size; p++){
	    if(data[p] == i){
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
	int[] temp;
	
	if(size == 0){
	    temp = new int[0];
	} else {
	    temp = new int[size];
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

	int[] temp = new int[newcap];

	for(int p = 0; p < size; p++){
	    temp[p] = data[p];
	}
	
	data = temp;
    }
    
    //end
       }
