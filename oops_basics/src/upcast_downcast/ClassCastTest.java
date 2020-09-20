package upcast_downcast;
/*




   //Class Cast Exception: upcast_downcast.A b = C(d)

   compiler check: are c and d is-a related parent-child or vice versa or same or says inconvertible type
                   and, is upcast_downcast.A PARENT OF C related? legal or not
   jvm check: see below

   //Object o = new String("sai");
   StringBuffer sb = (StringBuffer) o;// runtime error ...will DEFINITELY COMPILE
   BUT JVM THROWS ERROR.

   IMP!!!:
   JVM CHECK: INTERNALLY ... WE HAVE TO SEE WHAT THE REF VARIABLE D INTERNALLY REFERS TO


   String s = new String("sai");
   StringBuffer sb = (StringBuffer) s;//comp error as no rel bw s and sb

   String s = new String("sai");
   StringBuffer sb = (String) s;//comp error as STring is not child of STring Buffer

   RUN TIME EXCP:
   d(INTERNALLY: NOT REF TYPE BUT MEMORY TYPE)  has to be same as of c
   or child of c else cast class exc

   Object o = new String("sai");//internally string not object type
   String s = (String) o;

   It is accepted.


   CONCLUSION: JVM CHECK STEP SEES MEMORY TYPE NOT REF TYPE
   COMPILE CHECK STEP SEES REF TYPE NOT INTERNALLY WHICH MEMORY TYPE


    */

public class ClassCastTest {

    /*
    Object o = new String("sai");
    StringBuffer sb = (StringBuffer) o;
    */

    /*
    String s = new String("sai");
    StringBuffer sb = (StringBuffer) s;
    */

    /*
    String s = new String("sai");
    StringBuffer sb = (String) s;
    */


    static Object o = new String("sai");
    static String s = (String) o;



    public static void main(String[] args){
        System.out.println(ClassCastTest.s);
    }



}
