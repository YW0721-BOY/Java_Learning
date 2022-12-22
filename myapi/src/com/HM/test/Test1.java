package com.HM.test;

import java.util.Arrays;
import java.util.Comparator;

public class Test1 {
    public static void main(String[] args) {
        /*定义数组并存储一些女票对象，利用Arrays中的sort方法进行排序
        要求1：属性有姓名、年龄、身高
        要求2：按照年龄的大小进行排序，年龄一样，按照身高排序，身高一样按照姓名的字母进行排序。
        （姓名中不要有中午或特殊字符，会涉及到后面的知识）
         */

//        String s1 ="a";
//        String s2 ="b";
//        int i=s1.compareTo(s2);
//        System.out.println(i);

        GirlFriend gf1 =new GirlFriend("xiaoshishi",18,1.67);
        GirlFriend gf2 =new GirlFriend("xiaodandan",19,1.73);
        GirlFriend gf3 =new GirlFriend("xiaohuihui",19,1.70);

        GirlFriend[] arr ={gf1,gf2,gf3};

//        Arrays.sort(arr, new Comparator<GirlFriend>() {
//            @Override
//            public int compare(GirlFriend o1, GirlFriend o2) {
//                double temp =o1.getAge()-o2.getAge();
//                temp = temp==0 ?o1.getHeight() -o2.getHeight() :temp;
//                temp = temp==0 ?o1.getName().compareTo(o2.getName()) :temp;
//                if (temp>0){
//                    return 1;
//                }else if (temp<0){
//                    return -1;
//                }else {
//                    return 0;
//                }
//            }
//        });

        Arrays.sort(arr, ( o1,  o2)-> {
                double temp =o1.getAge()-o2.getAge();
                temp = temp==0 ?o1.getHeight() -o2.getHeight() :temp;
                temp = temp==0 ?o1.getName().compareTo(o2.getName()) :temp;
                if (temp>0){
                    return 1;
                }else if (temp<0){
                    return -1;
                }else {
                    return 0;
                }

        });

         System.out.println(Arrays.toString(arr));;

    }
}


