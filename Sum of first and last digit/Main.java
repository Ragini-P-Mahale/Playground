import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner ne =new Scanner(System.in);
      int n = ne.nextInt();
      int lastDigit = n%10;
      while(n>=10)
      {
        n= n/10;
	}
      int sum = lastDigit + n;
      System.out.println(sum);
    }
}