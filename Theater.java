package scratch;

import java.util.Scanner;

public class Theater extends App{
	
	private int no_f_tickets;
	    void th() {
	        System.out.println("**the theaters available are** \n 1.Pandian theater \n 2.Satyam theater");
	        int k;
	        int an;
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        if (n == 1) {
	            System.out.println("**Pandian theater**");
	            System.out.println("**select a movie**");
	            System.out.println("movie available are \n 1.Valimai\n 2.Beast ");
	            Scanner a = new Scanner(System.in);
	            int o = a.nextInt();
	            if (o == 1) {
	                System.out.println("Beast movie @ Pandian theater");
	                System.out.println("enter the number of tickets to be booked");
	                Scanner j = new Scanner(System.in);
	                int r = j.nextInt();
	                int left= no_f_tickets-r;
	                int amount=40*r;
	                System.out.println("to continue to book for this movie prees 1");
	                Scanner d = new Scanner(System.in);
	                int h = d.nextInt();
	                System.out.println("\n\n\n");
	                if (h == 1) {
	                    System.out.println("******************");
	                    System.out.println("theater ------------------- Satyam theater");
	                    System.out.println("movie --------------------- SpiderMan");
	                    System.out.println("cost ---------------------- Rs."+amount);
	                    System.out.println("******************");
	                }

	            }
	            if (o == 2) {
	                System.out.println("Beast @ Satyam theater");
	                 System.out.println("enter the number of tickets to be booked");
	                Scanner j = new Scanner(System.in);
	                int r = j.nextInt();
	                int left= no_f_tickets-r;
	                int amount=50*r;
	                System.out.println("to continue to book for this movie press 1");
	                Scanner d = new Scanner(System.in);
	                int h = d.nextInt();
	                System.out.println("\n\n\n");
	                if (h == 1) {
	                    System.out.println("******************");
	                    System.out.println("theater ------------------- Pandian theater");
	                    System.out.println("movie --------------------- The Usual Suspects");
	                    System.out.println("cost ---------------------- Rs"+amount);
	                    System.out.println("******************");
	                }

	            }
}
	    
        if (n == 2) {
            System.out.println("**Carnival cinemas**");
            System.out.println("**select a movie**");
            System.out.println("movie available are \n 3.RRR \n 4.Joji");
            Scanner b = new Scanner(System.in);
            int p = b.nextInt();
            Scanner a = new Scanner(System.in);
            int o = a.nextInt();
            if (o == 3) {
                System.out.println("RRR @ Carnival cinemas");
                 System.out.println("enter the number of tickets to be booked");
                Scanner j = new Scanner(System.in);
                int r = j.nextInt();
                int left= no_f_tickets-r;
                int amount=60*r;
                System.out.println("to continue to book for this movie press 1");
                Scanner d = new Scanner(System.in);
                int h = d.nextInt();
                System.out.println("\n\n\n");
                if (h == 1) {
                    System.out.println("******************");
                    System.out.println("theater ------------------- Carnival cinemas");
                    System.out.println("movie --------------------- Historic movie");
                    System.out.println("cost ---------------------- Rs."+amount);
                    System.out.println("******************");
                }

            }
            if (o == 4) {
                System.out.println("Joji @ Carnival cinemas");
                 System.out.println("enter the number of tickets to be booked");
                Scanner j = new Scanner(System.in);
                int r = j.nextInt();
                int left= no_f_tickets-r;
                int amount=70*r;
                System.out.println("to continue to book for this movie prees 1");
                Scanner d = new Scanner(System.in);
                int h = d.nextInt();
                System.out.println("\n\n\n");
                if (h == 1) {
                    System.out.println("******************");
                    System.out.println("theater ------------------- Carnival cinemas");
                    System.out.println("movie --------------------- Thirller movie");
                    System.out.println("cost ---------------------- Rs."+amount);
                    System.out.println("******************");
                }

            }
        }

    

	    }

}