package OfficeHours.ArraysForEachLoop;

import java.util.Arrays;

public class MultidimentionalArray {
    public static void main(String[] args) {
        int[] arr1D={1,2,3,4,};
                       //0 1 2  3    0 1 2    0 1
        int [][]arr2D={  {1,2,3,4}, {5,6,7}, {8,9}  };
                         // 0          1       2

        System.out.println(Arrays.toString(arr2D[2]));  //8,9
        System.out.println(Arrays.deepToString(arr2D));
        System.out.println("===================");

        for(int []each1DArray:arr2D){  //to print each single array in different line
            System.out.println(Arrays.toString(each1DArray));


            for(int eachElement:each1DArray){ //eachElement in eachArray
                System.out.println(eachElement);
            }

        }
        System.out.println("=======================");
        for(int[] each1DArray:arr2D){
            for(int eachelement:each1DArray){
                if(eachelement%2 !=0){
                    System.out.println(eachelement); //each odd number
                }
            }
        }
    }
}
