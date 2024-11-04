package gestionDeJugadores.DTO;

import gestionDeJugadores.FileManagment.FileManager;

import java.io.Serializable;

public class Player implements Serializable {
    FileManager fm = new FileManager();
    private int id;
    private String name;
    private String lastName;
    private int age;
    private String dNI;
    private Boolean active;

    public Player(String name, String lastName, int age, String dNI, Boolean active) {
        this.id = fm.returnLastIndex();
        fm.writeLastIndex(this.id);
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.dNI = dNI;
        this.active = active;
    }

    public Player(int id, String name, String lastName, int age, String dNI, Boolean active) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.dNI = dNI;
        this.active = active;
    }

    public Player() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getdNI() {
        return dNI;
    }

    public void setdNI(String dNI) {
        this.dNI = dNI;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }


    @Override
    public String toString() {
        return String.format("Player:\nid:%s\nname:%s\nlastName:%s\nage:%s\ndNI:%s\nactive:%s", id, name, lastName,
                age, dNI, active);
    }
}
