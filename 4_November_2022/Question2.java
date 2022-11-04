/*
This is my QUE

*/

package Dipanshu;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
demo(); // Function calling
	}
	public static void demo()
	{
		int i,j;
		for(i=1;i<=5;i++) // for row value 
		{
			for(j=1;j<=2*i-1;j++) // for start value 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
