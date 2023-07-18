import java.util.Scanner;
class calculator{
	public static void main(String [] args){
	Scanner sc= new Scanner(System.in);
	while(true){
		System.out.println("choose [1.addition,2.substraction,3.multiplication,4.division,5.exit]");
		int option=sc.nextInt();
		float a,b;
	switch(option){
		case 1:
			System.out.println("Enter the first operand:");
		a=sc.nextInt();
		System.out.println("Enter the second operand:");
		 b=sc.nextInt();
			System.out.println("The addition of the two numbers "+(int)a+" and "+(int)b+" : "+(a+b));
			break;
		case 2:
			System.out.println("Enter the first operand:");
		a=sc.nextInt();
		System.out.println("Enter the second operand:");
		b=sc.nextInt(); 
			System.out.println("The addition of the two numbers "+(int)a+" and "+(int)b+" : "+(a-b));			
			break;
		case 3:
			System.out.println("Enter the first operand:");
		a=sc.nextInt();
		System.out.println("Enter the second operand:");
		b=sc.nextInt();
			System.out.println("The addition of the two numbers "+(int)a+" and "+(int)b+" : "+(a*b));	
			break;
		case 4:
			System.out.println("Enter the first operand:");
		 a=sc.nextInt();
		System.out.println("Enter the second operand:");
		 b=sc.nextInt();
		double c=(double)(a/b);
			System.out.println("The addition of the two numbers "+(int)a+" and "+(int)b+" : "+c);		
			break;
		case 5:
			System.exit(0);
		}
		}	
	}
}