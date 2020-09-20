package polymorphism_demo;

/*
interface Printable{
    void print();
}
interface Showable extends Printable{
    void show();
}

*/

class Interface2 implements Showable{
    public void print(){System.out.println("Hello");}
    public void show(){System.out.println("Welcome");}

    public static void main(String args[]){
        Interface2 obj = new Interface2();
        obj.print();
        obj.show();
    }
}