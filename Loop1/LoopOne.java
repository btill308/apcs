						
/**
 * Brandon Till
 * LoopOne
 */
public class LoopOne{
    int[] loop = new int[10];
    int i;
    public int[] loadArray(){
        for(i = 0; i < loop.length; i++){
            loop[i] = i * 5 + 5;
        }
        return loop;
    }

    public void printArray(){
        for(i = 0; i < loop.length; i++){
            System.out.print(loop[i] + "\t");
        }
    }
}
