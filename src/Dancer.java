public class Dancer extends Person {
    private String croupName;


    public Dancer(String name, String designation, String croupName) {
        super(name, designation);
        this.croupName = croupName;
    }

    public String getCroupName() {
        return croupName;
    }

    public void setCroupName(String croupName) {
        this.croupName = croupName;
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "croupName='" + croupName + '\'' +
                '}' + super.toString();
    }

    void dancing() {

    }

}
