public abstract class Employee extends Person {
    String department;
    double monthly_salary;
    String date_hired;

    //constructor
    public Employee(String Name, String Address, String Phone_Number, String Email_address, String department, double monthly_salary, String date_hired){
        super(Name, Address, Phone_Number, Email_address);
        this.department = department;
        this.monthly_salary = monthly_salary;
        this.date_hired = date_hired;
    }

    public String getDepartment(){
        return this.department;
    }

    public double getMonthly_salary(){
        return this.monthly_salary;
    }

    public String getDate_hired(){
        return this.date_hired;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public void setMonthly_salary(double monthly_salary){
        this.monthly_salary = monthly_salary;
    }

    public void setDate_hired(String date_hired){
        this.date_hired = date_hired;
    }

    @Override
    public String toString() {
        return "\nName: "
                + getName()
                + "\nAddress: "
                + getAddress()
                + "\nPhone Number: "
                + getPhone_Number()
                + "\nEmail Address: "
                + getEmail_address()
                + "\nDepartment: "
                + getDepartment()
                + "\nMonthly Salary: $"
                + getMonthly_salary()
                + "\nDate Hired: "
                + getDate_hired();
    }
}
