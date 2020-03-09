public class Person {
    private final String id;
    private final String givenName;
    private String surname;

    public String getGivenName(){ return givenName; }
    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }
    public String getName(){ return givenName + " " + surname; }
    protected String getID() { return id; }

    public Person(String givenName, String surname, String id){
        this.id = id;
        this.givenName = givenName;
        this.surname = surname;
    }
}