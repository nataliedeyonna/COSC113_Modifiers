
// java uses 4 access modifiers -  public, private,protected, _
// access modifiers are applicable to attribute constructors, setters and getters, methods

//public = accessIble from EVERYWHERE
//private = accessible from inside the class
public class Main{

    //You can create overloaded constructors by varying 1) the parameter number, 2) order
    public static void main(String[] args){

        Student s8,s9,s10;
        s8 = new Student ();
   // s8.gpa = 4.0;
        s8.FN = "Praise";
        s8.LN = "Ben";
       // s8.gpa = -3.1;

        s8.setGpa(3.8);

        //code form Sept 3rd
        Student s6 = new Student();
        // Setting names
        s6.FN = "Melanie";
        s6.setLN("Thomas");
        s6.LN = "Simpson";

        Student s4 = new Student ("Helena","Payton");
        System.out.println(s4.FN);
        System.out.println(s4.LN);
        System.out.println(s4.Sid);
        System.out.println("-------------------------");
        //Variable s1 is of Student type
        Student s1;
        s1 = new Student();
        System.out.println(s1);
        System.out.println(s1.FN);

        Student s2;
        s2 = new Student("Tobiloba", "Ayodeji",  14141);
        System.out.println(s2.FN);
        System.out.println(s2.LN);

        Student s3;
        String FN = "Miguel";
        String LN = "Gascaortega";
        int Sid = 31415;
        s3 = new Student(FN, LN, Sid);
        System.out.println(s3.FN);
        System.out.println(s3.LN);

        Student s5;
        s5 = new Student(FN, Sid, LN);
    }
}