package ru.organization.fishing;

import jakarta.persistence.*;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cruises")
public class Cruise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(nullable = false)
    private Vessel vessel;

    @OneToMany(mappedBy = "cruise")
    private List<Banka> bankas = new ArrayList<>();

    @Column(name = "begin_cruise_at", nullable = false)
    private OffsetDateTime beginCruiseAt;

    @Column(name = "end_cruise_at")
    private OffsetDateTime endCruiseTimeAt;

    @ManyToMany
    @JoinTable(name = "cruise_crew",
            joinColumns = @JoinColumn(name = "cruise_id", referencedColumnName = "id", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "crew_member_personnel_number",
                    referencedColumnName = "personnel_number", nullable = false))
    private List<Crew> crewList = new ArrayList<>();

    public Cruise(int id, Vessel vessel, OffsetDateTime beginCruiseAt) {
        this.id = id;
        this.vessel = vessel;
        this.beginCruiseAt = beginCruiseAt;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vessel getVessel() {
        return vessel;
    }

    public void setVessel(Vessel vessel) {
        this.vessel = vessel;
    }

    public List<Banka> getBankas() {
        return bankas;
    }

    public void setBankas(List<Banka> bankas) {
        this.bankas = bankas;
    }

    public OffsetDateTime getBeginCruiseAt() {
        return beginCruiseAt;
    }

    public void setBeginCruiseAt(OffsetDateTime beginCruiseAt) {
        this.beginCruiseAt = beginCruiseAt;
    }

    public OffsetDateTime getEndCruiseTimeAt() {
        return endCruiseTimeAt;
    }

    public void setEndCruiseTimeAt(OffsetDateTime endCruiseTimeAt) {
        this.endCruiseTimeAt = endCruiseTimeAt;
    }

    public List<Crew> getCrewList() {
        return crewList;
    }

    public void setCrewList(List<Crew> crewList) {
        this.crewList = crewList;
    }

}
