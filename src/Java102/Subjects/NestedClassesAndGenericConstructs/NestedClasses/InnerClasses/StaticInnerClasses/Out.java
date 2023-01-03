package Java102.Subjects.NestedClassesAndGenericConstructs.NestedClasses.InnerClasses.StaticInnerClasses;

// Outer class
public class Out {

    public static int a = 5;

    // Inner class
    public static class In{
        public static int a = 10;
        // this method belongs In class
        public static void run(){
            int a = 1;
            System.out.println(a); // prints the "a" belongs the run method which belongs "In" class
            System.out.println(In.a); // prints the "a" belongs "In" class
            System.out.println(Out.a); // prints the "a" belongs just "Out" class
        }

        public void run2(){
            System.out.println("\nrun2 method which belongs 'In' class executed ");
        }
    }

    // this method belongs Out class
    public static void run(){
        In.run();
    }
}
