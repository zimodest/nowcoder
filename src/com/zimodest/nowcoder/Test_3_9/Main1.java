package com.zimodest.nowcoder.Test_3_9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 *
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();
        while(scanner.hasNext()) {
            Integer a = scanner.nextInt();
            if(!map.containsKey(a)) {
                map.put(a,0);
            }
            map.put(a,map.get(a)+1);
        }
        int size = map.size();
        for(int a : map.keySet()) {
            if(map.get(a) >= size /2) {
                System.out.print(a);
                break;
            }
        }
    }
}
