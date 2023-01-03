package Java102.Subjects.NestedClassesAndGenericConstructs.NestedClasses.InnerClasses.LocalClasses;

public class LocalClass {
    protected void run(){

        class Local{
            private int a;

            public Local(int a) {
                this.a = a;
            }

            public int getA() {
                return a;
            }

            public void setA(int a) {
                this.a = a;
            }
        }

        Local local = new Local(21);
        System.out.println("class 'LocalClass' executed.");
        System.out.println(local.getA());
    }
}
