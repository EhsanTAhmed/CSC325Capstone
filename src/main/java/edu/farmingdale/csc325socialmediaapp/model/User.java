package edu.farmingdale.csc325socialmediaapp.model;

import javafx.scene.image.Image;

public class User {
    private Name name;
    private String email;
    private String password;
    private LinkedListForUserInteraction social;
    private String securityQuestion;
    private String securityAnswer;
    private transient Image image;
    private boolean isAdmin;


    public User(Name name, String email, String password, LinkedListForUserInteraction social, String securityQuestion, String securityAnswer, Image image) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.social = social;
        this.securityQuestion = securityQuestion;
        this.securityAnswer = securityAnswer;
        this.image = image;
        isAdmin = false;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LinkedListForUserInteraction getSocial() {
        return social;
    }

    public void setSocial(LinkedListForUserInteraction social) {
        this.social = social;
    }

    public String getSecurityQuestion() {
        return securityQuestion;
    }

    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

    public String getSecurityAnswer() {
        return securityAnswer;
    }

    public void setSecurityAnswer(String securityAnswer) {
        this.securityAnswer = securityAnswer;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
