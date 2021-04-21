import java.io.*;
public class student{
  String name;
  int m1,m2,m3,m4,m5,total,average;
  public student(String name){
    this.name=name;
  }
  public void marks(int a,int b,int c,int d,int e){
    m1=a;
	m2=b;
	m3=c;
	m4=d;
	m5=e;
  }
  public void total(){
    total = m1 + m2 + m3 + m4 + m5;
  }
  public void average(){
    average=total/5;
  }
  public void printstudent(){
    System.out.println("Name :"+name);
    System.out.println("Mark 1 :"+m1);
    System.out.println("Mark 2 :"+m2);
    System.out.println("Mark 3 :"+m3);
    System.out.println("Mark 4 :"+m4);
    System.out.println("Mark 5 :"+m5);
    System.out.println("Total :"+total);
    System.out.println("Average :"+average);
   }
  public static void main(String[] args){
    student studone = new student("Johann");
    studone.marks(20,30,40,50,60);
	studone.total();
	studone.average();
	studone.printstudent();
   }
}   