package Task_3;
//3.1 Lav en klasse Person, med feltet name. Lav også en konstruktør og relevant getter- og setter-metode.
public abstract class Person {
    private String name;

    public Person(String name){
        this.name = name;
    }
    // getter
    public String getName(){
        return this.name;
    }

    // setter
    public void setName(String name){
        this.name = name;
    }
    //Lav derudover metoden boolean addCourse(String course). Metoden skal ikke gøre noget,
    // så du kan lade den returnere true og ikke gøre andet eller via abstract gøre den uBruglig.
    public abstract boolean addCourses(String course);
}



