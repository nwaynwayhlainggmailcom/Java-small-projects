import java.util.Scanner;
import java.util.Arrays;
class ArraySort{
	public Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Type array of index : ");
		int array[] = new int[sc.nextInt()];
		//ArraySort add = new ArraySort();
		//ArraySort show = new ArraySort();
		addData(array, sc);
		sortedData(array);
		
	}

	static void addData(int array[],Scanner sc){
		
		for(int i =0 ; i < array.length ; i++){
			System.out.println("Type Element !:");
			array[i] = sc.nextInt();
		}

	}

	static void sortedData(int array[]){
		
		for(int i =0 ; i < array.length ; i++){

			for(int j = 0 ; j < array.length-1 ; j++){
				//int temp[] = new int[0];
			    if(array[j]<array[j+1]){
				int temp = array[j];
				array[j] = array[j+1];
			 	array[j+1] = temp;
			    } 	
		    }
		}
		System.out.println("\nSorted array ::");
		for(int a : array){

			 	System.out.println("Element :: " +a);
		    }


    }
	

}
		

