package ru.organization.fishing;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "cruise_catch")
public class CruiseCatch {
    @Id
    @ManyToOne
    private Cruise cruise;

    @Id
    @Column(name = "fish_type", length = 50)
    private String fishType;

    @Column(name = "catch_weight_kilos", nullable = false)
    private int catchWeight;

    public CruiseCatch(Cruise cruise, String fishType, int catchWeight) {
        this.cruise = cruise;
        this.fishType = fishType;
        this.catchWeight = catchWeight;
    }

    public Cruise getCruise() {
        return cruise;
    }

    public void setCruise(Cruise cruise) {
        this.cruise = cruise;
    }

    public String getFishType() {
        return fishType;
    }

    public void setFishType(String fishType) {
        this.fishType = fishType;
    }

    public int getCatchWeight() {
        return catchWeight;
    }

    public void setCatchWeight(int catchWeight) {
        this.catchWeight = catchWeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CruiseCatch that = (CruiseCatch) o;
        return catchWeight == that.catchWeight && Objects.equals(cruise, that.cruise)
                && Objects.equals(fishType, that.fishType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cruise, fishType, catchWeight);
    }
}
