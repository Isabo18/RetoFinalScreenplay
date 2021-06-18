package us.opencart.abstracta.models;

public class Data {
    private String userName;
    private String lastName;
    private String email;
    private String telephone;
    private String password;

    public Data(String userName,String lastName, String email,String telephone, String password){
        this.userName = userName;
        this.lastName=lastName;
        this.email = email;
        this.telephone = telephone;
        this.password = password;
    }
    public String getUserName() {
        return userName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
    public String getTelephone() {
        return telephone;
    }
    public String getPassword() {
        return password;
    }
}
