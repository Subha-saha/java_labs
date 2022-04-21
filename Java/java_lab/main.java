import java.util.Scanner;
import puser.*;
import puser.User;
import padmin.*;
import pleave.*;

public class main {
    public static void main (String args[]) {
        Scanner myObj = new Scanner(System.in);
        User userObj = new User();

        System.out.println("---Enter Your User type---");
        System.out.println("1.Admin");
        System.out.println("2.Faculty");
        System.out.print("Enter Ur Choice : ");
        int ch = myObj.nextInt();

        if (ch == 1) {
            Admin adminObj = new Admin();
            adminObj.logIn();
        } else if (ch == 2) {

            userObj.logIn();
        } else
            System.out.println("Invalid choice");

        myObj.nextLine();
        System.out.println("Do You Want to view leave(y/n) :- ");
        char c = myObj.next().charAt(0);

        if (c == 'y') {
            leave lvObj = new leave();
            lvObj.display(userObj.faculty_name, userObj.faculty_id, leaveObj.leave_period);
        } else
            System.out.println("Okay :)");
    }
}
