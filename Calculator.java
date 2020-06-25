import java.util.*;
class Calc{
public static int powerInt(int num1,int num2){
return Math.pow(num1,num2);
}
public static double poweDouble(double num1,double num2){
return Math.pow(num1,num2);
}
}
class Calculator{
public static void main(String[] args){
System.out.println(Calculator.powerInt(2,4));
System.out.println(Calculator.powerDouble(3.4,2.5));
}
}
