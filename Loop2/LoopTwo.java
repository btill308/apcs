
/**
 * Brandon Till
 * LoopTwo
 */
import java.util.Arrays;
public class LoopTwo{
    int n;
    int i;
    int sum;
    int[] loop = new int[n];
    public LoopTwo(){
        n = 100;
    }
    public void loadRandom(){
        for(i = 0; i < loop.length; i++){
            loop[i] = (int)(Math.random() * 10) + 1;
        }
    }
    public void printArray(){
        for(i = 0; i < loop.length; i++){
            System.out.print(loop[i] + "\t");
        }
    }
    public int[] sortArray(){
        Arrays.sort(loop);
        return loop;
    }
    public double findAverage(){
        for(i = 0; i < loop.length; i++){
            sum = sum + loop[i];
        }
        return sum / loop.length;
    }
}
