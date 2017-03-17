package com.teamtreehouse.model;
import java.util.Scanner;
public class Organizer implements User{
    public Organizer(){

    }
    public void printMenu(){
        System.out.println("Welcome Organizer. Your options are: ");
        System.out.println("-------------------------------- ");
        String [] menuItems = MenuStringFinals.OrganizerMenu;
        for(int i=1;i<menuItems.length+1;i++){
            System.out.println(i + ") "+ menuItems[i-1]);
        }
    }
    public void addTeam(Teams teams){
        System.out.print("Hello Organizer. ");
        MenuPrompter.addTeam(teams);
    }
    public void removeTeam(Teams teams){
        System.out.print("Hello Organizer. ");
        MenuPrompter.removeTeam(teams);
    }
    public void addPlayer(Teams teams, Player [] players){
        System.out.print("Hello Organizer. ");
        MenuPrompter.addPlayer(teams,players);

    }
    public void removePlayer(Teams teams, Player [] players){
        System.out.print("Hello Organizer. ");
        MenuPrompter.removePlayer(teams,players);

    }
    public void printTeams(Teams teams){
        System.out.println("Hello Organizer. ");
        teams.printTeamNames();

    }
    public void printTeam(Teams teams){
        System.out.println("Hello Organizer. ");
        MenuPrompter.printTeamHeight(teams);

    }

    public void printBalanceReport(Teams teams){
        System.out.println("Hello Organizer");
        teams.printOrganizerTeamBalanceReport();

    }

}