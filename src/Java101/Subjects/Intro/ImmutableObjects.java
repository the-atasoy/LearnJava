package Java101.Subjects.Intro;

public class ImmutableObjects
{
    public static void main(String[] args) {
        String str = "old value";
        str = "new value"; // str is equal to new value now and old value doesn't exist anymore.
                           // old value was removed from memory by the java garbage collector.
                           // because String objects are immutable.
    }
}
