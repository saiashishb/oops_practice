package abstraction_demo;

/*
abstract class Bike{
    abstract void run();
}

class Bike1{
    void print(){System.out.println("1");}
}

class Bike2 extends Bike1{
    void print(){System.out.println("2");}
}

class Bike3 extends Bike2{
    void print(){System.out.println("3");}
}

class Super_Bike extends Bike{
    void run(){System.out.println("running safely");}
    public static void main(String args[]){
        Bike obj = new Super_Bike();
        obj.run();


        Bike1 ref1 =  (Bike1) new Bike3();
        ref1.print();




    }
}

*/

class Super {
    void Sample() {
        System.out.println("method of super class");
    }
}

public class Super_Bike extends Super {
    void Sample() {
        System.out.println("method of sub class");
    }

    void Sample2() {
        System.out.println("method of sub class 2 ");
    }

    public static void main(String args[]) {
        Super obj = new Super_Bike();
        //obj.Sample2();
    }
}