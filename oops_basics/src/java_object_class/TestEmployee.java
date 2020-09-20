package java_object_class;

class Employee{
    int id;
    String name;
    float salary;
    void insert(int i, String n, float s) {
        id=i;
        name=n;
        salary=s;
    }
    void display(){System.out.println(id+" "+name+" "+salary);}
}
public class TestEmployee {
    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2=new Employee();
        Employee e3=new Employee();
        e1.insert(101,"Rohan",45000);
        e2.insert(102,"Ishan",25000);
        e3.insert(103,"Neha",55000);
        e1.display();
        e2.display();
        e3.display();

        /*

        //create array of employee object
        Employee[] obj = new Employee[2] ;

         //create & initialize actual employee objects using constructor
         obj[0] = new Employee(100,"ABC");
         obj[1] = new Employee(200,"XYZ");

        */

    }
}