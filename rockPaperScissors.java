import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class rockPaperScissors{
	public static String toolName(int tool) {
	        if (tool == 1) 
	        	return "Rock";
	        else if (tool == 2) 
	        	return "Paper";
	        else 
	        	return "Scissors";
            }

	

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); 
		//boolean flag = false;

		int roundsplayed = 0;
		int ties = 0;
		int wins = 0;
		int loses = 0;
		int youwin = 0;
		int computerwin = 0;

    
	    String result;
		String history ="";
		//String historyarrays[] = new String[4];
	   
    
		while(roundsplayed < 4) {

			System.out.println("\n");
			System.out.println("+--------------------------+");
			System.out.println("| Rock, Paper, Scissors    |");
			System.out.println("+--------------------------+");
	        System.out.println("| 1. Rock                  |");
	        System.out.println("| 2. Paper                 |");
	        System.out.println("| 3. Scissors              |");
	        System.out.println("| 4. Quit                  |");
	        System.out.println("+--------------------------+");

		
			System.out.println("\n================================");
			System.out.println("Choose your tool :" );
			int urtool = sc.nextInt();
			

			if(urtool == 4) {

				System.out.println("\n==============================");
				System.out.println(" your choice is Quit !");
				System.out.println("\nSee you in next time!!");
				return;
			}
			

			int comtool = ThreadLocalRandom.current().nextInt(1,3);
			System.out.println( "\nComputer's tool is : " + toolName(comtool));
			

			if(urtool == 1)
				System.out.println("your choice is  : Rock");
			else if(urtool == 2)
				System.out.println("your choice is  : Paper");
			else if(urtool == 3)
				System.out.println("your choice is  : Scissors");
			else 
				System.out.println("your choice is  : Quit");

			

			if(toolName(urtool) == toolName(comtool)) {

			    result = " It's a tie !" ;
				System.out.println(result);
	
			    ties++;
			    
			}
			else if((toolName(comtool).equals ("Scissors") && toolName(urtool) .equals ("Rock"))||
			        (toolName(comtool).equals ("Rock")  && toolName(urtool) .equals ("Paper"))||
			        (toolName(comtool) .equals ("Paper") && toolName(urtool) .equals ("Scissors"))) {
				result = " You Win !!! ";
				System.out.println(result);
				
			    wins++;
			    youwin++;
			}
			else {
				result = " You Lose !!";
				System.out.println(result);
				
			    loses++;
			    computerwin++;
			    
			}
			 
			roundsplayed++;

			if(toolName(urtool) == toolName(comtool)){
				history += "Round :" + roundsplayed + result + "  " + toolName(urtool) + " " + " equals " + " " + toolName(comtool) +"\n" ;
			}else{
			history += "Round :" + roundsplayed + result + "  " + toolName(urtool) + " " + " beats " + " " + toolName(comtool) +"\n" ;
		    }

			
           // history += "Round" + roundsplayed + result + "  " + toolName(urtool) + " " + " equals " + " " + toolName(comtool);

			System.out.println("\n===============================");
			System.out.println("\nCurrent Score : ");
			System.out.println("Tie : " +ties);
		    System.out.println("Win : " +wins);
		    System.out.println("Lose : " +loses);
			System.out.println("\n");

			
		}

			System.out.println("\n=================================");
			System.out.println("\n=========== Game Over ===========");
			System.out.println("\nFinal Score  : ");

			System.out.println("+=================================+");
			System.out.println("|           Final Score           |  ");
			System.out.println("+=================================+");
			System.out.println("   Total Win  |    You : " +youwin );
			System.out.println("   Total Win  |Computer: " +computerwin );
			System.out.println("+=================================+");
			System.out.println("   Ties       |    " + ties  );
			System.out.println("+=================================+");

			System.out.println("\n");
			System.out.println("\nGame History :: ");
			
			System.out.println(history);
			
	

			System.out.println("\n");
			System.out.println(" \nThanks for playing :-) !!");
		
	}

	
}


