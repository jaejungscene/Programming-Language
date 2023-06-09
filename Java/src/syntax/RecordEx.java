package syntax;

/**
 * reference: https://docs.oracle.com/en/java/javase/20/language/records.html
 * RecordRectangle() and ClassRectangle() is same!!
 */

record RecordRectangle(double length, double width) { }

final class ClassRectangle {
    private final double length;
    private final double width;

    public ClassRectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double length() { return this.length; }
    double width()  { return this.width; }

    // Implementation of equals() and hashCode(), which specify
    // that two record objects are equal if they
    // are of the same type and contain equal field values.
//    public boolean equals...
//    public int hashCode...

    // An implementation of toString() that returns a string
    // representation of all the record class's fields,
    // including their names.
//    public String toString() {...}
}

public class RecordEx {
    public static void main(String[] args) {
        RecordRectangle rr = new RecordRectangle(123, 3.2);
        System.out.println(rr);

        ClassRectangle cr = new ClassRectangle(2.34, 6.4);
        System.out.println(cr);
    }
}
