package body;

public class Student {

    private int id;
    private String bDate;
    private String name;
    private boolean gender;
    public static int Max = 1;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBDate() {
        return bDate;
    }

    public void setBDate(String bDate) {
        this.birDate = bDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

}
