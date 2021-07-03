import java.util.*; 
abstract class calr
{ 
void display(int a,int b) 
{ 
System.out.println("result of the numbers "+a+" "+b); 
} 
abstract void add(int a,int b); 
abstract void minus(int a,int b); 
} 
public class calculator extends calr
{ 
int result=0; 
void add(int a,int b) 
{ 
result=a+b; 
System.out.println("the sum of the number is ="+result); 
} 
void minus(int a,int b) 
{ 
result =a-b; 
System.out.println("the subtraction of the number is ="+result); 
} 
public static void main(String[] args) 
{ 
Scanner sc=new Scanner(System.in); 
int n1=sc.nextInt(); 
int n2=sc.nextInt(); 
calculator c=new calculator(); 
c.display(n1,n2); 
c.add(n1,n2); 
c.minus(n1,n2); 
} 
} 