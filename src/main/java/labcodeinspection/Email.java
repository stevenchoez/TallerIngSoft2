package labcodeinspection;

import java.util.Locale;

public class Email {

    private transient String m_firstName;
    private transient String m_lastName;
    private transient String password;
    private transient String department;
    private transient int defaultpasswordLength = 8;
    private transient String email;

    // Método set para el first name
    public void setFirstName(String firstName) {
        this.m_firstName = firstName;
    }

    // Método set para el last name
    public void setLastName(String lastName) {
        this.m_lastName = lastName;
    }

    // Método set para el password
    public void setPassword(String password) {
        this.password = password;
    }

    // Método set para el department
    public void setDepartment(String department) {
        this.department = department;
    }

    // Método set para la longitud
    public void setDefaultpasswordLength(int passlength) {
        this.defaultpasswordLength = passlength;
    }

    // Método set para email
    public void setEmail(String email) {
        this.email = email;
    }

    // Método constructor para nombre y apellido en conjunto
    public Email(String firstName, String lastName) {
        this.m_firstName = firstName;
        this.m_lastName = lastName;
    }

    // Method to show the information
    public void showInfo() {// Method to show the information
        System.out.println("\nFIRST NAME= " + m_firstName + "\nLAST NAME= " + m_lastName);
        System.out.println("DEPARMENT= " + department + "\nEMAIL= " + email + "\nPASSWORD= " + password);
    }

    public void setDeparment(int depChoice) { // Method to choose the department
        switch (depChoice) {
            case 1:
                this.department = "sales";
                break;
            case 2:
                this.department = "dev";
                break;
            case 3:
                this.department = "acct";
                break;
            default:
                this.department = "sales"; // Valor predeterminado
                break;
        }
    }

    // Método privado para generar una contraseña aleatoria
    private String randomPassword(int length) {
        String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * set.length());
            password[i] = set.charAt(rand);
        }
        return new String(password);
    }

    public void generateEmail() {
        this.password = this.randomPassword(this.defaultpasswordLength); // Method to generate email
        this.email = this.m_firstName.toLowerCase(Locale.ROOT) + this.m_lastName.toLowerCase(Locale.ROOT) + "@" + this.department
                + ".espol.edu.ec";
    }
}
