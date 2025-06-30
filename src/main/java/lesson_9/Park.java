package lesson_9;

public class Park {
    public final String name;

    public Attraction[] attractions;

    public class Attraction {
        public String name;
        public int worksFrom, worksUntil;
        public double ticketCost;

        public Attraction(String name, int worksFrom, int worksUntil, double ticketCost) {
            this.name = name;
            if (worksFrom >= 0 && worksFrom <= 24 && worksUntil >= 0 && worksUntil <= 24) {
                this.worksFrom = worksFrom;
                this.worksUntil = worksUntil;
            }
            else {
                System.out.println("Invalid working hours for attraction " + name);
            }
            if (ticketCost >= 0) this.ticketCost = ticketCost;
            else {
                System.out.println("Ticket cost for attraction " + name + " in the park " + Park.this.name + " should not be less then 0");
            }
        }
    }

    public Park(String name) {
        this.name = name;
    }
}
