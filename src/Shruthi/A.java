package Shruthi;

import java.util.Arrays;

public class A {


    public static void main(String[] args) {
//      int[] numbers=new int[5];// declaration and construction
//      int[][] arrays=new int[3][];//declaration and construction
//        int [] scores=new int[]{30,40,60};
//        int[][] marks=new int[][]{{1,2,3},{4,5,6}};
//        System.out.println(numbers.length);
//        System.out.println(scores.length);
//        System.out.println(arrays.length);
//        System.out.println(marks.length);
//        for(int i=0;i<5;i++)
//        {
//            numbers[i]=i;//0,1,2,3,4
//        }
//        for(int n:numbers)//
//        {
//            System.out.println(n);
//        }
        int[] nums=new int[]{90,40,30,20};
        int[] nums1=new int[]{90,40,30,20};

        System.out.println(nums.length);
        Arrays.sort(nums);//20,30,40,90
        for(int i=0;i< nums.length;i++)
        {
            System.out.println(nums[i]);
        }
        if( Arrays.equals(nums,nums1)){
            System.out.println("both are equal");
        }





    }
}
