import java.util.*;
class cat1
{
static int id;
int ar[]=new int[30];
String name;
String dept;
String sec;
int year;
Performance()
{
this(201,"Aakash","MCA","B",2022);
System.out.println("    Default constructor called");
}
Performance(int id,String name,String dept,String sec,int year)
{
this.id=id;
this.name=name;
this.dept=dept;
this.sec=sec;
this.year=year;
System.out.println("   Chained constructor called");
System.out.print("  "+id);
System.out.print("  "+name);
System.out.print("  "+dept);
System.out.print("  "+sec);
System.out.print("  "+year);
System.out.println();
}
static void generate()
{
System.out.println("automatic generation student id ="+id);
}
public void readMarks()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the marks of 10 students from 0 to 100 in 3 subjects");
for (int i=0;i<30;i++)
{
ar[i]=sc.nextInt();
}
}
public int highestMarks()
{
int max=ar[0];
for (int i=0;i<30;i++)
{
if (ar[i]>max)
{
max=ar[i];
}
}
return max;
}

public int leastMarks()
{
int min=ar[0];
for (int i=0;i<30;i++)
{
if (ar[i]<min)
{
min=ar[i];
}
}
return min;
}

public void display()
{
System.out.println("highest marks are ="+highestMarks());
System.out.println("lowest marks are ="+leastMarks());
int m=getMode();
System.out.println("mode of marks ="+m);
System.out.println("frequency is ="+getFreqAtMode(m));

}
int getMode()
{int c=0;
int temp=ar[0];
for (int i=0;i<30;i++)
{
if (temp==ar[i])
c++;
}
return temp;
}
public int getFreqAtMode(int n)
{
int c=0;
for (int i=0;i<30;i++)
{
if (n==ar[i])
c++;
}
return c;
}

public static void main(String args[])
{
Performance p= new Performance();
p.readMarks();
p.display();
Performance p1= new Performance(202,"rohit","MCA","B",2022);
Performance p2= new Performance(203,"reuben","MCA","B",2022);
Performance p3= new Performance(204,"jeetank","MCA","B",2022);
Performance p4= new Performance(205,"subahdeep","MCA","B",2022);
Performance p5= new Performance(206,"bikash","MCA","B",2022);
Performance p6= new Performance(207,"adarsh","MCA","B",2022);
Performance p7= new Performance(208,"akshay","MCA","B",2022);
Performance p8= new Performance(209,"yash","MCA","B",2022);
Performance p9= new Performance(210,"aditya","MCA","B",2022);
Performance p10= new Performance(211,"rachit","MCA","B",2022);
Performance.generate();
}

}