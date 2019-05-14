package ex4;

import java.util.ArrayList;
import java.util.Iterator;

public class TicketSample {
    public static void main(String[] args) {
        ArrayList<Ticket> tickets = new ArrayList<Ticket>();
        tickets.add(new Ticket());
        tickets.add(new Ticket());
        tickets.add(new Ticket());
        tickets.add(new Ticket());
        tickets.add(new Ticket());
        Iterator<Ticket> it = tickets.iterator();
        while(it.hasNext()) {
            Ticket t = it.next();
            System.out.println(t);
        }

    }

}