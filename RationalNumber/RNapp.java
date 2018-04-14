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
    
    RationalNumber x = new RationalNumber(-780,-9720);
    RationalNumber y = new RationalNumber(14,78);
    System.out.println("x = " + x);
    System.out.println("y = " + y);
    System.out.println("x*y = " + x.multiply(y));
    System.out.println("x/y = " + x.divide(y));

  }

}