public abstract class Spiller {

    // Attributes
    private String navn;
    private int point;

    // Constructor
    public Spiller(String navn) {
        this.navn = navn;
        this.point = 0; // Initialize points to 0
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getPoint() {
        return point;
    }

    // Getter for navn
    public String getNavn() {
        return navn;
    }

    public int countPoints() {
        return point++;
    }
    public abstract Hånd handSign();
}
