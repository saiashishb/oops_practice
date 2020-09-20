package upcast_downcast;

class B extends A{
    int a = 333;
    static int b = 444;

    void m3() {
        System.out.println("sub-class non static m3 method");
    }

    static void m4() {
        System.out.println("sub-class static m4 method");
    }

    void m1() {
        System.out.println("sub-class non static m1 method");
    }

    static void m2() {
        System.out.println("sub-class static m2 method");
    }


}
