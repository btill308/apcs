/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";
// 		
// 		Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		int notFoundPsn = sample.indexOf("slow");
		System.out.println("sample.indexOf(\"slow\") = " + notFoundPsn);
		
// 		//  Demonstrate the toLowerCase method.
// 		String lowerCase = sample.toLowerCase();
// 		System.out.println ("sample.toLowerCase() = " + lowerCase);
// 		System.out.println ("After toLowerCase(), sample = " + sample);
// 		
// 		//  Try other methods here:
//         boolean x = true;
//         boolean y = false;
//         System.out.println(x&&y);
//         System.out.println(x||y);
//         System.out.println(!(x&&y));
//         System.out.println(!(x||y));
//         
//         int a = 3;
//         int b = 7;
//         if(a>5 && b>5){
//             System.out.println("both are >5");
//         }
//         System.out.println("testing");
//         
//         int c = 9;
//         int d = 10;
//         if(c>5 && d>5){
//             System.out.println("both are >5");
//         }
//         System.out.println("testing");
//         
//         String x = "true";
//         String y = "false";
//         String z = "false";
//         System.out.println(x.equals(y));
//         System.out.println(!x.equals(y));
//         System.out.println(!(x.equals(z) || y.equals(z)));
//         System.out.println(!(x.equals(z) && y.equals(z)));
//         
//         String s1 = "The big Frog Ate the Fly";
//         String s2 = "I love Mississippi";
//         System.out.println("a = " + s1.indexOf("i"));
//         System.out.println("b = " + s2.indexOf("i"));
//         System.out.println("c = " + s1.indexOf("Ate"));
//         
//         String t1 = "The big Frog Ate the Fly";
//         String t2 = "I love Mississippi";
//         System.out.println("a = " + t1.substring(20));
//         System.out.println("b = " + t1.substring(0,4));
//         System.out.println("c = " + t2.substring(2,6));
//         
//         String s1 = "Superman is better than Batman";
//         String s2 = s1.substring(s1.indexOf("better"),11);
//         System.out.println("Batman is" + s2 + s1.substring(0,8));
//         
//         String pStr = "I Like Puppies";
//         String cStr = "Cats are useless";
//         if(pStr.indexOf("Puppies") >= 0 && cStr.indexOf("Cats") >= 0){
//             System.out.println("I Like cats");
//         }
//         else{
//             System.out.println("I Like puppies");
//         }
//
//         String str = "ABC 123, efg";
//         System.out.println(str.substring(4,6));
//         System.out.println(str.substring(str.indexOf(",")+2));
//         System.out.println(str.substring(str.indexOf("a")+1));
//         System.out.println(str.substring(str.indexOf(" ")+1, str.indexOf(",")));
//            
//         int x = 9;
//         if((6>5) && (x<12)){
//             System.out.println("true");
//         }else{
//             System.out.println("false");
//         }
// 
//            int num1 = 0;
//            int num2 = 8;
//            if(!(num1 == num2) && (num2 != num1)){
//                System.out.println("true");
//            }else{
//                System.out.println("false");
//            }
//            
//            String str1 = "true";
//            String str2 = "false";
//            if(!str1.equals("false") || !str2.equals("false")){
//                System.out.println("true");
//            }else{
//                System.out.println("false");
//            }
// 
//            String str1 = "true";
//            String str2 = "false";
//            if(str1.equals("true") && str2.equals("false")){
//                System.out.println("true");
//            }else{
//                System.out.println("false");
//            }
// 
//            boolean t1 = true;
//            boolean t2 = false;
//            if(!(t1 != true) || (t2 != true)){
//                System.out.println("true");
//            }else{
//                System.out.println("false");
//            }
	}

}
