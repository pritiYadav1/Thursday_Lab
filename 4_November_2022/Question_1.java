package Dipanshu;

import java.util.Scanner;
public class Question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo();
	}
	public static void demo()
	{
		int AGE; char GENDER;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the AGE:- ");
		AGE =sc.nextInt();
		System.out.println("Enter the GENDER:- ");
		GENDER=sc.next().charAt(0);
		    if(AGE>=60) {
		    if(GENDER=='m' || GENDER=='M') {
		    System.out.println("Rate Of Interesrt 7%");
		}
		    
		    else {
		    	System.out.println("Rate Of Interest 7.5");
		    }
		    }
		    else {
		    	System.out.println("Rate Of Interest 5%");
		    }
		
	}
	}


