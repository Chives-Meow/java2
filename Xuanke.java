package xitong;
import java.util.Scanner;
public class Xuanke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������������ѡ��ϵͳ��������������");
		  Scanner in = new Scanner(System.in);
		  int xuehao;
		  System.out.print("������ѧ�ţ�");
		  
		  xuehao = in.nextInt();
		  System.out.println(xuehao + "������ѡ����Ϣ����");
        Student xx = new Student();
        xx.setName("������");
        xx.setAge(20);
        xx.setSex("��");
        System.out.println("ѧ������:" + xx.getName());
        System.out.println("ѧ������:" + xx.getAge());
        System.out.println("ѧ���Ա�:" + xx.getSex());
       
        System.out.println("�������������ڿν�ʦ��������������");
        Teacher shi = new Teacher();
        shi.setName("������");
        shi.setNumber(1212221);
        shi.setSex("��");
        shi.setLesson_1("��Ӱ����");
        System.out.println("�ڿν�ʦ:" + shi.getName());
        System.out.println("��ʦ���:" + shi.getNumber());
        System.out.println("��ʦ�Ա�:" + shi.getSex());
        System.out.println("���ڿγ�:" + shi.getLesson_1());


        System.out.println("�������������γ���Ϣ��������������");
        Lesson_1 dysx = new Lesson_1();
        dysx.setName("��Ӱ����");
        dysx.setTime("˫������ȫ��");
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
        return "�γ����ƣ�" + getName()+ "\n" + "�Ͽ�ʱ�䣺" + getTime() + "\n" + "�γ̱�ţ�" + getNumber()+ "\n" + "�ڿεص㣺" + getPlace()+ "\n";
	}

}
