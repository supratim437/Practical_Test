package MachineTest;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		//Take the range between 25 to 51
		int start=25;
		int end=51;
		//take a variable sum to store the result
		int sum=0;
		for(int i=start;i<=end;i++) {
			//Cheak even numbers in between the range
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println("The sum of numbers between 25 to 51 is "+sum);
	}

}
