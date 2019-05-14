package ex4;

public class Ticket {
    static int count = 0;
    private int number;

    public Ticket(){
        count++;
        this.number = count;
    }

    public int getNumber(){
        return this.number;
    }

    public String toString() {
        return "ex4.Ticket(" + getNumber() + ")";
    }
}