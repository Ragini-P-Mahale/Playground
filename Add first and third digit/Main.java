import java.util.Scanner;
class Main{
	public static void main (String[] args) {
      Scanner ne = new Scanner(System.in);
      int num= ne.nextInt();
      int num1=num%10;
      int num2=num/100;
      int sum= num1+num2;
      System.out.println(sum);
		// Type your code here
	}
}