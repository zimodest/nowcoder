1.A 派生出子类 B ， B 派生出子类 C ，并且在 java 源代码有如下声明：

1. A a0=new A();
2. A a1=new B();
3. A a2=new C();
4. 问以下哪个说法是正确的？

A 只有第一行能通过编译

B 第1、2行能通过编译，但第3行编译出错

C 第1、2、3行能通过编译，但第2、3行运行时出错

D 第1行，第2行和第3行的声明都是正确的

2.下面代码将输出什么内容：

public class SystemUtil{

public static boolean isAdmin(String userId){

return userId.toLowerCase()=="admin";}

public static void main(String[] args){

System.out.println(isAdmin("Admin"))

}

}正确答案：B

3.阅读如下代码。 请问，对语句行 test.hello(). 描述正确的有（）

package NowCoder

class Test {

public static void hello(){

System.out.println("hello");

}

}

public class MyApplication {

public static void main(String[] args) {

// TODO Auto-generated method stub

Test test=null;

test.hello();



A 能编译通过，并正确运行

B 因为使用了未初始化的变量，所以不能编译通过

C 以错误的方式访问了静态方法

D 能编译通过，但因变量为null，不能正常运行



4. 在使用和this关键字时，以下描述正确的是

A 在子类构造方法中使用super（）显示调用父类的构造方法，super（）必须写行，否则编译不通过

B super（）和this（）不一定要放在构造方法内第一行

C this（）和super（）可以同时出现在一个构造函数中

D this（）和super（）可以在static环境中使用，包括static方法和static语块

5.如下代码的 结果是什么 ?

class Base {

Base() {

System.out.print("Base");

}

}public class Alpha extends Base {

public static void main( String[] args ) {

new Alpha();//调用父类无参的构造方法

new Base();

}

}

A Base

B BaseBase

C 编译失败

D 代码运行但没有输出

E 运行时抛出异常

6.如下代码的输出结果是什么？

public class Test {

public int aMethod(){

static int i = 0;i++;return i;

}

public static void main(String args[]){

Test test = new Test();

test.aMethod();

int j = test.aMethod();

System.out.println(j);

}

}

A 0

B 1

C 2

D:编译失败



下列哪一种叙述是正确的（）

A abstract修饰符可修饰字段、方法和类

B 抽象方法的body部分必须用一对大括号{ }包住

C 声明抽象方法，大括号可有可无

D 声明抽象方法不可写出大括号



下列哪一种叙述是正确的（）

A class中的constructor不可省略

B constructor必须与class同名，但方法不能与class同名

C constructor在一个对象被new 时执行

D 一个class只能定义一个constructor



9.选项中哪一行代码可以替换 //add code here 而不产生编译错误 

public abstract class MyClass {

public int constInt = 5;

//add code herepublic void method() {}

}



10.java 中哪个关键字可以对对象加互斥锁？

A transient

B synchronized

C serialize

D static







二. 编程

1.有一个由很多木棒构成的集合，每个木棒有对应的长度，请问能否用集合中的这些木棒以某个顺序首尾相连构成一个面积大于 0的简单多边形且所有木棒都要用上，简单多边形即不会自交的多边形

初始集合是空的，有两种操作，要么给集合添加一个长度为L的木棒，要么删去集合中已经有的某个木棒。每次操作结束后你都需要告知是否能用集合中的这些木棒构成一个简单多边形。
输入描述：
每组测试用例仅包含一组数据，每组数

第一行为一个正整数 n 表示操作的数量(1 ≤ n ≤ 50000) ， 

接下来有n行，每行第一个整数为操作类型 i (i ∈ {1,2})，第二个整数为一个长度 L(1 ≤ L ≤ 1,000,000,000)。如果 i=1 代
表在集合内插入一个长度为 L 的木棒，如果 i=2 代表删去在集合内的一根长度为 L 的木棒。输入数据保证删
除时集合中必定存在长度为 L 的木棒，且任意操作后集合都是非空的。
输出描述：
对于每一次操作结束有一次输出，如果集合内的木棒可以构成简单多边形，输出 "Yes" ，否则输出 "No"





2. 小青蛙有一天不小心落入了一个地下迷宫,小青蛙希望用自己仅剩的体力值P跳出这个地下迷宫。为了让问
  题简单,假设这是一个n*m的格子迷宫,迷宫每个位置为0或者1,0代表这个位置有障碍物,小青蛙达到不了这个位
  置;1代表小青蛙可以达到的位置。小青蛙初始在(0,0)位置,地下迷宫的出口在(0,m-1)(保证这两个位置都是1,并
  且保证一定有起点到终点可达的路径),小青蛙在迷宫中水平移动一个单位距离需要消耗1点体力值,向上爬一个
  单位距离需要消耗3个单位的体力值,向下移动不消耗体力值,当小青蛙的体力值等于0的时候还没有到达出口,小
  青蛙将无法逃离迷宫。现在需要你帮助小青蛙计算出能否用仅剩的体力值跳出迷宫(即达到(0,m-1)位置)。
  输入描述：
  输入包括n+1行:
  第一行为三个整数n,m(3 <= m,n <= 10),P(1 <= P <= 100)
  接下来的n行:
  每行m个0或者1,以空格分隔
  输出描述：
  如果能逃离迷宫,则输出一行体力消耗最小的路径,输出格式见样例所示;如果不能逃离迷宫,则输出"Can not
  escape!"。 测试数据保证答案唯一
  示例1:
  输入
  4 4 10 1 0 0 1 1 1 0 1 0 1 1 1 0 0 1 1
  输出
  [0,0],[1,0],[1,1],[2,1],[2,2],[2,3],[1,3],[0,3]



