import java.util.Scanner;
public class student
{
  String name;
   int rollno;
   int total;
   student()
   {
    name=" ";
    rollno=0;
    total=0;
    }
    student(String n,int r,int t)
    {
      name=n;
      rollno=r;
      total=t;
     }
     student(String n)
     {
      name=n;
      }
      student(int r)
     {
      rollno=r;
     }
      student(String n,int r)
      {
      name=n;
      rollno=r;
      }
      student(int r,int t)
      {
       rollno=r;
       total=t;
       }
       public static void main(String[] a)
       {
        Scanner sc=new Scanner(System.in);
        student s1=new student();
        student s2=new student("ABC",15,290);
        student s3=new student("BCD");
        student s4=new student("XYZ",18);
        student s5=new student(18,250);
        student s6=new student(18);
        System.out.println("Name:  "+s1.name+"\tRoll no.:  "+s1.rollno+"\tTotal:  "+s1.total);
        System.out.println("Name:  "+s2.name+"\tRoll no.:  "+s2.rollno+"\tTotal:  "+s2.total);
        System.out.println("Name:  "+s3.name);
        System.out.println("Name:  "+s4.name+"\tRoll no.:  "+s4.rollno);
        System.out.println("Roll no.:  "+s5.rollno+"\tTotal:  "+s5.total);
        System.out.println("Roll no.:  "+s6.rollno);
       }
}