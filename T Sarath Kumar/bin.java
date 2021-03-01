/* program to convert integer into a binary representation.
and to count the number of bits which is equal to zero of the said binary representation. */
import java.util.Scanner;
class bin{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
		System.out.print("enter first input");          // enter input
        int n= s.nextInt();
        String r=Integer.toBinaryString(n); 		//convert int to binarystring
		System.out.println("Binary representation is:");
        System.out.println(r);
        char[] ch=r.toCharArray();
        int c=0;
        for(int i=0;i<ch.length;i++) {
            if(ch[i]=='0'){
                c=c+1;                                //count number of zeros

            }
        }
		System.out.print("Number of zero bits:-  ");
        System.out.println(c);							// print zeroes

    }
}
