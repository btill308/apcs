/**
 *Brandon Till
 *SimpleCalc
 */
public class SimpleCalc
{
    int n1;
    int n2;
    public SimpleCalc()
    {
        n1 = 3826;
        n2 = 427;
    }
    public int add()
    {
        return n1 + n2;
    }
    public int sub()
    {
        return n1 - n2;
    }
    public int mult()
    {
        return n1 * n2;
    }
    public int div()
    {
        return n1 / n2;
    }
    public boolean isGreater()
    {
        if(n1 > n2){
            return true;
        }
        else{
            return false;
        }
    }
}
