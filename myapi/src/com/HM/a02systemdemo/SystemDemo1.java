package com.HM.a02systemdemo;

public class SystemDemo1 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6,7,8,9,10};
        int[] arr2=new int[10];

        System.arraycopy(arr1,3,arr2,0,5);

        for (int i = 0; i < arr2.length; i++)   {
            System.out.print(arr2[i] + " ");
        }
    }
}
