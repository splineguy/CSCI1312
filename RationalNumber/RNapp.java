import java.util.*;

public class RNapp{
  public static void main(String[] args){
  /*  Scanner in = new Scanner(System.in);
    String repeat = "y";
    
    while(repeat.equals("y")){
      System.out.println("Enter two integers separated by a space: ");
      
      int a = in.nextInt();
      int b = in.nextInt();
      
      System.out.println("gcd("+a+", "+b+") = "+slowGCD(a,b));
      System.out.println("Go again? (y/n): ");
      
      repeat = in.next();
    }
  }
  */

    Scanner in = new Scanner(System.in);
    String repeat = "y";
    while(repeat.equals("y")){
      System.out.print("Enter your first fraction (a/b): ");
      String frac1 = in.nextLine();
      int num1 = Integer.parseInt(frac1.substring(0,frac1.indexOf('/')));
      int den1 = Integer.parseInt(frac1.substring(frac1.indexOf('/')+1));
      System.out.print("Enter your second fraction (a/b): ");
      String frac2 = in.nextLine();
      int num2 = Integer.parseInt(frac2.substring(0,frac2.indexOf('/')));
      int den2 = Integer.parseInt(frac2.substring(frac2.indexOf('/')+1));

      RationalNumber x = new RationalNumber(num1,den1);
      RationalNumber y = new RationalNumber(num2,den2);
      System.out.println("x = " + x);
      System.out.println("y = " + y);
      System.out.println("x*y = " + x.multiply(y));
      System.out.println("x/y = " + x.divide(y));
      System.out.println("x+y = " + x.add(y));
      System.out.println("x-y = " + x.subtract(y));

      System.out.println("Go again? (y/n): ");
      
      repeat = in.nextLine();
    }
  }

}