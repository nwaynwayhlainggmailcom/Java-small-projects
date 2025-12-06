import java.util.Scanner;
class CheckMark{
	public static int myan,eng,maths,chem,phy,bio;
	public static Scanner sc =  new Scanner(System.in);
	public static void main(String[] args){

		
	//input six major(myan,eng,maths,chem,phy,bio)
		System.out.println("Enter your myan marks");
		myan = sc.nextInt();

		System.out.println("Enter your eng marks");
		eng= sc.nextInt();

		System.out.println("Enter your maths marks");
		maths = sc.nextInt();

		System.out.println("Enter your chem marks");
		chem = sc.nextInt();

		System.out.println("Enter your phy marks");
		phy  = sc.nextInt();

		System.out.println("Enter your bio marks");
		bio  = sc.nextInt();

		var check = new CheckMark();
		check.checkDistinction();

		System.out.println("Grade :: " + check.checkGrade()); 

    }
	// fail
		
	boolean isfail(){

		    return (myan <40 || eng <40 ||
		 	        maths <40 || chem <40 ||
		 	        phy <40 || bio <40 );
		}

		// normal pass
		boolean normalPass(){

			return(myan <75 || eng <75 ||
		 	       maths <75 || chem <75 ||
		 	       phy <75 || bio <75 );
		}

		//check distinction
		void checkDistinction(){
			if(isfail()){
				System.out.println("Try Again !");
			}else if(normalPass()){
				System.out.println("Congratulation !!");
			}else{
				int distinction = 0;

				if(myan >= 75)
					distinction ++;

				if(eng >= 75)
					distinction ++;

				if(maths >= 75)
					distinction ++;

				if(chem >= 75)
					distinction ++;

				if(phy >= 75)
					distinction ++;

				if(bio >= 75)
					distinction ++;

				System.out.println("YOU passed with %dD" .formatted(distinction));
			}
		}

			//check grade
			String checkGrade(){
				int total = (myan + eng + maths + chem +phy +bio);
				int average = total /6;
				
				System.out.println("Total Marks : " +total);
				System.out.println("Average Marks : " +average);


				if(average > 90){
					return "A";
				}else if(average >= 80){
					return "B";
				}else if(average >= 60){
					return "C";
				}else if(average >= 40){
					return "D";
				}else{
					return "E";
				}
			}
			
}
