/**
 * Brandon Till
 * SimpleCalcRunner
 */
public class SimpleCalcRunner
{
    public static void main(String[] args){
        int n1 = 3826;
        int n2 = 427;
        SimpleCalc sc = new SimpleCalc();
        System.out.println("Numbers: " + n1 + "," + n2);
        System.out.println("The Sum is: " + sc.add());
        System.out.println("Subtraction: " + sc.sub());
        System.out.println("Product: " + sc.mult());
        System.out.println("Quotient: " + sc.div());
        System.out.println("Greater than?: " + sc.isGreater());
   }
}
        