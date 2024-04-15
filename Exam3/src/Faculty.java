public class Faculty extends Employee{

    String office_hours;
    //rank junior or senior
    String rank;

    public Faculty(String Name, String Address, String Phone_Number, String Email_address, String department, double monthly_salary, String date_hired, String office_hours, String rank){
        super(Name, Address, Phone_Number, Email_address, department, monthly_salary, date_hired);
        this.office_hours = office_hours;
        this.rank = rank;

    }

    public String getOffice_hours(){
        return this.office_hours;
    }

    public String getRank(){
        return this.rank;
    }
    public void setOffice_hours(String office_hours){
        this.office_hours = office_hours;
    }
    public void setRank(String rank){
        this.rank = rank;
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
                + getDate_hired()
                + "\nOffice Hours: "
                + getOffice_hours()
                + "\nRank: "
                + getRank();
    }

}
