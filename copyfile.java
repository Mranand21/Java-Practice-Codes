import java.io.*;
public class copyfile
{
 public static void main(String[] ar)
 {
  try
  {
   FileInputStream fin=new FileInputStream("ditin.txt");
   FileOutputStream fout=new FileOutputStream("ditout.txt");
   int a;
   while((a=fin.read())!=-1)
   {
    fout.write(a);
    }
   fin.close();
   fout.close();
   }
   catch(IOException e){System.out.println("file not found");}
 }
}