import java.util.Scanner;

class Factorial{
  public static void main(String args[])  {
    int num , i, fact = 1;

    System.out.println("Enter an integer to calculate its factorial");
    Scanner in = new Scanner(System.in);

    num = in.nextInt();

    if (num < 0)
      System.out.println("Number should be non-negative.");
    else {
      	for (i= 1; i <= num; i++)
        	fact = fact * i;

      System.out.println("Factorial of "+ num +" is = "+ fact);
    }
  }
}
