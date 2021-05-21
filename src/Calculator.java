public class Calculator{
 /*
  A basic calculator program for practice
  Author: Narmadha
 */

    public Calculator(){

    }
    public int add(int a, int b){
        return a+b;
    }
    public int subtract(int a, int b){
        return a-b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
    public int divide(int a, int b){
        return a/b;
    }
    public int modulo(int a, int b){
        return a%b;
    }
    public String toString()
    {
        return "A basi Calculator";
    }

    public static void main(String[] args){
        Calculator myCalculator = new Calculator();

        // Addition
        int sum = myCalculator.add(5,7);
        System.out.println(sum);

        // Subtraction
        int sub = myCalculator.subtract(45,1);
        System.out.println(sub);

        // Multiplication
        int mul = myCalculator.multiply(452,9);
        System.out.println(mul);

        // Division
        int div = myCalculator.divide(8, 4);
        System.out.println(div);

        // Modulo

        int mod = myCalculator.modulo(6, 5);
        System.out.println(mod);


    }
}
