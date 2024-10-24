package Task_3;

import java.util.ArrayList;
// 3.2: Lav to klasser Student og Teacher, som arver fra Person.
public class Teacher extends Person {

    final private ArrayList<String> canTeach;
    final private ArrayList<String> currentCourses;

    //Lav konstruktører til klasserne, som kalder Persons konstruktør ved at bruge keywordet super().
    public Teacher(String name, ArrayList<String> canTeach) {
        super(name);
        this.canTeach = canTeach;
        this.currentCourses = new ArrayList<>();
    }
    // om skriv the addCourses method from the Person class
    @Override
    public boolean addCourses(String course) {
        if (!canTeach.contains(course)) {
            return false;     // teacher can't teach the subject
        }
        currentCourses.add(course);  // add to the already existing courses
        return true;
    }
    // method with data type arraylist string that returns currentCourses
    public ArrayList<String> getCurrentCourses(){
        return currentCourses;
    }
}

