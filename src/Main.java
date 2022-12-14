import java.util.Scanner;

public class Main { // déclaration de la classe principale
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.println("Quel exercice voulez-vous tester ?");
       System.out.println("[1] Somme de 2 entiers");
       System.out.println("[2] Division de 2 entiers");
       System.out.println("[3] Volume d'un pavé droit");
       System.out.println("[4] Affichage du nom de l'utilisateur");
       int exo = s.nextInt(); // le numéro de l'exercice à éxecuter
       switch (exo){
           case 1:
               somme();
               break;
           case 2:
               division();
               break;
           case 3:
               volume();
               break;
           case 4:
               nom();
               break;
       }
    }

// ------------------------------------- SOMME DE DEUX ENTIERS ---------------------------------------------------------

    public static void somme() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier");
        int premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxieme entier");
        int deuxiemeEntier = scanner.nextInt();
        int somme = premierEntier + deuxiemeEntier;
        System.out.println("La somme de " + premierEntier + " avec " + deuxiemeEntier +
                "est egale a " + somme);

    }

// ------------------------------------- DIVISION DE DEUX ENTIERS ---------------------------------------------------------


    public static void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier");
        float premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxieme entier");
        float deuxiemeEntier = scanner.nextInt();
        float division = premierEntier/deuxiemeEntier;
        System.out.println("La division de " + premierEntier + " avec " + deuxiemeEntier +
                "est egale a " + division);

    }

    // ------------------------------------- VOLUME DE PAVE DROIT ---------------------------------------------------------

    public static void volume() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier coté");
        float premierEntier = scanner.nextFloat();
        System.out.println("Veuillez saisir le deuxieme coté");
        float deuxiemeEntier = scanner.nextFloat();
        System.out.println("Veuillez saisir le troisieme coté");
        float troisiemeEntier = scanner.nextFloat();
        float volume = premierEntier * deuxiemeEntier * troisiemeEntier;
        System.out.println("La volume du pavé droit est " + volume);

    }
// ------------------------------------- AFFICHAGE DU NOM DE L'UTILISATEUR ---------------------------------------------------------

    public static void nom() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir votre nom");
        String nom = scanner.nextLine();
        System.out.println("Bonjour, " + nom);
    }
}



