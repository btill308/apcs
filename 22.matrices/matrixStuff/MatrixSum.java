//A+ Computer Science
// www.apluscompsci.com

//Matrix sum example 

import static java.lang.System.*;

public class MatrixSum
{
	/*
	 *  method searchMat should determine how many
	 *  occurrences of toFind exist in the matrix mat
	 */
	public static int sumMat( int[][] mat )
	{
	    int count = 0;
		for(int r = 0; r < mat.length; r++){
		    for(int c = 0; c <= mat[r].length; c++){
		            count = count + mat[r][c];
		      }
		  }
		  return count;
	}

	public static void main(String args[])
	{
		int[][] twoDRay = {{5,7},{5,3,4,6},{0,8,9}};
		System.out.println( sumMat( twoDRay ) );
	}
}