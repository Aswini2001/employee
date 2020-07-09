 package myjava;

import java.util.Scanner;

public class Employee { 
	 String name ;
     String address;
     int year;
     int salary;
     

	public static void main(String[] args) {
		//creating object of a class employee
 Employee obj[] = new Employee[3];

 Scanner ss = new Scanner (System .in);
 // getting input from users 
 for (int i=0;i<obj.length;i++)
 {
  obj[i] = new Employee();
System.out.println("enter the employee name: ");
	 obj[i].name= ss.nextLine();
 
 System.out.println("enter the address : ");
	 obj[i].address = ss.nextLine();
	 System.out.println("enter the year of joining : ");
	 obj[i].year = ss.nextInt();
	 System.out.println("enter the salary : ");
	 obj[i].salary = ss.nextInt();
	 String dummy;
	 dummy = ss.nextLine();
 }
 System.out.println();
		//printing the output
 System.out.println("Name "+"           "+"Year Of Join  "+"            "+"Salary"+"            " +" Address ");
 for (int i=0;i<obj.length;i++)
 {
	 System.out.println(obj[i].name+"           "+obj[i].year+"                "+"rs."+obj[i].salary+"           "+obj[i].address);
 }
 
}
}
