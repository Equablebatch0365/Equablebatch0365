package vut;

/**
 *
 * @author M Modiba
 */
public class ifstatement
{

    public static void main(String[] args)
    {
        boolean isRaining = false;

        if (isRaining)
        {
            System.out.println("Bring an Umbrella!");
        }
        else
        {
            System.out.println("No rain today, no need for an umbrella!");
        }
        if (20 > 18)
        {
            System.out.println("20 is greater than 18");
        }

        int x = 20;
        int y = 19;
        if (x == y)
        {
            System.out.println("x is greater than y");
        }
        else if (x > y)
        {
            System.out.println("x is greater than y");
        }

        boolean isLightOn = true;

        if (isLightOn)
        {
            System.out.println("The light is on.");
        }

        int time = 22;

        if (time < 10)
        {
            System.out.println("Good Morning.");
        }
        else if (time < 18)
        {
            System.out.println("Good day.");
        }
        else
        {
            System.out.println("Good evening. ");
        }

        int weather = 2;

        if (weather == 1)
        {
            System.out.println("Bring an Umbrella.");
        }
        else if (weather == 2)
        {
            System.out.println("Wear sunglasses.");
        }
        else
        {
            System.out.println("Just go outside normally.");
        }
        String name = "Mthokosizi";
        
        if (name != "Mologadi") {
            System.out.println("It's Me!");
        }
   if (name != "Mthokosizi"){
       System.out.println("That's not me, I'm not a baboon.");
   }
    }
}

