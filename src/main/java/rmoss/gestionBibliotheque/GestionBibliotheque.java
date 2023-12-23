package rmoss.gestionBibliotheque;

import rmoss.gestionBibliotheque.controller.EmpruntController;
import rmoss.gestionBibliotheque.controller.MediaController;
import rmoss.gestionBibliotheque.controller.UtilisateurController;
import rmoss.gestionBibliotheque.model.Bibliotheque;
import rmoss.gestionBibliotheque.model.Emprunt;

import java.util.HashSet;
import java.util.Scanner;

public class GestionBibliotheque {
    private static final UtilisateurController userController = new UtilisateurController();
    private static final MediaController mediaController = new MediaController(new Bibliotheque());
    private static final EmpruntController empruntController = new EmpruntController(new HashSet<Emprunt>());
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println("Menu Principal:");
            System.out.println("1. Gestion des Utilisateurs");
            System.out.println("2. Gestion des Médias");
            System.out.println("3. Gestion des Prêts");
            System.out.println("4. Quitter");
            System.out.print("Choisissez une option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    manageUsers();
                    break;
                case 2:
                    manageMedia();
                    break;
                case 3:
                    manageLoans();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
            }
        }
        scanner.close();
    }

    private static void manageUsers() {
        boolean back = false;
        while (!back) {
            System.out.println("Gestion des Utilisateurs:");
            System.out.println("1. Ajouter un utilisateur");
            System.out.println("2. Rechercher un utilisateur");
            System.out.println("3. Mettre à jour un utilisateur");
            System.out.println("4. Supprimer un utilisateur");
            System.out.println("5. Retourner au menu principal");
            System.out.print("Choisissez une option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Logique pour ajouter un utilisateur
                    break;
                case 2:
                    // Logique pour rechercher un utilisateur
                    break;
                case 3:
                    // Logique pour mettre à jour un utilisateur
                    break;
                case 4:
                    // Logique pour supprimer un utilisateur
                    break;
                case 5:
                    back = true;
                    break;
                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
            }
        }
    }


    private static void manageMedia() {
        boolean back = false;
        while (!back) {
            System.out.println("Gestion des Médias:");
            System.out.println("1. Ajouter un média");
            System.out.println("2. Rechercher un média");
            System.out.println("3. Mettre à jour un média");
            System.out.println("4. Supprimer un média");
            System.out.println("5. Retourner au menu principal");
            System.out.print("Choisissez une option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Logique pour ajouter un média
                    break;
                case 2:
                    // Logique pour rechercher un média
                    break;
                case 3:
                    // Logique pour mettre à jour un média
                    break;
                case 4:
                    // Logique pour supprimer un média
                    break;
                case 5:
                    back = true;
                    break;
                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
            }
        }
    }

    private static void manageLoans() {
        boolean back = false;
        while (!back) {
            System.out.println("Gestion des Prêts:");
            System.out.println("1. Créer un prêt");
            System.out.println("2. Rechercher un prêt");
            System.out.println("3. Gérer le retour d'un prêt");
            System.out.println("4. Retourner au menu principal");
            System.out.print("Choisissez une option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Logique pour créer un prêt
                    break;
                case 2:
                    // Logique pour rechercher un prêt
                    break;
                case 3:
                    // Logique pour gérer le retour d'un prêt
                    break;
                case 4:
                    back = true;
                    break;
                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
            }
        }
    }

}
