package edu.farmingdale.csc325socialmediaapp.model;

public class Name {
    private String fName;
    private String lName;

    public Name(String fName) {
        this.fName = fName;
    }
    public String getfName() {
        return fName;
    }
    public void setfName(String fName) {
        this.fName = fName;
    }
    public String getlName() {
        return lName;
    }
    public void setlName(String lName) {
        this.lName = lName;
    }
}
