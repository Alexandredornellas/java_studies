import java.util.*;
public class q1{

    public static void main (String[] args){
        int[] A = new int[10];

        int[] B = new int[10];

        for (int i = 0; i< A.length; i++){
            A[i] = i;
            B[i] = A[i] * 3;
        }

        System.out.println(Arrays.toString(B));
    }
}