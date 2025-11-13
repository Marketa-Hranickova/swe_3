package at.aau.serg.exercises.persons;

public class Tester extends Person {
    private String preferredTestingFramework;

    public Tester (String firstname, String lastname, Integer age,
                   String preferredTestingFramework) {
        super(firstname, lastname, age);
        this.preferredTestingFramework = preferredTestingFramework;
    }

    @Override
    public String getJobBeschreibung() {
        return "Tests code.";
    }

}
