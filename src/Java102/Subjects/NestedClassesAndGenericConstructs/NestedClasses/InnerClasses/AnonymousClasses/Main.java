package Java102.Subjects.NestedClassesAndGenericConstructs.NestedClasses.InnerClasses.AnonymousClasses;

public class Main {
    public static void main(String[] args) {
        Anonymous a = new Anonymous(){
            @Override
            public void run(){
                System.out.println("Anonymous run method executed.");
                print();
            }

            public void print(){
                System.out.println("print method executed.");
            }
        };
        a.run();
        // a.print()  this code does not work
    }
}
