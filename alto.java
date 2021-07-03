import java.util.*;
class car
{
int engineno;
String car_type;
car(int engineno,String car_type)
{
 this.engineno=engineno;
 this.car_type=car_type;
}
}
public class alto extends car
{
 String colour;
 alto(int engineno,String car_type,String colour)
{
 super(engineno,car_type);
 this.colour=colour;
}
void display()
{
System.out.println("Engine number ="+engineno);
if(car_type.equalsIgnoreCase("Sedan")||car_type.equalsIgnoreCase("hatchback"))
System.out.println("Car type = "+car_type);
else
System.out.println("Invalid car type");
System.out.println("colour= "+colour);
}
public static void main(String a1[])
{
 Scanner sc=new Scanner(System.in);
 int engno;
 String ct,col;
 System.out.println("Enter Engine number");
 engno=sc.nextInt();
 System.out.println("Enter type of car");
 ct=sc.next();
 System.out.println("Enter colour");
 col=sc.next();
 alto obj=new alto(engno,ct,col);
 obj.display();
}
} 