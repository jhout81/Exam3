public class Person {
    // variables/fields
    String Name;
    String Address;
    String Phone_Number;
    String Email_address;

    //constructor
    public Person(String Name, String Address, String Phone_Number, String Email_address){
        this.Name = Name;
        this.Address = Address;
        this.Phone_Number = Phone_Number;
        this.Email_address = Email_address;
    }
    //getters
    public String getName(){
        return this.Name;
    }
    public String getAddress(){
        return this.Address;
    }
    public String getPhone_Number(){
        return this.Phone_Number;
    }
    public String getEmail_address(){
        return this.Email_address;
    }
    //Setters
    public void setName(String Name){
        this.Name = Name;
    }

    public void setAddress(String Address){
        this.Address = Address;
    }

    public void setPhone_Number(String Phone_Number){
        this.Phone_Number = Phone_Number;
    }

    public void setEmail_address(String Email_address){
        this.Email_address = Email_address;
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
                + getEmail_address();

    }


}
