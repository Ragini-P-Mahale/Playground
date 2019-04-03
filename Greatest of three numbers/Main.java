import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner ne =new Scanner(System.in);
      int num1= ne.nextInt();
      int num2= ne.nextInt();
      int num3= ne.nextInt();
      if(num1<num2)
      {
        if(num2<num3)
        {
          System.out.println(num3);
        }
        else{
          System.out.println(num2);
		}
      }
      else{
        System.out.println(num1);
      }}
}