/* Program that accepts two double variables and checks if both lies strictly between 0 and 1.*/

import java.util.Scanner;

class doublecheck {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
	   System.out.print("input first number:- ");      // first integer input
       double n1=s.nextDouble();
	   System.out.print("input second number:- ");
       double n2=s.nextDouble();					  // Second integer input
	   
       if((n1>0 && n1<1) && (n2>0 && n2<1)){
           System.out.println("true");                // if above condition satisfies code prints true
       }
       else {
           System.out.println("false");			     // if not prints false
       }

    }
}
