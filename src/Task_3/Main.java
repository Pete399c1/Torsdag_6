package Task_3;

import java.util.ArrayList;

//3.6 Lav en klasse Main med en main-metode, hvor du tester Student og Teacher.
public class Main {
    public  static void main(String[]args){
        // Du skal oprette et antal studerende og et antal undervisere og give dem ArrayLists af Strings
        ArrayList<String> studentPassedCourses1 = new ArrayList<>();
        studentPassedCourses1.add("English 101");

        ArrayList<String> studentPassedCourses2 = new ArrayList<>();
        studentPassedCourses2.add("Java 1.0");

        ArrayList<String> teacherCanTeach1 = new ArrayList<>();
        teacherCanTeach1.add("English 101");

        ArrayList<String> teacherCanTeach2 = new ArrayList<>();
        teacherCanTeach2.add("Java 1.0");

        // Du skal oprette et antal studerende og et antal undervisere og give dem ArrayLists af Strings
        // instantiate objects
        Student student1 = new Student("Peter", studentPassedCourses1);
        Student student2 = new Student("Ila", studentPassedCourses2);
        Teacher teacher1 = new Teacher("Tess",teacherCanTeach1);
        Teacher teacher2 = new Teacher("Jesper",teacherCanTeach2);

        // oprettelsen  af ArrayList person
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(student1);
        persons.add(student2);
        persons.add(teacher1);
        persons.add(teacher2);

        // loop going through the arrayList person
        // set til at tilføje kurset java 1.0
        // til alle objecter i person listen
        String course = "Java 1.0";
        for(Person person:persons){
            boolean result = person.addCourses(course);

            // afhængigt af om the mislykkedse laves et if statement
            // og printes relevante beskeder
            if(!result){
                if(person instanceof Student){
                    System.out.println(person.getName() + " Have already passed this course");
                } else if (person instanceof Teacher){
                    System.out.println(person.getName() + " Can't teach on this subject");
                }

            }

        }
    }
}
