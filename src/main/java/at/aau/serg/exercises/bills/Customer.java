package at.aau.serg.exercises.bills;

public class Customer {
    private Long id;
    private String vorname, nachname;

    public Customer(Long id, String vorname, String nachname) {
        this.id = id;
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public Long getId() {
        return id;
    }
    public String getVorname() {
        return vorname;
    }
    public String getNachname() {
        return nachname;
    }

}
