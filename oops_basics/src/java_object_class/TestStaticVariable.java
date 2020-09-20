package java_object_class;

//Java Program to demonstrate the use of static variable
class Student3{
    int rollno;//instance variable
    String name;
    static String college ="ITS";//static variable
    //constructor
    Student3(int r, String n){
        rollno = r;
        name = n;
    }
    //method to display the values
    void display (){System.out.println(rollno+" "+name+" "+college);}
}
//Test class to show the values of objects
public class TestStaticVariable{
    public static void main(String args[]){
        Student3 s1 = new Student3(111,"Karan");
        Student3 s2 = new Student3(222,"Aryan");
        //we can change the college of all objects by the single line of code
        //Student.college="BBDIT";
        s1.display();
        s2.display();
    }
}
