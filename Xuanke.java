package xitong;
import java.util.Scanner;
public class Xuanke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("——————选课系统———————");
		  Scanner in = new Scanner(System.in);
		  int xuehao;
		  System.out.print("请输入学号：");
		  
		  xuehao = in.nextInt();
		  System.out.println(xuehao + "，您的选课信息如下");
        Student xx = new Student();
        xx.setName("嘤嘤嘤");
        xx.setAge(20);
        xx.setSex("男");
        System.out.println("学生姓名:" + xx.getName());
        System.out.println("学生年龄:" + xx.getAge());
        System.out.println("学生性别:" + xx.getSex());
       
        System.out.println("——————授课教师———————");
        Teacher shi = new Teacher();
        shi.setName("！！！");
        shi.setNumber(1212221);
        shi.setSex("男");
        shi.setLesson_1("电影赏析");
        System.out.println("授课教师:" + shi.getName());
        System.out.println("教师编号:" + shi.getNumber());
        System.out.println("教师性别:" + shi.getSex());
        System.out.println("教授课程:" + shi.getLesson_1());


        System.out.println("——————课程信息———————");
        Lesson_1 dysx = new Lesson_1();
        dysx.setName("电影赏析");
        dysx.setTime("双周周六全天");
        dysx.setNumber(123456);
        dysx.setPlace("home");
        System.out.println(dysx.toString());

    }

}


class People{
    public People(){

    }
    public People(String name,int age,int number,String sex){
        this.name = name;
        this.age = age;
        this.number = number;
        this.sex = sex;
    }

    private String name;
    private int age;
    private int number;
    private String sex;

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getSex() {
        return sex;
    }
    public int getNumber() {
        return number;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
            this.age = age;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

}

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
    }
    String lesson_1;
    public String getLesson_1() {
        return lesson_1;
    }
    public void setLesson_1(String lesson_1) {
        this.lesson_1 = lesson_1;
    }


}


class Lesson{
    public Lesson(){

    }
    public Lesson(String name,String time,int number,String place){
        this.name = name;
        this.time = time;
        this.number = number;
        this.place = place;
    }

    private String name;
    private String time;
    private int number;
    private String place;


    public String getName() {
        return name;
    }
    public String getTime() {
        return time;
    }

    public String getPlace() {
        return place;
    }
    public int getNumber() {
        return number;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public void setPlace(String place) {
        this.place = place;
    }

}


class Lesson_1 extends Lesson{
    public Lesson_1(){

    }
    public Lesson_1(String name,String time,int number,String place){
        super(name, time, number, place);
    }
    public String toString() {
        return "课程名称：" + getName()+ "\n" + "上课时间：" + getTime() + "\n" + "课程编号：" + getNumber()+ "\n" + "授课地点：" + getPlace()+ "\n";
	}

}
