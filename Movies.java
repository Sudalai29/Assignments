package scratch;

import java.util.Scanner;

public class Movies {
	public static void main(String[] args) {
        App ob = new App();

        App[] moviename = new App[2];
        moviename[0] = ob;
        Theater a=new Theater();
        moviename[1] =a;

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
        System.out.println("---------1.list of movies and their prices--------- \n-------2.acces and book tickets through theaters---");

        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        Scanner d = new Scanner(System.in);
        int h = d.nextInt();
        switch (h) {
            case 1: { 
                ob.movies();
                break;
            }
            case 2: {
             
               a.th();
            }
        }

    }
}
