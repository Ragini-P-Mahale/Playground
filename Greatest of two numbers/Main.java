import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner ni =new Scanner(System.in);
      int num1=ni.nextInt();
      int num2= ni.nextInt();
      if(num1>num2)
        System.out.println("num1 is the greatest number");
      else
        System.out.println("num2 is the greatest number");
	}
}