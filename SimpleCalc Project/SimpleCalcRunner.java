    
public class SimpleCalcRunner
{
    public static void main(string[] args){
        int n1 = 1123;
        int n2 = 567;
        SimpleCalc sc = new SimpleCalc(n1, n2);
        System.out.println("Numbers: " + n1 + "," + n2);
        System.out.println("The Sum is: " + sc.add());
        