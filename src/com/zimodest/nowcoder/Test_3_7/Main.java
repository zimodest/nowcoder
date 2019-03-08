package com.zimodest.nowcoder.Test_3_7;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        try{
            int n = scanner.nextInt();
            if(n<=0) {
                return;
            }
            int s = getResult(n);
            System.out.println(s);
        }catch(NumberFormatException e) {
            e.printStackTrace();
        }
    }
    public static int getResult(int n) {
        int result = 2;
        int temp =2;
        while(n>1)  {
            temp = temp + 3;
            result = result + temp;
            n--;
        }
        return result;
    }
}