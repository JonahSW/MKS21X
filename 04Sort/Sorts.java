import java.util.*;

public class Sorts{

    public static String name(){
	return "09.Sachs-Wetstone.Jonah";
    }

    
    /**Selection sort of an int array. 
     *Upon completion, the elements of the array will be in increasing order.
     *@param data  the elements to be sorted.
     */
    //SELECTION SORT
    public static void selectionSort(int[] data){
	int len = data.length;
	int min;
	int temp;
	int pos = 0;
	boolean swapped;

	for(int i = 0; i < len; i++){
	    min = data[i];
	    swapped = false;
	    for(int p = i; p < len; p++){
		if(data[p] < min){
		    swapped = true;
		    min = data[p];
		    pos = p;
		    
		}
	    }

	    if(swapped){
		temp = data[i];
		data[pos] = temp;
		data[i] = min;
		/*
		System.out.println("***");
		System.out.println(Arrays.toString(data));
		System.out.println("***");
		*/
	    }
	}
    }

    //INSERTION SORT
    public static void insertionSort(int[] data){
	int temp;
	int len = data.length;
	int check;
	int pos;

	for(int p = 1; p < len; p++){
	    check = data[p];
	    for(int i = p; i > 0; i--){
		if(check < data[i]){
		    temp = data[0];
		}
	    }
	}
    }

    //BUBBLE SORT
    public static void bubbleSort(int[] data){
	int len = data.length;
	int temp = 0;
	int counter = 0;
	
	for(int p = 0; p < len - 1; p++){
	    for(int i = 0; i < len - 1 - p; i++){
		if(data[p] < data[p + 1]){
		    temp = data[p];
		    data[p] = data[p + 1];
		    data[p + 1] = temp;
		    counter++;
		}
	    }
	    if(counter == 0){
		return;
	    }
	}
    }
    

    //MAIN
    public static void main(String[]args){

	//SELECTION SORT TESTS
	/*
	int[] test4 = {0, 9, 8, 7, 5, 6, 4, 3, 1, 2};

	System.out.println(Arrays.toString(test4));
	selectionSort(test4);
        System.out.println(Arrays.toString(test4));

	System.out.println("=================================================");

	int[] test5 = {9, 6, 2, 0, 7, 5, 4, 1, 8, 3};

	System.out.println(Arrays.toString(test5));
	selectionSort(test5);
        System.out.println(Arrays.toString(test5));

	System.out.println("=================================================");

	int[] test = {100, 23, 54, 6, 56, 4, 3, 246, 456, 446, 23, 34, 2, 89, 30};

	System.out.println(Arrays.toString(test));
	selectionSort(test);
        System.out.println(Arrays.toString(test));

	System.out.println("=================================================");
	
	int[] test1 = {100, 0};

	System.out.println(Arrays.toString(test1));
	selectionSort(test1);
        System.out.println(Arrays.toString(test1));

	System.out.println("=================================================");

	int[]test2 = {10, 3, 544, -8, 4566, 46, -34, 0, -4656, 0, -23, 34, 2, -89, 3};

	System.out.println(Arrays.toString(test2));
	selectionSort(test2);
        System.out.println(Arrays.toString(test2));

	System.out.println("=================================================");
	
	int[] test3 = {100, 0, -100};

	System.out.println(Arrays.toString(test3));
	selectionSort(test3);
        System.out.println(Arrays.toString(test3));
	*/

	//INSERTION SORT TESTS

	int[] test4 = {0, 9, 8, 7, 5, 6, 4, 3, 1, 2};

	System.out.println(Arrays.toString(test4));
	insertionSort(test4);
        System.out.println(Arrays.toString(test4));

	System.out.println("=================================================");

	int[] test5 = {9, 6, 2, 0, 7, 5, 4, 1, 8, 3};

	System.out.println(Arrays.toString(test5));
	insertionSort(test5);
        System.out.println(Arrays.toString(test5));

	System.out.println("=================================================");

	int[] test = {100, 23, 54, 6, 56, 4, 3, 246, 456, 446, 23, 34, 2, 89, 30};

	System.out.println(Arrays.toString(test));
	insertionSort(test);
        System.out.println(Arrays.toString(test));

	System.out.println("=================================================");
	
	int[] test1 = {100, 0};

	System.out.println(Arrays.toString(test1));
	insertionSort(test1);
        System.out.println(Arrays.toString(test1));

	System.out.println("=================================================");

	int[]test2 = {10, 3, 544, -8, 4566, 46, -34, 0, -4656, 0, -23, 34, 2, -89, 3};

	System.out.println(Arrays.toString(test2));
	insertionSort(test2);
        System.out.println(Arrays.toString(test2));

	System.out.println("=================================================");
	
	int[] test3 = {100, 0, -100};

	System.out.println(Arrays.toString(test3));
	insertionSort(test3);
        System.out.println(Arrays.toString(test3));
    }

    
}
