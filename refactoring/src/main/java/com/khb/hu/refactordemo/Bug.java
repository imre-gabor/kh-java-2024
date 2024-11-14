package com.khb.hu.refactordemo;
import java.util.Objects;

public class Bug {
    private long id;
    private String description;
    private BugLevel bugRating = BugLevel.NEW;

    public Bug(long id, String desc) {
        setId(id);
        setDescription(desc);
    }

    public Bug(long id, String desc, BugLevel bugRating) {
        this(id, desc);
        this.bugRating = bugRating;
    }

    @Override
    public String toString() {
        return "Bug{" + "id=" + id + ", description='" + description + '\'' + '}';
    }

    public BugLevel getBugLevel() {
        return bugRating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bug Bug = (Bug) o;
        return id == Bug.id && Objects.equals(description, Bug.description);
    }
}
