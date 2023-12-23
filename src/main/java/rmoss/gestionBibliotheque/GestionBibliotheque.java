package rmoss.gestionBibliotheque;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rmoss.gestionBibliotheque.controller.EmpruntController;
import rmoss.gestionBibliotheque.controller.MediaController;
import rmoss.gestionBibliotheque.controller.UtilisateurController;
import rmoss.gestionBibliotheque.model.Bibliotheque;
import rmoss.gestionBibliotheque.model.Emprunt;
import rmoss.gestionBibliotheque.model.User;

import java.io.File;
import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;

public class GestionBibliotheque {
    private static final Logger logger = LoggerFactory.getLogger(GestionBibliotheque.class);

    private static final UtilisateurController userController = new UtilisateurController();
    private static final MediaController mediaController = new MediaController(new Bibliotheque());
    private static final EmpruntController empruntController = new EmpruntController(new HashSet<Emprunt>());
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        createLogDirectories();
        logger.info("Application GestionBibliotheque démarrée");

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
                    logger.trace("Option Gestion des Utilisateurs sélectionnée");
                    manageUsers();
                    break;
                case 2:
                    logger.trace("Option Gestion des Médias sélectionnée");
                    manageMedia();
                    break;
                case 3:
                    logger.trace("Option Gestion des Prêts sélectionnée");
                    manageLoans();
                    break;
                case 4:
                    logger.info("Fermeture de l'application");
                    exit = true;
                    break;
                default:
                    logger.warn("Option invalide sélectionnée: {}", choice);
                    System.out.println("Option invalide. Veuillez réessayer.");
            }
        }
        scanner.close();
    }

    private static void manageUsers() {
        logger.trace("Entrée dans la gestion des utilisateurs");

        boolean back = false;
        while (!back) {
            System.out.println("Gestion des Utilisateurs:");
            System.out.println("1. Ajouter un utilisateur");
            System.out.println("2. Rechercher un utilisateur");
            System.out.println("3. Mettre à jour un utilisateur");
            System.out.println("4. Supprimer un utilisateur");
            System.out.println("5. Lister les utilisateurs");
            System.out.println("6. Retourner au menu principal");
            System.out.print("Choisissez une option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addUser();
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
                    // logique pour lister les utilisateurs
                    System.out.print("lister");
                    listUsers();
                    break;
                case 6:
                    back = true;
                    break;
                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
            }
        }
        logger.trace("Sortie de la gestion des utilisateurs");

    }

    private static void manageMedia() {
        logger.trace("Entrée dans la gestion des médias");

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
        logger.trace("Sortie de la gestion des médias");
    }

    private static void manageLoans() {
        logger.trace("Entrée dans la gestion des prêts");

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
        logger.trace("Sortie de la gestion des prêts");

    }

    private static void addUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ajouter un nouvel utilisateur");

        System.out.print("Entrez l'ID de l'utilisateur : ");
        String id = scanner.nextLine();

        System.out.print("Entrez le nom de l'utilisateur : ");
        String name = scanner.nextLine();

        System.out.print("Entrez le prénom de l'utilisateur : ");
        String firstName = scanner.nextLine();

        // Assumption: User constructor takes id, name, and firstName
        User newUser = new User(id, name, firstName);

        // Assuming userController has a method to add a user
        userController.addUser(newUser);
        newUser.toString();


        System.out.println("Utilisateur ajouté avec succès !");
    }

    private static void listUsers() {
        Collection<User> users = userController.getAllUsers();

        if (users.isEmpty()) {
            System.out.println("Il n'y a aucun utilisateur enregistré.");
        } else {
            System.out.println("Liste des Utilisateurs:");
            for (User user : users) {
                System.out.println("ID: " + user.getId() + ", Nom: " + user.getName() + ", Prénom: " + user.getFirstName());
            }
        }
    }


    private static void createLogDirectories() {
        File logsDir = new File("logs");
        File archivedLogsDir = new File("logs/archived");

        if (!logsDir.exists()) {
            boolean createdLogsDir = logsDir.mkdir();
            if (!createdLogsDir) {
                System.err.println("Impossible de créer le dossier 'logs'");
            }
        }

        if (!archivedLogsDir.exists()) {
            boolean createdArchivedLogsDir = archivedLogsDir.mkdir();
            if (!createdArchivedLogsDir) {
                System.err.println("Impossible de créer le dossier 'logs/archived'");
            }
        }
    }
}
