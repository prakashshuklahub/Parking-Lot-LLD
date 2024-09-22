package models;

public class User {

    private String name;
    private int aadharId;

    public User(int aadharId, String name) {
        this.aadharId = aadharId;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAadharId() {
        return aadharId;
    }

    public void setAadharId(int aadharId) {
        this.aadharId = aadharId;
    }
}
