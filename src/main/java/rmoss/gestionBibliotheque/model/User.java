package rmoss.gestionBibliotheque.model;


import java.util.Objects;

public class User {
    private String id;
    private String name;
    private String firstName;

    private String email;
    private String phoneNumber;

    public User(String id, String name, String firstName, String email, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.firstName = firstName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public User(String id, String name, String firstName) {
        this.id = id;
        this.name = name;
        this.firstName = firstName;
    }

    /**
     * get User's email
     *
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * set user's email
     *
     * @param email
     */

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(name, user.name) && Objects.equals(firstName, user.firstName) && Objects.equals(email, user.email) && Objects.equals(phoneNumber, user.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, firstName, email, phoneNumber);
    }
}
