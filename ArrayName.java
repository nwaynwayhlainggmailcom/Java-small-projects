import java.util.Arrays;
import java.util.Scanner;
class ArrayName{
	private static String datas[] = new String[0];
	private static String rname[] = new String[0];

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		addName(sc);
		dataShow1();
		
		selectedData(sc);
		dataShow2();
	    
		
	}
	static void addName(Scanner sc){
			String ask = null;

			do{
				System.out.print("\nType name: " );
				setDataToArrays(sc.nextLine());
				System.out.print("\nDo you want to add more Y/N :: ");
				ask = sc.nextLine();

			}while(ask .equals("Y"));
				
			
	}

	static void setDataToArrays(String name){
		datas = Arrays.copyOf(datas,datas.length+1);
		datas [datas.length-1] = name;


	}

	static void dataShow1(){
		System.out.print("\nStored name: [" );
		for(String store : datas){
			boolean first = true;
	        for (String stored : datas) {
	            if (stored != null) {
	                if (!first) 
	                	System.out.print(", ");
	                    System.out.print(stored);
	                first = false;
			
				}
	
		    }
	    }
	    System.out.print("]" );
    }

	static void selectedData(Scanner sc){
		String  ask =  null;
		do{
			System.out.println("\nEnter remove name : ");
			outName(sc.nextLine());
			System.out.println("\nDo you want to remove  Y/N :");
			ask = sc.nextLine();
		}while(ask == "Y");


		for(int i = 0 ; i < datas.length ; i++){
			String confirm = null;
			if(rname .equals(datas)){
			System.out.println("Found !! Do you want to remove more :: Y/N");
			confirm = sc.nextLine();
					
			}if(confirm == "Y"){

				// start from same index of removename and ++
				for(int j = i ; j < datas.length-1 ; i++){ //rname.length-1 cuz of line 86
					rname[j] = rname[j+1];  //assign
				} 
				
				System.out.println("Successfully removed !!");
				
			}else{
				dataShow1();
			}
			}

				

	    }
	    
	    datas[datas.length-1] = null;

	    
		}

		static void dataShow2(){
			System.out.print("\nUpdated storedNames: [");
        boolean second = true;
        for (String sname : datas) {
            if (sname != null) {
                if (!second) 
                	System.out.print(", ");
                    System.out.print(sname);
                second = false;
            }
        }
        System.out.println("]");

		}

	    static void outName(String out){
		rname = Arrays.copyOf(rname,rname.length+1); //*
		rname[rname.length-1] = out;

	    }


}

	

