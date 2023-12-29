package ru.organization.fishing;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.*;

@Entity
@Table(name = "vessels")
public class Vessel {

    @Id
    @Column(nullable = false)
    private int id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "vessel")
    private List<Cruise> cruises = new ArrayList<>();

    @Column(nullable = false, length = 50)
    private String type;

    @Column(name = "displacement_kilos", nullable = false)
    private int displacementKilos;

    @Column(name = "built_in", nullable = false)
    private LocalDate builtIn;

    public Vessel(){}

    public Vessel(String name, String type, int displacementKilos, LocalDate builtIn) {
        this.name = name;
        this.type = type;
        this.displacementKilos = displacementKilos;
        this.builtIn = builtIn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Cruise> getCruises() {
        return cruises;
    }

    public void setCruises(List<Cruise> cruises) {
        this.cruises = cruises;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDisplacementKilos() {
        return displacementKilos;
    }

    public void setDisplacementKilos(int displacementKilos) {
        this.displacementKilos = displacementKilos;
    }

    public LocalDate getBuiltIn() {
        return builtIn;
    }

    public void setBuiltIn(LocalDate builtIn) {
        this.builtIn = builtIn;
    }
}
