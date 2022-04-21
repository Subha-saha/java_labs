class event
{
   private int event_id;
   private String event_name;
   private String event_venue;
   static String event_campus;
   static Time event_time;
   event()
   {
       //Default constructor
       event_id = 100;
       event_name = " Revolutions";
       event_venue = "Back-gate";
       event_time = "09:45";
   }
   event(int num1, String str, int num2)
   {
       //Parameterized constructor
       event_id = num1;
       event_name = str;
       event_venue = num2;
   }
   //Getter and setter methods
   public int getStuID() {
       return event_id;
   }
   public void setStuID(int event_id) {
       this.event_id = event_id;
   }
   public String getStuName() {
       return event_name;
   }
   public void setStuName(String event_name) {
       this.event_name = event_name;
   }
   public int getStuAge() {
       return event_venue;
   }
   public void setStuAge(int event_venue) {
       this.event_venue = event_venue;
   }

   public static void main(String args[])
   {
       //This object creation would call the default constructor
       event myobj = new event();
       System.out.println("Student Name is: "+myobj.getStuName());
       System.out.println("Student Age is: "+myobj.getStuAge());
       System.out.println("Student ID is: "+myobj.getStuID());

       /*This object creation would call the parameterized
        * constructor event(int, String, int)*/
       event myobj2 = new event(555, "Chaitanya", 25);
       System.out.println("Student Name is: "+myobj2.getStuName());
       System.out.println("Student Age is: "+myobj2.getStuAge());
       System.out.println("Student ID is: "+myobj2.getStuID()); 
  }
}