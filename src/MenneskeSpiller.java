import java.util.Scanner;

public class MenneskeSpiller extends Spiller{

    public MenneskeSpiller(String navn) {
        super(navn);
    }

    @Override
    public Hånd handSign() {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();
        System.out.println("Du har valgt " + input);

        switch (input){
            case "sten":
                return Hånd.STEN;
            case "saks":
                return Hånd.SAKS;
            case "papir":
                return Hånd.PAPIR;
            default:
                System.out.println("Not a command");
        }
        return handSign();
    }
}
