package Dipanshu;

public class Question_3a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
demo();
	}
	public static void demo()
	{
		int i,j;
		for(i=5;i>=1;i--)
		{
			for(j=1;j<=i*2-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
