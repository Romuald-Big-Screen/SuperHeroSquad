package com.SuperHeroSquad.SuperHeroSquad.model;

import java.util.List;

public class Data {


    private List <Formed> formeds;
    private List <HomeTown> homeTowns;
    private List <Members> members;
    private List <SecretBase> secretBases;
    private List <SquadName> squadNames;

    public List<Formed> getFormeds() {
        return formeds;
    }

    public void setFormeds(List<Formed> formeds) {
        this.formeds = formeds;
    }

    public List<HomeTown> getHomeTowns() {
        return homeTowns;
    }

    public void setHomeTowns(List<HomeTown> homeTowns) {
        this.homeTowns = homeTowns;
    }

    public List<Members> getMembers() {
        return members;
    }

    public void setMembers(List<Members> members) {
        this.members = members;
    }

    public List<SecretBase> getSecretBases() {
        return secretBases;
    }

    public void setSecretBases(List<SecretBase> secretBases) {
        this.secretBases = secretBases;
    }

    public List<SquadName> getSquadNames() {
        return squadNames;
    }

    public void setSquadNames(List<SquadName> squadNames) {
        this.squadNames = squadNames;
    }
}
