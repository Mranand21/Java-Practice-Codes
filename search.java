import java.util.Scanner;
public class search
{
int sear(int a [],int n)
{
for(int i = 0;i <a.length;i ++)
{
if(a[i] == n)
return 1;
}
return 0;
}
public static void main(String args[])
{
int a1[] = {15,75,150,180,450};
Scanner sc = new Scanner(System.in);
System.out.println("Enter the element to be Searched");
int n1 = sc.nextInt();
search ob1 = new search();
int x = ob1.sear(a1,n1);
if(x==1)
System.out.println("Element found ");
else
System.out.println("Element not found");
}
}