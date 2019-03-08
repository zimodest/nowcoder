package com.zimodest.nowcoder.Test_3_6;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;



    public class Main{
        public static void main(String[] args) {


            System.out.println(trans(" This   is    a   sample ",25));
//            String s = "This   is   a   sample";
//            System.out.println(s.trim());
       }

        public static String trans(String s, int n) {
            // write code here
            String string = s.trim();
            s=s.trim();
            n = string.length();
            int m = 0;
            StringBuilder stringBuilder = new StringBuilder();

            int j = n;
            int i =0;
            for(i=string.length()-1;i>=0; i--) {
                char c = s.charAt(i);

                if(c >= 'a' && c <= 'z') {
                    string = string.replace(c,(char)(c-32));

                }else if(c >= 'A' && c <= 'Z') {
                    string = string.replace(c,(char)(c+32));
                }
                if(c == ' '){
                    if(s.charAt(i-1)== ' ') {
                        m++;
                    }
                    if(s.charAt(i-1) != ' '){
                        String temp = string.substring(i+m+1,j);
                        stringBuilder.append(temp).append(' ');
                        j=i;
                        m=0;
                    }
                }
            }

            stringBuilder.append(string.substring(i+1,i+j+1));
            return stringBuilder.toString();
        }

        public static int need(int n) {
            int i = -1;
            if(n%8 == 0 ) {
                i = n/8;
            }else if(n%8 == 6) {
                i = n/8+1;
            }else if(n%6 == 0) {
                i = n/6;
            }else if((n-8)%6 == 0) {
                i = n/6+1;
            }
            return i;

        }




    public static boolean chkParenthesis(String A, int n) {
        // write code here
        List<Character> list = new LinkedList<>();
        int i=0;
        int j = 0;
        char[] chars = A.toCharArray();

        for(i=0; i<n;i++) {
            if(chars[i] == '(' || chars[i] == ')') {
                list.add(chars[i]);
            }
        }
        int size = list.size();
        if(size%2==1 || size == 0) {
            return false;
        }

        for(i=0; i<size;i++) {
            if(list.get(0) == ')') {
                return false;
            }


            while(i<size &&(list.get(i) == '(')) {
                i++;
            }
            if(i >= size -1) {
                return false;
            }
            for(j=i; j<size; j++) {
                if (list.get(j) == ')') {
                    list.remove(list.get(i - 1));
                    list.remove(list.get(i - 1));
                    i = 0;
                    size = size - 2;
                    break;
                }
            }
        }
        return true;
    }
}
