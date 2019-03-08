### 1、选择题

###### 1.以下代码运行输出的是

```
public class Person{
private String name = "Person";
int age=0;
}
public class Child extends Person{
public String grade;
public static void main(String[] args){
Person p = new Child();
System.out.println(p.name);
}
}
```

>   A 输出：Person
>   B 没有输出
>   C 编译出错
>   D 运行出错



###### 2.以下程序的输出结果为

```
class Base{
public Base(String s){
System.out.print("B");
}
}
public class Derived extends Base{
public Derived (String s) {
System.out.print("D");
}
public static void main(String[] args){
new Derived("C");
}}
```

>A BD
>B DB
>C C
>D 编译错误





###### 3下面关于构造方法的说法不正确的是 ()

>   A 构造方法也属于类的方法，可以创建对象的时候给成员变量赋值
>
>
>
>   B 构造方法不可以重载
>
>
>
>   C 构造方法没有返回值
>
>
>
>   D 构造方法一定要和类名相同





###### 4.在异常处理中，以下描述不正确的

>   A try块不可以省略
>   B 可以使用多重catch块
>   C finally块可以省略
>   D catch块和finally块可以同时省略



###### 5下列描述错误的是（）

>   A SQL语言又称为结构化查询语言
>
>   B java中”static”关键字表明一个成员变量或者是成员方法可以在没有所属的类的实例变量的情况下被访问
>
>   C 面向对象开发中，引用传递意味着传递的并不是实际的对象，而是对象的引用，因此，外部对引用对
>   象所做的改变不会反映到所引用的对象上
>
>   D java是强类型语言，javascript是弱类型语言



###### 6.下列那种说法是正确的？

>   A 实例方法可直接调用超类的实例方法
>
>   B 实例方法可直接调用超类的类方法
>
>   E 面向对象的三大特性包括：封装，继承，多态
>
>   A 实例方法可直接调用超类的实例方法
>
>   B 实例方法可直接调用超类的类方法
>
>   正确答案：D

###### 7、有以下代码片段：请问输出的结果是：()

```
String str1="hello";
String str2="he"+ new String("llo");
System.out.println(str1==str2);
```

>   A true
>   B 都不对
>   C null
>   D false

###### 8.程序读入用户输入的一个值，要求创建一个自定义的异常，如果输入值大于 10 ，使用 throw 语句显式地引发异常，异常输出信息为”something’swrong!” ，语句为（）

>   A if(i>10)throw new Exception("something’swrong!");
>
>   B if(i>10)throw Exception e("something’swrong!");
>
>   C if(i>10) throw new Exception e("something’swrong!");
>
>   D if(i>10)throw Exception( "something’swrong!");

###### 10下面说法错误的是（)

>   A 创建线程可以通过实现Runnable接口和继承Thread类
>
>   B java利用线程使整个系统成为异步关于 Java 线程
>
>   C 新线程一旦被创建，它将自动开始运行

##### 二. 编程

###### 统计字符串中每个字符的出现频率，返回一个 Object，key 为统计字符，value 为出现频率不限制 key 的顺序

>   输入的字符串参数不会为空忽略空白字符
>
>   输入描述：
>
>   输出描述：
>
>   示例1:
>   输入
>   'hello world'
>   输出
>   {h: 1, e: 1, l: 3, o: 2, w: 1, r: 1, d: 1}





###### 对于一个字符串，请设计一个算法，判断其是否为一个合法的括号串。

>   给定一个字符串A和它的长度n，请返回一个bool值代表它是否为一个合法的括号串。
>
>   测试样例：
>
>   "(()())",6
>
>   返回：true
>
>   测试样例：
>
>   "()a()()",7
>
>   返回：false
>
>   测试样例：
>
>   "()(()()",7
>
>   返回：false















































2.
对于一个字符串，请设计一个算法，判断其是否为一个合法的括号串。
给定一个字符串A和它的长度n，请返回一个bool值代表它是否为一个合法的括号串。
测试样例：
"(()())",6
返回：true
测试样例：
"()a()()",7
返回：false
测试样例：

"()(()()",7
返回：false
输入描述：
输出描述：
示例1:
输入
输出