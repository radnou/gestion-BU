package rmoss.gestionBibliotheque.controller;

import rmoss.gestionBibliotheque.model.User;

import java.util.ArrayList;
import java.util.List;

public class UtilisateurController {

    private final List<User> users = new ArrayList<User>();

    public void addUser(User user) {
        users.add(user);
    }

    public String listUser() {
        String usersStream = "";
        users.stream()
                .forEach(user -> user.toString().concat(usersStream));

        return usersStream;
    }

    public List<User> getAllUsers() {

        return users;
    }
}
