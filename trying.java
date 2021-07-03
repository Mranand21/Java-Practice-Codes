import java.io.*;
public class trying
{
public static void main(String[] args)
{
try
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
FileWriter fw=new FileWriter("data.txt"); 
System.out.println("Enter the student details: Name,Roll and percentage"); 
String name=br.readLine();
int rollno=Integer.parseInt(br.readLine());
int percentage=Integer.parseInt(br.readLine());
if(percentage>80 && percentage<=100) 
{
System.out.println("Grade: A");
}
if(percentage>60 && percentage<=80) 
{
System.out.println("Grade: B"); 
}
if(percentage>=30 && percentage<=60)
{
System.out.println("Grade: C"); 
}
if(percentage<30) 
{ 
System.out.println("Grade:FAIL");
} 
if(percentage<0 && percentage>100)
{
System.out.println("invalid percentage");
}
if(percentage<0 && percentage>100)
{
System.out.println("Invalid percentage"); 
}
br.close();
String roll=Integer.toString(rollno);
String per=Integer.toString(percentage);
fw.write("Name :"+name);
fw.write(" , roll number:"+rollno); 
fw.write(", percentage entered by the user:"+per);
fw.close(); 
}
catch(IOException e){System.out.println("file not found");
}
}
}