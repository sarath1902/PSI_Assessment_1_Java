/* program to find transpose of a matrix */
import java.util.Scanner;

class transpose {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[][] arr={{10,20,30},{40,50,60}};		//Given array input
        int[][] temp=new int[3][2];
        for(int i=0 ; i< 2 ; i++){					// performing logic to transpose it
            for(int j=0 ;j< 3 ;j++) {
                temp[j][i] = arr[i][j]; 
            }
        }
		System.out.println("After changing the rows and columns of the said array:");
        for(int i=0 ; i< 3 ; i++){
            for(int j=0 ;j< 2 ;j++) {
                System.out.print(temp[i][j]+" ");                    // array after transpose
            }
            System.out.println(); 									// for formatting in matrix form
        }
    }
}