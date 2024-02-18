package dumplings;

import java.time.LocalDate;

public class Racer {
    private String name;
    private int numberOfDumplings;
    private boolean isFinalResult;
    private LocalDate born;

    public Racer(String name, int numberOfDumplings, boolean isFinalResult, LocalDate born) {
        this.name = name;
        this.numberOfDumplings = numberOfDumplings;
        this.isFinalResult = isFinalResult;
        this.born = born;
    }

    public Racer(String name, LocalDate born) {
        this.name = name;
        this.born = born;
        this.numberOfDumplings = 0;
    }


    public int addDumplings(int howMuch) {
        this.numberOfDumplings = this.numberOfDumplings + howMuch;
        return this.numberOfDumplings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfDumplings() {
        return numberOfDumplings;
    }

    public void setNumberOfDumplings(int numberOfDumplings) {
        this.numberOfDumplings = numberOfDumplings;
    }

    public boolean getIsFinalResult() {
        return isFinalResult;
    }

    public void setFinalResult(boolean finalResult) {
        isFinalResult = finalResult;
    }

    public LocalDate getBorn() {
        return born;
    }

    public void setBorn(LocalDate born) {
        this.born = born;
    }

    @Override
    public String toString() {
        return "Racer{" +
                "name='" + name + '\'' +
                ", numberOfDumplings=" + numberOfDumplings +
                ", isFinalResult=" + isFinalResult +
                ", born=" + born +
                '}';
    }
}
