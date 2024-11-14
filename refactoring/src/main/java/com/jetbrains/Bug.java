package com.jetbrains;
import java.util.Objects;

public class Bug {
    private long id;
    private String desc;
    private BugLevel bugRating = BugLevel.NEW;

    public Bug(long id, String desc) {
        setId(id);
        setDesc(desc);
    }

    public Bug(long id, String desc, BugLevel bugRating) {
        this(id, desc);
        this.bugRating = bugRating;
    }

    @Override
    public String toString() {
        return "Bug{" + "id=" + id + ", description='" + desc + '\'' + '}';
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, desc);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bug Bug = (Bug) o;
        return id == Bug.id && Objects.equals(desc, Bug.desc);
    }
}
