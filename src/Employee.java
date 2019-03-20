public class Employee {
    private String firstName;
    private String lastName;
    private double salary;
    static double salary_fixed = 2500;

    public Employee(String name, String lastname, double salary)
    {
        this.firstName = name;
        this.lastName = lastname;
        if(salary < 0)
        {
            this.salary = 0;
        }
        else
        {
            this.salary = salary;
        }
    }

    public Employee(String name, String lastname)
    {
        this.firstName = name;
        this.lastName = lastname;
        this.salary = salary_fixed;
    }

    public void setFirstName(String name)
    {
        this.firstName = name;
    }
    public void setLastName(String lastname)
    {
        this.lastName = lastname;
    }
    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public String getFirstName(String name)
    {
        return this.firstName;
    }
    public String getLastName(String lastname)
    {
        return this.lastName;
    }
    public double getSalary(double salary)
    {
       return this.salary;
    }
}
