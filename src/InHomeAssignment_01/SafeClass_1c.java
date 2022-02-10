package InHomeAssignment_01;

public class SafeClass_1c
{
    public static double sqrt(double number) throws Exception
    {
        if (number < 0)
            throw new Exception("Negative number");
        else
            return Math.sqrt(number);
    }

    public static void main(String[] args)
    {
        try {
            System.out.println(sqrt(3));
        }

        catch (Exception a) {
            System.out.println(a.getMessage());
        }
    }
}
