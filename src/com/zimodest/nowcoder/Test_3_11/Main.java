package com.zimodest.nowcoder.Test_3_11;


/**
 * 一棵满二叉树，每层从左向右编号，根节点为1，节点编号依次增加，
 * 传入两个正整数，判断这两个编号对应的节点的最近的根节点是哪个
 *
 *
 * 解题思路：
 * 1、分别获得节点在树中的所在层数
 * 2、判断两个节点是否在同一层
 *      如果是：
 *          3、同时计算两个节点在上一层的根节点，相等时，就是两个节点的最近根节点
 *      如果不是：
 *          4、求出较低层节点在较高层节点对应的根节点，然后同时计算较低层节点和较高层对应的节点的根节点，
 *          相等时，就是最近的根节点
 */



public class Main {
    public static void main(String[] args) {

    }
    public static int getLCA(int a, int b) {
        //获得a节点在树中的所在层数
        int x = getFool(a);
        //获得b节点在树中的所在层数
        int y = getFool(b);

        int z;
        int m;

        //a节点所在的层数大于b节点所在的层数
        if(x > y) {
            m = b;
            //a节点在b节点所在层的根节点编号
            z = getVarRoot(x, y,a);

            //b节点所在的层数大于a节点所在的层数
        }else if(x < y){
            m = a;
            //b节点在a节点所在层的根节点编号
            z = getVarRoot(y,x,b);
        }else{
            //a节点所在的层数等于b节点所在的层数
            m=a;
            z=b;
        }

        //从相同层开始同时查找各自的根节点
        while(m>0 && a>0) {
            //节点相同时跳出循环
            if(m==z) {
                break;
            }
            if(m>0 && m%2 == 0) {
                m = m/2;
            }else {
                m = (m-1)/2;
            }
            if(z>0 && z%2 == 0) {
                z = z/2;
            }else {
                z = (z-1)/2;
            }
        }
        //最近根节点
        return m;
    }

    /**
     * 求得节点所在层数
     * @param a 节点编号
     * @return  节点在树中的层数
     */
    public static int getFool(int a) {
        int i = 0;
        int m;
        double result =0;
        for(m=0; m<a; m++) {
            result = Math.pow(2,m)+result;
            if(result >=a) {
                i=m+1;
                break;
            }
        }
        return i;
    }

    /**
     * 较高层节点在较低层节点所在层的根节点
     * @param x 较高层节点的层数
     * @param y 较低层节点的层数
     * @param z 较高层节点的编号
     * @return
     */
    public static int getVarRoot(int x,int y,int z) {
        int sub = x -y;
        int a = 0;
        while((sub--)>0) {
            if(z%2 == 0) {
                z = z/2;
            }else {
                z = (z-1)/2;
            }
        }
        return z;
    }
}
