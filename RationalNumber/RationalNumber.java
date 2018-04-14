import java.lang.*;

public class RationalNumber{
  private int numerator;
  private int denominator; //cannot be zero
  
  public RationalNumber(int numerator, int denominator){
    if(denominator==0){
      throw new IllegalArgumentException("zero denominator not allowed");
    }
    if ((numerator <0 && denominator <0)||(numerator >0 && denominator <0)){
      numerator = -1*numerator;
      denominator = -1*denominator;
    }
    this.numerator = numerator;
    this.denominator = denominator;
    this.reduce();
  }
  
  public RationalNumber(){
    this.numerator = 0;
    this.denominator = 1;
  }
  
  public int getDenominator(){
    return this.denominator;
  }
  
  public int getNumerator(){
    return this.numerator;
  }
  
  public String toString(){
    if(this.denominator ==1){
      return ""+this.numerator;
    }
    return this.numerator + "/" + this.denominator;
  }
  
  public RationalNumber multiply(RationalNumber y){
    
  
  private void reduce(){
    int gcd = slowGCD(this.numerator,this.denominator);
    this.numerator /= gcd;
    this.denominator /= gcd;    
  }
  
  private static int slowGCD(int a, int b){
    // determines the gcd of a and b by checking
    // all ints from 2 to (min(|a|,|b|))/2 
    if (a==b || (a<b && b%a==0)){
      return a;
    } else if (a%b==0){
      return b;
    }
    int x = Math.min(Math.abs(a),Math.abs(b));
    int ub = x/2;
    for(int i = ub; i>=2; i--){
      if(a%i ==0 && b%i==0){
        return i;
      }
    }
    return 1;
  }
}

    
    
      