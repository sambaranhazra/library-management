package org.sambaran.library.model;

public class BookAdded {
    private final String identifier;
    private int id;

    public BookAdded(int id, String identifier) {
        this.id = id;
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    public int getId() {
        return id;
    }
}
