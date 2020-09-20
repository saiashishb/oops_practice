package polymorphism_demo;


    interface Printable{
        void print();
    }
    interface Showable{
        void print();
    }

    class Interface1 implements Printable, Showable{
        public void print(){System.out.println("Hello");}
        public static void main(String args[]){
            Interface1 obj = new Interface1();
            obj.print();
        }
    }


