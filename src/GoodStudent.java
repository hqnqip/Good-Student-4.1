import java.text.DecimalFormat;
import java.text.NumberFormat;

public class GoodStudent {

    //Instance Variables or "This"
    private String firstName;
    private String lastName;
    private int idNumber;
    private double gpa;
    private String csStudent;



    //Constructors (Must have the same name as class.)
    //Only method that does not have a return type.
    //They assign values to the variables. using parameters.
    public GoodStudent(String firstName, String lastName, int idNumber, double gpa, String csStudent)
    {
        //The parameters here are "that."
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.gpa = gpa;
        this.csStudent = csStudent;
    }

    //Full Constructor
    //Change in parameter type order.
    //Different variables.
    public GoodStudent(String myLastName, int myIdNumber, String myFirstName, double myGpa, String myCsStudent)
    {
        firstName = myFirstName;
        lastName = myLastName;
        idNumber = myIdNumber;
        gpa = myGpa;
        csStudent = myCsStudent;
    }

    //Default Constructor
    public GoodStudent()
    {
        firstName = "";
        lastName = "";
        idNumber = 0;
        gpa = 0.0;
        csStudent = "";
    }


    //Getters - Meant to "get" input and assign the values to instance variables.
    //These output the values when called. Example: alanTuring.firstName();
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public int getIdNumber()
    {
        return idNumber;
    }
    public String getCsStudent()
    {
        return csStudent;
    }
    public double getGpa()
    {
        return gpa;
    }



    //Setters - Meant to be allowed to change.
    public void setIdNumber(int myIdNumber)
    {
        idNumber = myIdNumber;
    }
    public void setCsStudent(String myCsStudent)
    {
        csStudent = myCsStudent;
    }
    public void setGpa(double myGpa)
    {
       gpa = myGpa;
    }



    //Brain Methods
    //Make a digital ID with first letter of first name, last name, and last three numbers.
    public String CreateID()
    {
        String lowerFirst = firstName.toLowerCase();
        String lowerLast = lastName.toLowerCase();
        int lastThreeNum = idNumber % 1000;

        return lowerFirst.substring(0,1) + lowerLast + lastThreeNum;
    }



    //CS Students being given an advantage.
    public double CSGPA()
    {
        if (csStudent.equals("Yes")) {
            gpa = gpa * 1.15;
        }
        return gpa;
    }



    //This is the toString() that outputs the object and its parameters or details.
    public String toString()
    {
        String output = "Name: " + firstName + " " + lastName +
                "\n\tID: " + idNumber +
                "\n\tGPA: " + gpa +
                "\n\tCS Student: " + csStudent;

        return output;
    }
}

/*
    Instance variables.
    3 constructors.
    toString
    All Getters and Setters
    Brain Methods: CreateID and CSGPA
*/
