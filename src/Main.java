public class Main {
    public static void main(String[] args) {
        Spil spil = new Spil();
        Spiller spiller1 = new MenneskeSpiller("Player1");
        Spiller spiller2 = new ComputerSpiller("Player2");
        spil.start(spiller1, spiller2);

    }
}
