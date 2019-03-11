package com.zimodest.nowcoder.Test_3_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(getNum(x,y));
    }


    public static int getNum(int x, int y) {
        int count = 0;
        int a = x/4;
        int b = x%4;
        int m,n;
        for(int i=1; i<=y; i=i+4) {
            if(i%4==3 || i%4==4) {
                count++;
            }
        }
        m = count*4;

        return m*a+count*b;

    }

}
