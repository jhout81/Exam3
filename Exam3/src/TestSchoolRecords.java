import java.util.ArrayList;
import java.util.Arrays;

public class TestSchoolRecords {

    public static void main(String[] args){
        Person[] persons = new Person[]{
                new Student("Jon Conn", "89th Street", "(303)-529-5518", "Jon@yourconn.com", "sophomore"),
                new Student("Kylie Portland", "16th Street", "(435)-789-2222", "kiki@transformers.com", "junior"),
                new Faculty("Jane Diamond", "5560 Colfax Ave", "(720)-555-1414", "jane@tarzan.com", "Biology", 3000, "05/25/2015", "3pm to 5pm", "senior"),
                new Faculty("Joan Caramel", "6969 Myplace Blvd", "(303)-487-2589", "hotCaramel@parks.com", "Sociology", 2300, "10/14/2020", "1pm to 2pm", "junior"),
                new Staff("Randy Sasquatch", "5280 Peak Drive", "(303)-478-1345", "squatchy@timber.com", "Janitorial", 2000, "01/20/2013"),
                new Staff("Carl Roseymint", "2330 Sunset Lane", "(487)-555-8963", "hotcarl@snooze.com", "Food Science", 2323.45, "07/08/2022"),
        };

        for (Person person : persons) {
            String personType = "";
            if (person instanceof Student) {
                personType = "Student";
            } else if (person instanceof Faculty){
                personType = "Faculty";
            }else if (person instanceof Employee){
                if (person instanceof Staff) {
                    personType = "Staff";
                }
            }
            //prints out
            System.out.println(personType + person.toString() + "\n");

            //I commented the function call out because while it
            // does return the array with employees it prints
            //them several times in between the first list
            // of printed persons above
            
            //System.out.println(newlistArray(persons));
        }

    }
    // Function to return a new array with just list of employees
    public static String newlistArray(Person[] origList) {
        Person[] updatedArray = new Person[2];
        int count = 0;
        for (Person person : origList) {
            if (person instanceof Employee){
                count += 1;
                Person add1 = person;
                updatedArray[count] = add1;
                updatedArray = Arrays.copyOf(updatedArray, updatedArray.length + count);
            }
        }
        return Arrays.toString(updatedArray);
    }




}
