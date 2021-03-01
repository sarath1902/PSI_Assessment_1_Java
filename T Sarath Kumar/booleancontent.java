/* code to print boolean contents of an array*/

import java.util.Scanner;

class booleancontent{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        boolean[][] arr={{true,false,true},{false,true,false}};      //contents of boolean array
        for(int i=0 ; i<arr.length; i++){
            for(int j=0 ;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");				 //printing the boolean array
            }
            System.out.println();								// for formatting in matrix form
        }
    }
}