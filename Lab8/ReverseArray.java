
/**
 *Brandon Till
 *ReverseArray
 */
public class ReverseArray{
    int[] nums = new int[10];
    public int[] reverseArray(int[] x){
        for(int i = 0; i < x.length; i++){
            x[i] = (int) (Math.random() * 99);
        }
        int[] reverse = new int[x.length];
        for(int i = 0; i < x.length; i++){
            for(int j = x.length - 1; j >= 0; j--){
                reverse[j] = x[i];
            }
        }
        for(int i = 0; i < x.length; i++){
            System.out.print("Original Array:" + "\n" + x[i]);
        }
        System.out.println();
        for(int i = 0; i < x.length; i++){
            System.out.print("Reversed Array:" + "\n" + reverse[i]);
        }
        return reverse;
    }
}
