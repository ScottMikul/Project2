package com.teamtreehouse.model;
public interface User {
    public void printMenu();
    public void addTeam(Teams teams);
    public void removeTeam(Teams teams);
    public void addPlayer(Teams teams, Player[] players);
    public void removePlayer(Teams teams, Player[] players);
    public void printTeam(Teams teams);
    public void printTeams(Teams teams);
    public void printBalanceReport(Teams teams);
}