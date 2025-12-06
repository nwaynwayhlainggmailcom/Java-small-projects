import java.util.Scanner;
class Calculator{
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		//input num1
		System.out.println("Enter number for num1 : ");
		int num1 = sc.nextInt();

		// input num2
		System.out.println("Enter number for num2 : ");
		int num2 = sc.nextInt();

		//input operator(char)
		System.out.println("Enter operator(+.-.*./) : ");
		char ope = sc.next().charAt(0);

		//calculation
		calculate(num1, num2 ,ope);


	}
	static void calculate(int n1,int n2 , char op){

		if(op == '+')
			System.out.println("Result :" +(n1 + n2));
		else if(op == '-')
			System.out.println("Result :" +(n1 - n2));
		else if(op == '*')
			System.out.println("Result :" +(n1 * n2));
		else if(op == '/')
			System.out.println("Result :" +(n1 / n2));
		else
			System.out.println("Invalid data");
	}
}
