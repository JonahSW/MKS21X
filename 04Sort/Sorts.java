import java.util.*;

public class Sorts{

    public static String name(){
	return "09.Sachs-Wetstone.Jonah";
    }

    
    /**Selection sort of an int array. 
     *Upon completion, the elements of the array will be in increasing order.
     *@param data  the elements to be sorted.
     */
    public static void selectionSort(int[] data){
	int len = data.length;
	int min;
	int temp = 0;
	int pos = 0;

	for(int i = 0; i < len; i++){
	    min = data[i];
	    for(int p = i; p < len; p++){
		if(data[p] < min){
		    min = data[p];
		    pos = p;
		}
	    }

	    temp = data[i];
	    data[pos] = temp;
	    data[i] = min;
	}
    }
	

    public static void main(String[]args){
	int[] test = {100, 23, 54, 6, 56, 4, 3, 246, 456, 446, 23, 34, 2, 89, 3};

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
    }

    
}
