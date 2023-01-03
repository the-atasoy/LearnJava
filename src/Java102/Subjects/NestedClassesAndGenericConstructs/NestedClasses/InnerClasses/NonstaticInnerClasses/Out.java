package Java102.Subjects.NestedClassesAndGenericConstructs.NestedClasses.InnerClasses.NonstaticInnerClasses;

// Outer class
public class Out {

    int a = 5;

    // Inner class
    public class In{
        int a = 10;
        // this method belongs In class
        public void run(){
            int a = 1;
            System.out.println(a); // prints the "a" belongs the run method which belongs "In" class
            System.out.println(this.a); // prints the "a" belongs "In" class
            System.out.println(Out.this.a); // prints the "a" belongs just "Out" class
        }

        public void run2(){
            System.out.println("\nrun2 method which belongs In class executed ");
        }
    }

    // this method belongs Out class
    public void run(){
        In in = new In();
        in.run();
    }
}
