package com.learning.challenge;

public class User {

    int id;
    private String firstName, lastName;

    public User() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        builder.append(id)
                .append(": ").append(firstName)
                .append(" ").append(lastName).append(". ");

        return builder.toString();
    }
}
