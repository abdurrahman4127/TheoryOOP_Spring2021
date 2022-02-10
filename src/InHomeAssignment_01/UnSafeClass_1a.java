package InHomeAssignment_01;

import java.io.IOException;

public class UnSafeClass_1a
{
    public static void unsafeMethod() throws Exception, RuntimeException
    {
        System.out.println("This is an unsafe method!");
    }

    public static void main(String[] args)
    {
        try
        {
            unsafeMethod();
        }

        catch (IOException e)
        {
            e.printStackTrace();
        }

        catch (RuntimeException e)
        {
            e.printStackTrace();
            e.getMessage();
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}