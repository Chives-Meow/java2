# java2
##实验目的
……………………………………………………………………………………
初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
掌握面向对象的类设计方法（属性、方法）；
掌握类的继承用法，通过构造方法实例化对象；
学会使用super()，用于实例化子类；
掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。
……………………………………………………………………………………
##实验过程
……………………………………………………………………………………
首先使用scanner语句，让计算机接收用户输入，模拟账号密码的输入，通过输入指定序号匹配选课学生信息
import java.util.Scanner;
	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
      		  int xuehao;
		  System.out.print("请输入学号："); 
		  xuehao = in.nextInt();
然后定义学生、老师、课程信息，并将定义内容输出。
定义父类people，引用之前定义的年龄、性别、编号等。
定义子类student、teacher， 继承父类people中非private的方法，
class Student extends People{
    public Student(){
    }
    public Student(String name,int age,int number,String sex){
        super(name, age, number, sex);
    }
}
class Teacher extends People{
    public Teacher(){
    }
    public Teacher(String name,int age,int number,String sex){
        super(name, age, number, sex);
使用super关键字调用people类中的构造方法
super(name, age, number, sex);
……………………………………………………………………………………
##实验结果
![image](https://github.com/Chives-Meow/java2/blob/main/n1.png)
根据提示，输入学生学号，模拟系统根据序号匹配学生信息
![image](https://github.com/Chives-Meow/java2/blob/main/p2.png)
匹配成功直接输出选课信息
