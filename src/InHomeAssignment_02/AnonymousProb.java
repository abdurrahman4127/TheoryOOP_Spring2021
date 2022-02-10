package InHomeAssignment_02;

class Shape {

    void drawIt(String msg)
    {
        System.out.println("drawing " + msg);
    }
}

class Triangle extends Shape
{
    @Override
    void drawIt(String msg) {
        super.drawIt(msg);
    }
}


public class AnonymousProb
{
    public static void main(String[] args)
    {


    }
}
