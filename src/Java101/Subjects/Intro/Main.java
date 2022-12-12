package Java101.Subjects.Intro;

public class Main
{
    public static void main(String[] args)
    {
        String myName = "Barış Atasoy";
        String myJob = "Student";
        String myNameCopy = myName;
        myName = "another name"; // if I write String myName instead of myName, this will be en error.

        System.out.println(myName);
        System.out.println(myJob);
        System.out.println(myNameCopy);

        String arg1 = args[0]; // these datas are in String [] which is top on the screen. you can reach them
        String arg2 = args[1]; // by using run -> edit configurations -> program arguments

        System.out.println(arg1);
        System.out.println(arg2);
    }

}