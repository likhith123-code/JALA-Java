package Exceptions;

public class NullException {
    public static void main (String[] args)
    {
        // Initialing String variable with null value
        String ptr = null;

        // Checking if ptr is null using try catch.
        try
        {
            if ("gfg".equals(ptr))
                System.out.print("Same");
            else
                System.out.print("Not Same");
        }
        catch(NullPointerException e)
        {
            System.out.print("Caught NullPointerException");
        }
    }
}
