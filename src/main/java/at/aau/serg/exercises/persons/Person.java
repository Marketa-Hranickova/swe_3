package at.aau.serg.exercises.persons;

public abstract class Person {
    protected String firstname, lastname;
    protected Integer age;
    protected String profession;

    public Person(String firstname, String lastname, Integer age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public abstract String getJobBeschreibung();

}



