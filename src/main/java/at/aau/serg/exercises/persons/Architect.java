package at.aau.serg.exercises.persons;

public class Architect extends Person {
    public String field;

    @Override
    public String getJobBeschreibung() {
        return "Designs the architecture of the project.";
    }
}