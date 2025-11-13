package at.aau.serg.exercises.persons;

public class Architect extends Person {
    private ArchitectureField field;

    @Override
    public String getJobBeschreibung() {
        return "Designs the architecture of the project.";
    }

    public Architect(String firstname, String lastname, Integer age,
                     ArchitectureField field) {
        super(firstname, lastname, age);
        this.field = field;
    }
}