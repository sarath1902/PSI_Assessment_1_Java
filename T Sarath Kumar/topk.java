/* program to print top k elements */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class topk{
    public static void main(String[] args) {
        int k=3;
        int[] arr={1,4,17,7,25,3,100};
        List<Integer>lis=new ArrayList<>();        //adding elements to list from array
        for(int i:arr){
            lis.add(i);
        } 
        Collections.sort(lis);				      // sorting array from smaller to bigger
        Collections.reverse(lis);			     // reversing the sorted array
		
        System.out.printf("%d largest elements of the said array are:",k);
        for(int i=0;i<k;i++){
            System.out.print(lis.get(i)+" ");   // printing top k elements
        }
    }
}