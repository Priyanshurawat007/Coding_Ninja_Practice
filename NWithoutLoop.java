package LeetCode;

import java.util.ArrayList;

public class NWithoutLoop {
    


    public static int[] printNos(int x) {
             int []arr = new int[x];

        num(x, arr);

        return arr;

    }

    public static void num(int x, int []arr) {

        if(x==0){

            return;

        }else {

            arr[x-1] = x;

            num(x-1, arr);

        }

    }

}
    

