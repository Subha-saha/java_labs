class School{
    int sid;

    School(){
        System.out.println("Default COnstructor");
    }
    
    
}

class Student extends School{

    int rrno=0;

    Student(){
        super();
        System.out.println("Child constructor");
    }
    public void getData(int rno){
        this.rrno = rno;
        System.out.println(rrno);
        System.out.println(rno);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.getData(1);

    }
}