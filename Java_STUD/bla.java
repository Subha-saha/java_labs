class Temp {
    Temp() {
        // this(1);
        System.out.println("Default constructor");
    }

    Temp(int rno) {
        // this(5,"Rohit");
        System.out.println("1 argums");
    }

    Temp(int rno, String name) {
        System.out.println("2 argums");
    }

    public void area(int length) {
        System.out.println(length * length);
    }
    public void area(int length,int breadth){
        System.out.println(length*breadth);
    }
    

    public static void main(String[] args) {
        Temp t1 = new Temp();
        Temp t2 = new Temp(1);
        Temp t3 = new Temp(2, "Subh");

        t1.area(2);
        t1.area(2,5);
    }
}