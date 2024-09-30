/*
Rameen Khan
April 20, 2023
Assignment 9
Compare two employees by first looking at their last names.
*/
class Employee implements Comparable<Employee>
{
    private String firstName;
    private String lastName;

    private int birthYear;

    String getFirstName()  {
        return firstName;
    }
    String getLastName()   {
        return lastName;
    }
    int getBirthYear()  {
        return birthYear;
    }

    public Employee( String f, String l, int year )
    {
        firstName = f; lastName = l; birthYear = year;
    }

    public String toString(){
        //prints first name, last name and birth year
        return "First name: " + getFirstName() + ", last name: " + getLastName() + ", birth year: " + getBirthYear();
    }

    public int compareTo( Employee other ) {
        //if the last names do not equal to each other than they will compare
        if (!(getLastName().equals(other.getLastName()))) {
            return getLastName().compareTo(other.getLastName());
        }
        //if the first names do not equal to each other than they will compare
        if (!(getFirstName().equals(other.getFirstName()))) {
            return getFirstName().compareTo(other.getFirstName());
        }
        //if the birth years do not equal to each other than their difference will be calculated
        if (!(getBirthYear() == other.getBirthYear())) {
            return (getBirthYear() - other.getBirthYear());
        }
        //ensures program runs through having 5 never return
        return 5;
    }
}

