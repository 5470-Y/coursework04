package ru.organization.fishing;

import jakarta.persistence.*;

import java.time.OffsetDateTime;
import java.util.Objects;

@Entity
@Table(name = "bankas")
public class Banka {

    @Id
    @ManyToOne
    private Cruise cruise;

    @Id
    @Column(name = "banka_name", nullable = false, length = 50)
    private String bankaName;

    @Id
    @Column(name = "start_banka_visit", nullable = false)
    private OffsetDateTime startBankaVisit;

    @Column(name = "end_banka_visit")
    private OffsetDateTime endBankaVisit;



    @Enumerated(value = EnumType.STRING)
    @Column(name = "fish_quality", length = 14)
    private FishQuality fishQuality;

    public Banka(Cruise cruise, String bankaName, OffsetDateTime startBankaVisit) {
        this.cruise = cruise;
        this.bankaName = bankaName;
        this.startBankaVisit = startBankaVisit;
    }

    public Banka(Cruise cruise, String bankaName, OffsetDateTime startBankaVisit,
                 OffsetDateTime endBankaVisit, FishQuality fishQuality) {
        this.cruise = cruise;
        this.bankaName = bankaName;
        this.startBankaVisit = startBankaVisit;
        this.endBankaVisit = endBankaVisit;
        this.fishQuality = fishQuality;
    }

    public Cruise getCruise() {
        return cruise;
    }

    public void setCruise(Cruise cruise) {
        this.cruise = cruise;
    }

    public String getBankaName() {
        return bankaName;
    }

    public void setBankaName(String bankaName) {
        this.bankaName = bankaName;
    }

    public OffsetDateTime getStartBankaVisit() {
        return startBankaVisit;
    }

    public void setStartBankaVisit(OffsetDateTime startBankaVisit) {
        this.startBankaVisit = startBankaVisit;
    }

    public OffsetDateTime getEndBankaVisit() {
        return endBankaVisit;
    }

    public void setEndBankaVisit(OffsetDateTime endBankaVisit) {
        this.endBankaVisit = endBankaVisit;
    }

    public FishQuality getFishQuality() {
        return fishQuality;
    }

    public void setFishQuality(FishQuality fishQuality) {
        this.fishQuality = fishQuality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Banka banka = (Banka) o;
        return Objects.equals(cruise, banka.cruise)
                && Objects.equals(bankaName, banka.bankaName)
                && Objects.equals(startBankaVisit, banka.startBankaVisit)
                && Objects.equals(endBankaVisit, banka.endBankaVisit)
                && fishQuality == banka.fishQuality;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cruise, bankaName, startBankaVisit, endBankaVisit, fishQuality);
    }
}
