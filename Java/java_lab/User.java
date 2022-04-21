 package puser;

import java.util.Scanner;

public class User
{
    public int faculty_id;
    String password;
    String faculty_name;
    String faculty_email;
    int faculty_age;
    String faculty_phone;
    String faculty_dept;
    String faculty_designation;
    String faculty_role;
    int salary;
    

    public void logIn()
    {
        
        System.out.print("facultyid: ");
        Scanner sc = new Scanner(System.in);
        faculty_id = sc.nextInt();

        sc.nextLine();
        System.out.print("Password: ");
        password = sc.nextLine();

        if(faculty_id == 98765 && password.equals("user"))
        {
             display();
            System.out.println("Login Successfull");
        }
        else   
            System.out.println("Unable to Login ");
     
    }

    void display()
    {

        faculty_name = "Rohit Sharma";
        faculty_email="rohit@gmail.com";
	faculty_age=35;	
        faculty_phone = "7896543210";
        faculty_dept = "Computer Science";
        faculty_designation ="Associate prof.";
	faculty_role = "Coordinator";
	salary = 45000;

        System.out.println("***** Faculty Details********");
        System.out.println("Name :-" + faculty_name);
        System.out.println("Email :-" + faculty_email);
        System.out.println("Age :-" + faculty_age);
        System.out.println("Phone :-" + faculty_phone);
        System.out.println("Department :-" + faculty_dept);
        System.out.println("Designation :-" + faculty_designation);
        System.out.println("Role :-" + faculty_role);
	System.out.println("Salary :-" + salary);

    }

}