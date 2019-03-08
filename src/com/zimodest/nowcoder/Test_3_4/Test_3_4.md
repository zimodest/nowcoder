##### 1)单选

###### 1.执行如下程序，输出结果是（ ）

```java
class Test
{
private int data;
int result = 0;
public void m()
{
result += 2;
data += 2;
System.out.print(result + " " + data);
}
}
class ThreadExample extends Thread
{
private Test mv;
public ThreadExample(Test mv)
{
this.mv = mv;
}
public void run()
{
synchronized(mv)
{
mv.m();
}
}
}
class ThreadTest
{
public static void main(String args[])
{
Test mv = new Test();
Thread t1 = new ThreadExample(mv);
Thread t2 = new ThreadExample(mv);
Thread t3 = new ThreadExample(mv);
t1.start();
t2.start();
t3.start();
}
}
```

>   A 0 22 44 6
>
>   B 2 42 42 4
>
>   C 2 24 46 6
>
>   D 4 44 46 6

正确答案：C

###### 2.要使对象具有序列化能力，则其类应该实现如下哪个接口()。

>   A java.io.Serializable
>
>   B java.lang.Cloneable,
>
>   C java.lang.CharSequence
>
>   D java.lang.Comparable

正确答案：A

###### 3.下列选项中属于面向对象设计方法主要特征的是（ ）

>   A 继承
>
>   B 自顶向下
>
>   C 模块化
>
>   D 逐步求精

正确答案：A

###### 4.关于下列程序段的输出结果，说法正确的是：（ ）

```java
public class MyClass{
	static int i;
	public static void main(String argv[]){
		System.out.println(i);
	}
}
```

>   A 有错误，变量i没有初始化。
>
>   B null
>
>   C 1
>
>   D 0

正确答案：D

###### 5.下列代码的执行结果是：（ ）

```java
public class Test3{
public static void main(String args[]){
System.out.println(100%3);
System.out.println(100%3.0);
}
}
```

>   A 1和1
>
>   B 1和1.0
>
>   C 1.0和1
>
>   D 1.0和1.0

正确答案：B

###### 6.在基本 JAVA 类型中，如果不明确指定，整数型的默认是 __ 类型，带小数的默认是 __ 类型？ ( )

>   A int float
>
>   B int double
>
>   C long float
>
>   D long double

正确答案：B

###### 7.方法通常存储在进程中的哪一区（）

>   A 堆区
>
>   B 栈区
>
>   C 全局区
>
>   D 方法区

正确答案：D

###### 8.不考虑反射，关于私有访问控制符 private 修饰的成员变量，以下说法正确的是（）

>   A 可以三种类所引用：该类自身、与它在同一包中的其他类，在其他包中的该类的子类
>
>
>
>   B 可以被两种类访问和引用：该类本身、该类的所有子类
>
>
>
>   C 只能被该类自身所访问和修改D 只能被同一个包中的类
>
>
>
>   D 只能被同一个包中的类访问

正确答案：C

###### 9.Math.round(11.5) 等于多少 (). Math.round(-11.5) 等于多少 ( )

>   A 11 ,-11
>
>   B 11 ,-12
>
>   C 12 ,-11
>
>   D 12 ,-12

正确答案：C

###### 10.假设 A 类有如下定义，设 a 是 A 类的一个实例，下列语句调用哪个是错误的？（）

```java
public class A
{
public int i;
static String s;
void method1(){}
static void method2(){}
}
```

>   A System.out.println(a.i);
>
>   B a.method1();
>
>   C A.method1();
>
>   D A.method2();

正确答案：C

##### 二. 编程

###### 1.“回文串”是一个正读和反读都一样的字符串，比如“level”或者“noon”等等就是回文串。

题目描述

```
花花非常喜欢这种拥有对称美的回文串，生日的时候她得到两个礼物分别是字符串A和字符串B。现在她非常好奇有没有办法将字符串B插入字符串A使产生的字符串是一个回文串。你接受花花的请求，帮助她寻找有多少种插入办法可以使新串是一个回文串。如果字符串B插入的位置不同就考虑为不一样的办法。
```

>   题目举例：
>   A = “aba”，B = “b”。这里有4种把B插入A的办法：
>
>   在A的第一个字母之前: "baba" 不是回文
>
>   在第一个字母‘a’之后: "abba" 是回文
>
>   在字母‘b’之后: "abba" 是回文
>
>   在第二个字母'a'之后 "abab" 不是回文
>   所以满足条件的答案为2

输入描述：

>   每组输入数据共两行。
>   第一行为字符串A
>   第二行为字符串B
>   字符串长度均小于100且只包含小写字母

输出描述：

>   输出一个数字，表示把字符串B插入字符串A之后构成一个回文串的方法数
>   示例1:
>   输入
>   aba
>   b
>   输出
>   2



###### 2.有一个整数数组，请你根据快速排序的思路，找出数组中第K大的数。

题目描述

```
给定一个整数数组a,同时给定它的大小n和要找的K(K在1到n之间)，请返回第K大的数，保证答案存在。
```


测试样例：

>   [1,3,5,2,2],5,3
>   返回：2



