package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    Scanner scanner = new Scanner(System.in);

	    Persoon p = new Persoon();

	    int jaar;
	    int maand;
	    int dag;

        System.out.print("Geef naam: ");

        p.setNaam(scanner.nextLine());

        System.out.print("Geef geboortejaar: ");

        jaar = Integer.parseInt(scanner.nextLine());


        System.out.print("Geef geboortemaand: ");

        maand = Integer.parseInt(scanner.nextLine());

        System.out.print("Geef geboortedag: ");

        dag = Integer.parseInt(scanner.nextLine());

        p.setGeboorteDatum(dag, maand, jaar);

        System.out.printf("Dag %s, je bent %d jaar oud.", p.getNaam(), p.getLeeftijd());

    }
}
