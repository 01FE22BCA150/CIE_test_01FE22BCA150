import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

class Student{
    public String name;
    public int dob;

    public void displayname(){
        System.out.println("Name of the Student:"+name);
    }
    public void displayage(String dob){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate Birthdate = LocalDate.parse(dob, formatter);
        LocalDate Currentdate = LocalDate.now();
        Period period = Period.between(Birthdate, Currentdate);
        int age = period.getYears();
        System.out.println("Age of the Student:"+age);
    }
    public static void main(String[] args){
        Student s = new Student();
        s.name="Manali";
        s.dob=2004-04-18;
        s.displayname();
        s.displayage("2004-04-18");
    
    }
}