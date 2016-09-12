
/**
 * Brandon Till
 * LoopOne
 */
public class LoopOne{
    int[] loop = new int[10];
    int i;
    public LoopOne(){
        
    }
    public int loadArray(){
        for(i = 0; i < loop.length; i++){
            loop[i] = i * 5 + 5;
        }
        return loop[i];
    }
    public void printArray(){
        System.out.println(loadArray());
    }
}
