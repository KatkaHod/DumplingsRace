package dumplings;
import java.time.LocalDate;

public class Race {
    private String title;
    private int yearOfRace;
    private LocalDate date;
    private Racer winner; //Object of racer class

    public Race(String title, int yearOfRace, LocalDate date, Racer winner) {
        this.title = title;
        this.yearOfRace = yearOfRace;
        this.date = date;
        this.winner = winner;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfRace() {
        return yearOfRace;
    }

    public void setYearOfRace(int yearOfRace) {
        this.yearOfRace = yearOfRace;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Racer getWinner() {
        return winner;
    }

    public void setWinner(Racer winner) {
        this.winner = winner;
    }


    @Override
    public String toString() {
        return "Race{" +
                "title='" + title + '\'' +
                ", yearOfRace=" + yearOfRace +
                ", date=" + date +
                ", winner=" + winner +
                '}';
    }
}
