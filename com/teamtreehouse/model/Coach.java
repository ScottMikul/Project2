package com.teamtreehouse.model;
public class Coach implements User{
    public Coach(){

    }
    public void printMenu(){
        System.out.println("Welcome Coach. Your options are: ");
        System.out.println("-------------------------------- ");
        System.out.println("1)Print teams ");
        System.out.println("2)Print a team roster ");
        System.out.println("8)Change user");
        System.out.println("9)Exit");

    }
    public void addTeam(Teams teams){

    }
    public void addPlayer(Teams teams, Player[] players){

    }
    public void removeTeam(Teams teams){

    }
    public void removePlayer(Teams teams, Player[] players){

    }
    public void printTeam(Teams teams){
        System.out.println("Hello coach. ");
        MenuPrompter.printTeam(teams);

    }
    public void printTeams(Teams teams){
        System.out.println("Hello coach. ");
        MenuPrompter.printTeams(teams);

    }

    public void printBalanceReport(Teams teams){

    }

}