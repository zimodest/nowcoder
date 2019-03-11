package com.zimodest.nowcoder.Test_3_9;

import sun.reflect.generics.tree.Tree;
import sun.reflect.generics.tree.TypeTree;
import sun.reflect.generics.visitor.TypeTreeVisitor;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }
    public static int[] getNUM(int[] a) {
        int[] b = new int[3];
        b[0] = (a[0] + a[2])/2;
        b[1] = (a[1]+ a[3]) /2;
        b[2] = b[1] - a[2];
        return b;
    }
}


//public static void code() {
    //        Scanner scanner = new Scanner(System.in);
//
//        String s = scanner.nextLine();
//        StringBuilder stringBuilder = new StringBuilder(s);
//
//        s = stringBuilder.reverse().toString();
//
//        System.out.println(s);
//}

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//
//        int[] num = new int[4];
//
//        for(int i=0; i< 4; i++) {
//            num[i] = scanner.nextInt();
//        }
//        num = getNUM(num);
//        for(int j=0; j<3; j++) {
//            if(num[j] < 0) {
//                System.out.println("NO");
//                return;
//            }
//        }
//        for(int j=0; j<3; j++) {
//            System.out.print(num[j]);
//            if(j<3) {
//                System.out.print(" ");
//            }
//        }
//    }
//
//    public static int[] getNUM(int[] a) {
//        int[] b = new int[3];
//        b[0] = (a[0] + a[2])/2;
//        b[1] = (a[1]+ a[3]) /2;
//        b[2] = b[1] - a[2];
//        return b;
//    }
