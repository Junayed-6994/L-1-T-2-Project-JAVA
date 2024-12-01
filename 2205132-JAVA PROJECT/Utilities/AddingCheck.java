package Utilities;
import java.util.Scanner;


public class AddingCheck {

    private static boolean isInteger(String input) 
    {
        try 
        {
            Integer.parseInt(input);
            return true; 
        } 
        catch (NumberFormatException e)
        {
            return false; 
        }
    }

    private static boolean isDouble(String input) 
    {
        try 
        {
            Double.parseDouble(input);
            return true; 
        } 
        catch (NumberFormatException e) 
        {
            return false;
        }
    }

    static Scanner sc= new Scanner(System.in);
    
    //Name
    public static String inputname()
    {
        String Name;
        while (true) 
        {
            System.out.println("Enter the Name of the Player you want to add: ");
            Name = sc.nextLine().trim();
            if (Name.isEmpty()) System.out.println("Invalid input. Name cannot be empty. Please try again.");
            else if(isInteger(Name)) System.out.println("Invalid input. Name cannot be an Integer. Please try again.");
            else if(isDouble(Name)) System.out.println("Invalid input. Name cannot be an Double. Please try again.");
            else return Name;
        }
    }

    //Country
    public static String inputcountry()
    {
        String Country;
        while (true) 
        {
            System.out.println("Enter the Country Name of the Player you wanna add: ");
            Country = sc.nextLine().trim();
            if (Country.isEmpty()) System.out.println("Invalid input. Country cannot be empty. Please try again.");
            else if(isInteger(Country)) System.out.println("Invalid input. Country cannot be an Integer. Please try again.");
            else if(isDouble(Country)) System.out.println("Invalid input. Country cannot be an Double. Please try again.");
            else return Country;
        }
    }

    //Age
    public static int inputage()
    {
        int Age;
        while (true) 
        {
            System.out.println("Enter the Age of the Player you wanna add: ");
            try 
            {
                Age = Integer.parseInt(sc.nextLine().trim());
                if (Age > 0) return Age;
                System.out.println("Invalid input. Age must be positive. Please try again.");
            } 
            catch (NumberFormatException e) 
            {
                System.out.println("Invalid input. Please enter a valid integer for Age.");
            }
        }
    }

    //Height
    public static double inputheight()
    {
        double Height;
        while (true) 
        {
            System.out.println("Enter the Height of the Player you wanna add: ");
            try 
            {
                Height = Double.parseDouble(sc.nextLine().trim());
                if (Height > 0) return Height;
                System.out.println("Invalid input. Height must be positive. Please try again.");
            } 
            catch (NumberFormatException e) 
            {
                System.out.println("Invalid input. Please enter a valid Double for Height.");
            }
        }
    }

    //ClubName
    public static String inputclub()
    {
        String Club;
        while (true) 
        {
            System.out.println("Enter the Club Name of the Player you wanna add: ");
            Club  = sc.nextLine().trim();
            if (Club.isEmpty()) System.out.println("Invalid input. Club Name  cannot be empty. Please try again.");
            else if(isInteger(Club)) System.out.println("Invalid input. Club Name  cannot be an Integer. Please try again.");
            else if(isDouble(Club)) System.out.println("Invalid input. Club Name  cannot be an Double. Please try again.");
            else return Club;
        }
    }

    //Position
    public static String inputposition()
    {
        String Position;
        while (true) 
        {
            System.out.println("Enter the Playing Position of the Player you wanna add: ");
            Position = sc.nextLine().trim();
            if (Position.isEmpty()) System.out.println("Invalid input. Playing Position cannot be empty. Please try again.");
            else if(isInteger(Position)) System.out.println("Invalid input. Playing Position  cannot be an Integer. Please try again.");
            else if(isDouble(Position)) System.out.println("Invalid input. Playing Position cannot be an Double. Please try again.");
            else return Position;
        }
    }

    //Jersey_Number
    public static int inputjersey()
    {
        int Jersey_Number;
        while (true) 
        {
            System.out.println("Enter the Jersey Number of the Player you wanna add: ");
            System.out.println("Please Press Enter if you dont want to add the Jersey Number");
            String str = sc.nextLine();
            if(!str.isEmpty())
            {
                try
                {
                    Jersey_Number = Integer.parseInt(str);
                    if (Jersey_Number > 0) return Jersey_Number;
                    System.out.println("Invalid input. Jersey Number must be positive. Please try again.");
                } 
                catch (NumberFormatException e) 
                {
                    System.out.println("Invalid input. Please enter a valid integer for Jersey Number.");
                }
            }
            else 
            {
                Jersey_Number = -1;
                return Jersey_Number;
            }
        }
    }

    //WeeklySalary
    public static int inputsalary()
    {
        int Weekly_Salary;
        while (true) 
        {
            System.out.println("Enter the Weekly Salary of the Player you wanna add: ");
            try 
            {
                Weekly_Salary = Integer.parseInt(sc.nextLine().trim());
                if (Weekly_Salary > 0) return Weekly_Salary;
                System.out.println("Invalid input. Weekly Salary must be positive. Please try again.");
            } 
            catch (NumberFormatException e) 
            {
                System.out.println("Invalid input. Please enter a valid integer for Weekly Salary.");
            }
        }
    }
}
