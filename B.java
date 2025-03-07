public class B extends A{
    private int y;
    public B()
    {
        y=0;
    }

    public String toString(){
        super.toString();
        System.out.println("y: " + y);
    }
    // There may be instance variables, constructors, and methods that are not shown.
}