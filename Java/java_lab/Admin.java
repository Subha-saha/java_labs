package padmin;

import java.util.Scanner;

public class Admin
{
    
    String password;
    int ad_id;
    String ad_name;
    String ad_email;
    

    public void logIn()
    {
        
        System.out.print("userId: ");
        Scanner sc = new Scanner(System.in);
        ad_id= sc.nextInt();

        sc.nextLine();
        System.out.print("Password: ");
        password = sc.nextLine();

        if(ad_id == (12345) && password.equals("admin"))
        {
             
            System.out.println("Login Successfull");
            System.out.println();
            display();
        }
        else   
            System.out.println("Unable to Login ");
     
    }

    void display()
    {
        System.out.println("***** Admin Details********");
        ad_name = "Admin";
        ad_email="admin@gmail.com";
        
        

        System.out.println("Name :-" + ad_name);
        System.out.println("Email :-" + ad_email);
       
    }

}
