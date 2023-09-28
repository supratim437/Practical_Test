package MachineTest;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1. Addition");
			System.out.println("2. Substraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Exit");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			if(choice==5) {
				System.out.println("Invalid Request");
				break;
			}
			
			System.out.println("Enter the 1st Number");
			int num1=sc.nextInt();
			
			System.out.println("Enter the 2nd Number");
			int num2=sc.nextInt();
			
			switch(choice) {
				case 1:
					int sum=num1+num2;
					System.out.println("Addition = "+sum);
				break;	
				case 2:
					int substraction=num1-num2;
					System.out.println("Substraction = "+substraction);
				break;	
				case 3:
					int multi=num1+num2;
					System.out.println("Multiplication = "+multi);
				break;	
				case 4:
					double div=num1/num2;
					System.out.println("Addition = "+div);
				break;	
				
				
			}
			
		}
		
	}

}
