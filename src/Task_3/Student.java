package Task_3;

import java.util.ArrayList;
// 3.2: Lav to klasser Student og Teacher, som arver fra Person.
public class Student extends Person{

    final private ArrayList<String> passedCourses;
    final private ArrayList<String> currentCourses;

    // Lav konstruktører til klasserne, som kalder Persons konstruktør ved at bruge keywordet super().
    public Student(String name, ArrayList<String> passedCourses){
        super(name);
        this.passedCourses = passedCourses;
        this.currentCourses = new ArrayList<>();
    }
    // om skriv the addCourses method from the Person class
    @Override
    public boolean addCourses(String course){
        if(passedCourses.contains(course)){
            return false; // course passed
        }
            currentCourses.add(course); // add to the at this moment courses
            return true;
    }
    // method with data type arraylist string that returns currentCourses
    public ArrayList<String> getCurrentCourses() {
        return currentCourses;
    }
}


