
/**
 * Brandon Till
 * CountOddEven
 */
public class CountOddEven{
    int[][] countOddEven = new int[5][5];
    private int even = 0;
    private int odd = 0;
    public int[][] loadArray(int[][] countOddEven){
        for(int i = 0; i < countOddEven.length; i++){
            for(int j = 0; j < countOddEven[i].length; j++){
                countOddEven[i][j] = (int)(Math.random() * 20) + 1;
            }
        }
        return countOddEven;
    }
    public int countEven(int[][] countOddEven){
        for(int i = 0; i < countOddEven.length; i++){
            for(int j = 0; j < countOddEven[i].length; j++){
                even++;
            }
        }
        return even;
    }
    public int countOdd(int[][] countOddEven){
        for(int i = 0; i < countOddEven.length; i++){
            for(int j = 0; j < countOddEven[i].length; j++){
                odd++;
            }
        }
        return odd;
    }
    public int getEven(){
        return even;
    }
    public int getOdd(){
        return odd;
    }
}
