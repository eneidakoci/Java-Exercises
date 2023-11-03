package skedaret;
public class AfishimRreshtashArgs {
    public static void main(String[] args) {
        // Kontrollojme nese ka argumente te ndryshme
        if (args.length == 0) {
            System.out.println("Nuk ka argumente te dhena.");
        } else {
            System.out.println("Argumentet e dhena jane:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argumenti #" + (i + 1) + ": " + args[i]);
            }
        }
    }
}

