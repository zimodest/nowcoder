package com.zimodest.nowcoder.Test_3_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * 求两个数的最小公倍数
 *
 * 1、求两个数的最大公约数
 * 2、记录两个数的公约数
 * 3、两个数同时除以最大公约数，得到两个商
 * 4、若两个商没有最大公约数，则两个商和记录的公约数相乘得到的数就是最小公倍数
 * 5、若除的两个商有最大公约数，重复执行1，2，3，4
 *
 */
public class Main1 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        while(true) {
            int a = getNum(x,y);
            if(a <= 1) {
                break;
            }
            list.add(a);
            x = x / a;
            y = y / a;
        }
        int result = 1;
        for(int num : list) {
            result = num * result;
        }
        result = result*x*y;
        System.out.println(result);
    }

    //获取最大公约数
    public static int getNum(int x, int y) {
        int c;
        while (true) {
            c = x%y;
            if(c == 0) {
                break;
            }
            x = y;
            y = c;
        }
        return  y;
    }
}
