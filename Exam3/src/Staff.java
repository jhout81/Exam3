public class Staff extends Employee{

    public Staff(String Name, String Address, String Phone_Number, String Email_address, String department, double monthly_salary, String date_hired){
        super(Name, Address, Phone_Number, Email_address, department, monthly_salary, date_hired);

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
