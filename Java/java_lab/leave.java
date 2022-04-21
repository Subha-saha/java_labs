package pleave;

import java.util.Scanner;

public class leave
{
 	
    int lv_id;
    String lv_datefrom;
    String lv_dateto;
    String lv_desc;
    String lv_status;
    int lv_period;

 public void display()
{

lv_id = 2001;
lv_datefrom ="23-02-2022";
lv_dateto = "28-02-2022";
lv_desc = "medical leave";
lv_status = "completed";
lv_period = 6;


System.out.println("*****Leave Details********");
System.out.println("leave id :" + lv_id);
System.out.println("leave datefrom :" + lv_datefrom);
System.out.println("leave dateto :" + lv_dateto);

System.out.println("leave desc :" + lv_desc);
System.out.println("leave status :" + lv_status);
System.out.println("leave period :" + lv_period);

}
}




