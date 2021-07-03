public class Factorial
{  
 public static void main(String a1[])
{  
  int i,fact=1;  
  int number=Integer.parseInt(a1[0]); 
  for(i=1;i<=number;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+number+" is: "+fact);    
 }  
}  