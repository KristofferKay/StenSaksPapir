import java.util.Random;
import java.util.Scanner;

public class ComputerSpiller extends Spiller {

    public ComputerSpiller(String navn) {
        super(navn);
    }

    @Override
    public Hånd handSign() {
        Random random = new Random();
        int choice = random.nextInt(3);
        switch (choice){
            case 1:
                return Hånd.STEN;
            case 2:
                return Hånd.SAKS;
            case 3:
                return Hånd.PAPIR;
        }
        return handSign();
    }


}
