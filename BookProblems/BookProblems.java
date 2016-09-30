
/**
 * Brandon Till
 * BookProblems
 */
public class BookProblems
{
    public static void main(String[] args){
        problem5();
        problem6();
        problem7();
//         problem8();
    }
    public static void problem5(){
        for(int i = 1; i<=5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void problem6(){
        for(int i = 1; i <= 7; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void problem7(){
        for(int i = 1; i <= 5; i++){
            for(int j = 4; j >= i; j--){
                System.out.print(" ");
            }
            System.out.println(i);
        }
    }
//     public static void problem8(){
//         for(int i = 1; i <= 5; i++){
//             for(int j = 4; j >= i; j--){
//                 System.out.print(" ");
//             }
//             System.out.println(i);
//         }
//         }
    }
