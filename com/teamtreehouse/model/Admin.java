package com.teamtreehouse.model;
import java.util.Scanner;
public class Admin implements User{
    private Scanner scanner;
    public Admin(){
        scanner = new Scanner(System.in);
    }
    public void printMenu(){
        System.out.println("Welcome Admin. Your options are: ");
        System.out.println("-------------------------------- ");
        String [] menuItems = MenuStringFinals.AdminMenu;
        for(int i=1;i<menuItems.length+1;i++){
            System.out.println(i + ") "+ menuItems[i-1]);
        }
    }
    public void addTeam(Teams teams){
        System.out.print("Hello Admin. ");
        MenuPrompter.addTeam(teams);
    }
    public void removeTeam(Teams teams){
        System.out.print("Hello Admin. ");
        MenuPrompter.removeTeam(teams);
    }
    public void addPlayer(Teams teams, Player [] players){
        System.out.print("Hello Admin. ");
        MenuPrompter.addPlayer(teams,players);

    }
    public void removePlayer(Teams teams, Player [] players){
        System.out.print("Hello Admin. ");
        MenuPrompter.removePlayer(teams,players);

    }
    public void printTeams(Teams teams){
        System.out.println("Hello Admin. ");
        teams.printTeamsWithHeightAverages();

    }
    public void printTeam(Teams teams){
        System.out.println("Hello Admin. ");
        MenuPrompter.printTeam(teams);

    }

    public void printBalanceReport(Teams teams){
        System.out.println("Hello Admin. ");
        teams.printAdminBalanceReport();
    }

}