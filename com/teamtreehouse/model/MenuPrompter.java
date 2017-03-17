package com.teamtreehouse.model;
import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;
public class MenuPrompter{
    private static Scanner scanner = new Scanner(System.in);
    public MenuPrompter(){

    }
    //1
    public static void printTeams(Teams teams){
        System.out.println("Here are the following team names:");
        teams.printTeamNames();

    }

    //2
    public static void printTeam( Teams teams){
        System.out.println("Which team roster would you like to print?");
        teams.printTeamNames();
        String teamName = scanner.next();
        System.out.println("Printing "+teamName+":");
        Team team = teams.getTeam(teamName);
        System.out.println(team);

    }
    public static void printTeamHeight( Teams teams){
        System.out.println("Which team roster would you like to print?");
        teams.printTeamNames();
        String teamName = scanner.next();
        System.out.println("Printing "+teamName+":");
        Team team = teams.getTeam(teamName);
        System.out.println(team.firstLastHeight());

    }
    //3
    public static void addTeam(Teams teams){
        System.out.println("What is the name of the team you would like to add?");
        String teamName = scanner.next();
        System.out.println("What is the name of the coach for this team?");
        String coachName = scanner.next();
        teams.addTeam(new Team(teamName, coachName));
    }
    //4
    public static void removeTeam(Teams teams){
        System.out.println("Which team would you like to remove?");
        teams.printTeamNames();
        String teamName = scanner.next();
        teams.removeTeam(teamName);
    }

    //5
    public static void addPlayer(Teams teams, Player [] players){
        if(teams.getTeams().size()!=0){
            System.out.println("Which team would you like to add a player to?");
            teams.printTeamNames();
            String teamName = scanner.next();
            Team team = teams.getTeam(teamName);
            System.out.println("Which player you would like to add?");
            int counter = 1;
            for(Player player: players){
                System.out.println(counter + ") "+ player.firstLast());
                counter++;
            }
            int selection = scanner.nextInt();
            team.addPlayer(players[selection-1]);
        }
        else{
            System.out.println("There must be a team to add players to!");
        }





    }
    //6
    public static void removePlayer(Teams teams, Player [] players) {
        if (teams.getTeams().size() != 0) {
            System.out.println("Which team would you like to remove a player from?");
            teams.printTeamNames();
            String teamName = scanner.next();
            Team team = teams.getTeam(teamName);
            System.out.println("Which player you would like to remove?");
            System.out.println(team);
            int selection = scanner.nextInt();
            team.removePlayerByIndex(selection);
        } else {
            System.out.println("There must be a team to add players to!");
        }
    }
    //Start and 6
    public User askForUser(){
        System.out.println("Are you an admin, an organizer, or a coach?");
        String input = scanner.next();
        if(input.equalsIgnoreCase("coach")){
            return new Coach();
        }
        if(input.equalsIgnoreCase("organizer")){
            return new Organizer();
        }
        if(input.equalsIgnoreCase("admin")){
            return new Admin();
        }
        return null;
    }
}