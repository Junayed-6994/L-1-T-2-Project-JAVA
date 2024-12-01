package PlayerInfo;

public class Player{
    private String Name;
    private String Country;
    private int Age;
    private double Height;
    private String Club;
    private String Position;
    private int Jersey_Number;
    private int Weekly_Salary;
    public Player(String name, String country, int age, double height, String club, String position, int jersey_Number,
    int weekly_Salary) 
    {
        Name = name;
        Country = country;
        Age = age;
        Height = height;
        Club = club;
        Position = position;
        Jersey_Number = jersey_Number;
        Weekly_Salary = weekly_Salary;
    }
    public String getName() {
        return Name;
    }
    public String getCountry() {
        return Country;
    }
    public int getAge() {
        return Age;
    }
    public double getHeight() {
        return Height;
    }
    public String getClub() {
        return Club;
    }
    public String getPosition() {
        return Position;
    }
    public int getJersey_Number() {
        return Jersey_Number;
    }
    public int getWeekly_Salary() {
        return Weekly_Salary;
    }
    @Override
    public String toString() {
        return "Detailed Information of the Player:-" + 
        "\nName = " + Name + 
        "\nCountry = " + Country + 
        "\nAge = " + Age + 
        "\nHeight = " + Height + 
        "\nClub = " + Club + 
        "\nPosition = " + Position + 
        "\nJersey_Number = " + ((Jersey_Number == -1) ? "Unavailable" : Jersey_Number) +
        "\nWeekly_Salary = " + Weekly_Salary + 
        "\n";
    }

    

    

}
