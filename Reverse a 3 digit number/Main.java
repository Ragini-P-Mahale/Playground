import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner ne =new Scanner(System.in);
      int num= ne.nextInt();
    int num1=num/100;
    int num2=(num/10)%10;
    int num3=num%10;
    int num4=(num3*100)+(num2*10)+num1;
    System.out.print(num4);
    
  }
}