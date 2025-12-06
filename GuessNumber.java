import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
//import java.util.*;
class GuessNumber{
	public static Scanner sc =  new Scanner(System.in);
	public static void main(String[] args){
		boolean flag = false;

		while(!flag){

			//generate random number
			int random = ThreadLocalRandom.current().nextInt(1,5);
			System.out.println("Random Number : " + random);

			//get user input
			System.out.println("\nEnter your guess number : ");
			int input = sc.nextInt();
			
			//compare
		// if(random == input){
		// 	System.out.println("User Win !!");
		// 	flag = true;

		// }else
		// 		System.out.println("Computer Win !!");
		// 	//result

		boolean same = input == random;

      //  if condition is infront of ? , else condition is back of :
		String message = same ? "User Win" : "Computer Win"; // ? is used as if
		flag = true;
		System.out.println("Result : " +message);


		}
		System.out.println("Terminated !!");

	}
}
