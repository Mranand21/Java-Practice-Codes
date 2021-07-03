import java.io.*;
public class br_reader
{
public static void main(String[] args)
{
try
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter Name,Roll and Percentage:");
String Name=br.readLine();
int Roll=Integer.parseInt(br.readLine());
double Percentage=Double.parseDouble(br.readLine());
System.out.println("Name :"+Name);
System.out.println("ROll :"+Roll);
System.out.println("Percentage :"+Percentage);
br.close();
}
catch(IOException e){}
}
}