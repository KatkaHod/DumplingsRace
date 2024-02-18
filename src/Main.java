import dumplings.Race;
import dumplings.Racer;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        Racer firstRacer = new Racer("David Novak",5,true,LocalDate.of(1990,3,1));
        Racer secondRacer = new Racer("Alexa Walicz",4,true,LocalDate.of(1996,2,10));

    Race race2017 = new Race("Race 2017", 2017, LocalDate.of(2017,1,1), firstRacer);
    Race race2018 = new Race("Race 2018", 2018, LocalDate.of(2018, 9,5), secondRacer);
    Race race2019 = new Race("Race 2019", 2019,LocalDate.of(2019,6,4),secondRacer);

        System.out.println(firstRacer.getName());
        System.out.println(secondRacer.getName());


    }




}


