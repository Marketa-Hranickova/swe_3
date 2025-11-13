package at.aau.serg.exercises.persons;

public class Developer extends Person {
    private String preferredProgrammingLanguage;
    private IDE ide;
    private boolean database;

    public Developer(String firstname, String lastname, Integer age,
                     String lang, IDE ide, boolean db) {
        super(firstname, lastname, age);
        this.preferredProgrammingLanguage = lang;
        this.ide = ide;
        this.database = db;
    }

    @Override
    public String getJobBeschreibung() {
        return "Develops code.";
    }
}
