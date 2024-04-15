public class Student extends Person{
    // freshman, sophomore, junior, senior
    String status;

    //constructor
    public Student(String Name, String Address, String Phone_Number, String Email_address, String status){
        super(Name, Address, Phone_Number, Email_address);
        this.status = status;

    }

    public String getStatus(){
        return this.status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    @Override
    public String toString(){
        return "\nName: "
                + getName()
                + "\nAddress: "
                + getAddress()
                + "\nPhone Number: "
                + getPhone_Number()
                + "\nEmail Address: "
                + getEmail_address()
                + "\nStatus: "
                + getStatus();
    }


}
