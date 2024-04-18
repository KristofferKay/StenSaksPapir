public class Spil {
    int rounds = 3;
    boolean endGame = false;
    Spiller spiller1;
    Spiller spiller2;


    public Spil(){
        this.spiller1 = spiller1;
        this.spiller2 = spiller2;

    }

    public void start(Spiller spiller1, Spiller spiller2) {
        int rounds = 0;

        System.out.println("Velkommen til Sten Saks Papir");
        while (rounds <= 4 || spiller1.getPoint() == 5 || spiller2.getPoint() == 5) {
            rounds++;
            System.out.println("Runde: " + rounds);
            System.out.println("Skriv en af følgende: Sten, Saks eller Papir");
            spiller1.handSign();

            spiller2.handSign();
            System.out.println("Spiller 2 har valgt " + spiller2.handSign());

            Hånd player1Choice = spiller1.handSign();
            Hånd player2Choice = spiller2.handSign();

            if (player1Choice.equals(player2Choice)) {
                System.out.println("Uafgjort, no points added");
            } else if (player1Choice.equals("Sten") && player2Choice.equals("Saks") ||
                    player1Choice.equals("Saks") && player2Choice.equals("Papir") ||
                    player1Choice.equals("Papir") && player1Choice.equals("Sten")) {
                System.out.println("Spiller 1 vandt!");
                spiller1.countPoints();
            } else {
                System.out.println("Spiller 2 vandt!");
                spiller2.countPoints();
            }

            System.out.println("Result:");
            System.out.println("Player1 " + spiller1.getPoint() + " points");
            System.out.println("Player2 " + spiller2.getPoint() + " points");
        }
    }

}
