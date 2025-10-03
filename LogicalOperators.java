package vut;

/**
 *
 * @author M Modiba 224813838
 */
public class LogicalOperators
{

    public static void main(String[] args)
    {
        int a = 200, b = 33, c = 500;

        if (a > b && c > a)
        {
            System.out.println("Both conditions are true"); //AND && from Logical operators
        }
        if (a > b || a > c)
        {
            System.out.println("At least one condition is true"); // OR || from logical operators
        }

        int d = 33, e = 200;

        if (!(d > e))
        {
            System.out.println("d is NOT greater than e"); //NOT ! from logical operators
        }

        boolean isLoggedIn = true;
        boolean isAdmin = false;
        int securityLevel = 7; //1 = highest

        if (isLoggedIn && (isAdmin || securityLevel <= 2))
        {
            System.out.println("Access granted");
        }
        else
        {
            System.out.println("Access denied");
        }

    }

}
