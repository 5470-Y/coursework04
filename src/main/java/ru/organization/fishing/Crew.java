package ru.organization.fishing;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Crew {

    /* Предполагается, что в случае изменения должности/ФИО у сотрудника,
    * в БД добавляется новая запись с новым ключом id.
    * Старая запись остаётся неизменной для корректной выдачи исторических данных */
    @Id
    @Column(name = "personnel_number", nullable = false)
    private int personnelNumber;

    @Column(name = "second_name", nullable = false)
    private String secondName;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "surname")
    private String surname;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "position", nullable = false, length = 30)
    private CrewMemberPositions crewMemberPosition;

    @Column(name = "address")
    private String crewMemberAddress;

    @ManyToMany
    @JoinTable(name = "cruise_crew",
            joinColumns = @JoinColumn(name = "crew_member_personnel_number", referencedColumnName = "personnel_number", nullable = false),
            inverseJoinColumns =  @JoinColumn(name = "cruise_id", referencedColumnName = "id", nullable = false))
    private List<Cruise> cruises = new ArrayList<>();

    public Crew(int personnelNumber, String secondName, String firstName, CrewMemberPositions crewMemberPosition) {
        this.personnelNumber = personnelNumber;
        this.secondName = secondName;
        this.firstName = firstName;
        this.crewMemberPosition = crewMemberPosition;
    }

    public Crew(int personnelNumber, String secondName, String firstName, String surname, CrewMemberPositions crewMemberPosition) {
        this.personnelNumber = personnelNumber;
        this.secondName = secondName;
        this.firstName = firstName;
        this.surname = surname;
        this.crewMemberPosition = crewMemberPosition;
    }

    public Crew(int personnelNumber, String secondName, String firstName, String surname, CrewMemberPositions crewMemberPosition, String crewMemberAddress) {
        this.personnelNumber = personnelNumber;
        this.secondName = secondName;
        this.firstName = firstName;
        this.surname = surname;
        this.crewMemberPosition = crewMemberPosition;
        this.crewMemberAddress = crewMemberAddress;
    }

    public int getPersonnelNumber() {
        return personnelNumber;
    }

    public void setPersonnelNumber(int personnelNumber) {
        this.personnelNumber = personnelNumber;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public CrewMemberPositions getCrewMemberPosition() {
        return crewMemberPosition;
    }

    public void setCrewMemberPosition(CrewMemberPositions crewMemberPosition) {
        this.crewMemberPosition = crewMemberPosition;
    }

    public String getCrewMemberAddress() {
        return crewMemberAddress;
    }

    public void setCrewMemberAddress(String crewMemberAddress) {
        this.crewMemberAddress = crewMemberAddress;
    }

    public List<Cruise> getCruises() {
        return cruises;
    }

    public void setCruises(List<Cruise> cruises) {
        this.cruises = cruises;
    }
}
