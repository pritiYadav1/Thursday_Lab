package Dipanshu;

public class Question_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
demo();
	}
	public static void demo()
	{
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++) {
				if(j%2==0) {
					System.out.print("0");
				}
				else {
					System.out.print('1');
				}
			
			}
			System.out.println();
		}
	}

}
