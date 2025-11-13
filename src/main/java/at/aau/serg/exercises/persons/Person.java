package at.aau.serg.exercises.persons;

public abstract class Person {
    public String firstname, lastname;
    public Integer age;
    public String profession;

    public String getJobBeschreibung() {
        switch (profession) {
            case "Developer":
                return "Develops code.";
            case "Architect":
                return "Designs the architecture of the project.";
            case "Tester":
                return "Tests code.";
            default:
                return "";
        }
    }
}



