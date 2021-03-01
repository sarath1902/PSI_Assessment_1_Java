/*Program to find if four integer numbers are equal*/

import java.util.Scanner;

class allequal {
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
	System.out.print("input first number:- ");   
    int n1=s.nextInt();							 	   // first integer input
	System.out.print("input Second number:- "); 
    int n2=s.nextInt();                                // Second integer input
	System.out.print("input third number:- ");
    int n3=s.nextInt();								   //Third integer input
	System.out.print("input fourth number:- ");                   
    int n4=s.nextInt();		                           // fourth integer input
	
    if(n1==n2 && n2==n3 && n3==n4 && n4==n1){  	       // checking for equality
	
        System.out.println("All four are Equal");      //print this if equal
    }
    else {
          System.out.println("Numbers are not equal!"); //print this if not equal
            }

    } 
 }