package com.HM.test;

//定义一个数组，存入1，2，3，4，5.按照要求交换索引对应的元素。
public class ArrTest1 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};

        for (int i = 0,j=a.length-1; i < j;i++,j--) {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
