import java.util.*;
class myage extends Exception
{
 int age;
 myage(int x)
 {
   age=x;
 } 
public String toString()
 {
  return "Age <18 Hence Invalid";
 }
 }
 class age
 {
   static void compare(int age) throws myage
 {
  if(age>=18)  
  System.out.println("Age is valid : "+age);  
else
  throw new myage(age); 
} 
public static void main(String args[])
 {
  try
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter your age");  
  int uage;  
  uage=sc.nextInt();  
  compare(uage);
  }
  catch(myage a) {  System.out.println("Error : "+a); }
 }
 }

