package model;

public class User extends AbsModel {
    private String firstName;
    private String lastName;
    private String passportSeria;
    private String passportNumber;
    private String phoneNumber;
    private String password;

    public User(int id, String firstName, String lastName, String passportSeria, String passportNumber,
            String phoneNumber, String password) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportSeria = passportSeria;
        this.passportNumber = passportNumber;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassportSeria() {
        return passportSeria;
    }

    public void setPassportSeria(String passportSeria) {
        this.passportSeria = passportSeria;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
