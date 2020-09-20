package upcast_downcast;


public class UpcastDowncastTest {

    public static void main(String args[]){

        A obj1 = new A();

        B obj2 = new B();

        A obj3 = new B(); //Upcasting... only non-static method of child class will be called.
                          //But static and non static attributes of parent class is used
                          //and static method of parent class is invoked.

        System.out.println("----------------------------");

        System.out.println(obj3.a);
        System.out.println(obj3.b);
        obj3.m1();
        obj3.m2();
        //not possible obj3.m3();
        //not possible obj3.m4();
        System.out.println("----------------------------");

        // A b = (C)d;

        B obj4 = (B) obj3;  //Downcasting...everything of sub class is invoked.

        System.out.println(obj4.a);
        System.out.println(obj4.b);
        obj4.m1();
        obj4.m2();
        obj4.m3();
        obj4.m4();

    }

}



