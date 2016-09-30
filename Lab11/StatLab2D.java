
/**
 * Brandon Till
 * StatLab2D
 */
public class StatLab2D{
    public int[][] loadArray2D(int[][] n){
        int r = n.length;
        int c = n[0].length;
        int[][] newArray = new int[r][c];
        for(int i = 0; i < newArray.length; i++){
            for(int j = 0; j < newArray[r].length; j++){
                newArray[r][c] = (int)(Math.random() * 10) + 1;
            }
        }
        return newArray;
    }
    public void printArray2D(int[][] n){
        for(int i = 0; i < newArray.length; i++){
            for(int j = 0; j < newArray[r].length; j++){
                
            }
        }
    }
    public int[][] sortArray2D(int[][] n){
        
    }
    public double getMean2D(int[][] n){
        
    }
}
