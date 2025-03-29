package edu.farmingdale.csc325socialmediaapp.model;

public enum SecurityQuestion {
    MOTHER_MAIDEN_NAME("What is your mothers maiden name?"),
    FIRST_PET_NAME("What is your first pets name?"),
    CITY_OF_BIRTH("What city were you born in?"),
    FAVORITE_BOOK("What is your favorite book?");

    private final String question;

    SecurityQuestion(String question){
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }
}
