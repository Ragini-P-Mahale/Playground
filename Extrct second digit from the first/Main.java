import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner ne =new Scanner(System.in);
      int n = ne.nextInt();
      
      while(n>=100)
      {
        n= n/10;
	}
      int seconddigit =n % 10;
      System.out.println(seconddigit);
    }
}