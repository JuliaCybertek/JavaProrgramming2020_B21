package OfficeHours.ArraysForEachLoop;

import java.util.Arrays;

public class Practice3 {
    public static void main(String[] args) {
        String str1="abcdefg";
        String str2="GFEDCBA";

        str1=str1.toLowerCase();  //all to lower case
        str2=str2.toLowerCase();

        String[]arr1=str1.split(""); //all to arrays and split
        String []arr2=str2.split("");

        Arrays.sort(arr1);      //all sorted in same order
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        boolean isAngram= Arrays.equals(arr1,arr2);

        System.out.println(isAngram);

    }
}
