package Java102.Subjects.NestedClassesAndGenericConstructs.NestedClasses.InnerClasses.NonstaticInnerClasses;

public class Main {
    public static void main(String[] args) {
        Out o = new Out();
        o.run();

        Out.In i = o.new In();
        i.run2();
    }
}
