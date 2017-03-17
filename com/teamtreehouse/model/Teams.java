package com.teamtreehouse.model;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
public class Teams{
    private Map<String, Team> mTeams;
    private Set<Player> playersOnTeam;
    public Teams(){
        mTeams = new TreeMap<String,Team>();
    }
    public Teams(Team [] teams){
        mTeams = new TreeMap<String,Team>();
        for(Team team : teams){
            addTeam(team);
        }
    }
    public void addTeam(Team team){
        mTeams.put(team.getName(), team);
    }
    public void removeTeam(String teamName){
        mTeams.remove(teamName);
    }
    public Team getTeam(String teamName){
        return mTeams.get(teamName);
    }
    public Map<String,Team> getTeams(){
        return mTeams;
    }
    public void printTeamNames(){
        for (Map.Entry<String, Team> entry : mTeams.entrySet()) {
            System.out.println(entry.getKey());
        }

    }
    public void printOrganizerTeamBalanceReport(){
        for (Map.Entry<String, Team> entry : mTeams.entrySet()) {
            System.out.println("Team:"+entry.getKey()+" Experienced: "+ entry.getValue().getExperienced()+ " Inexperienced: "+
                    entry.getValue().getInexperienced());
        }
    }

    public void printTeamsWithHeightAverages(){
        for (Map.Entry<String, Team> entry : mTeams.entrySet()) {
            Double heightAverage = entry.getValue().getExperienced() / ((entry.getValue().getExperienced()+ entry.getValue().getInexperienced())*1.0);
            System.out.println("Team: "+entry.getKey()+" Average Experience: "+ heightAverage);
        }
    }

    public void printAdminBalanceReport(){

        for (Map.Entry<String, Team> entry : mTeams.entrySet()) {

            System.out.println("Team "+entry.getKey()+" | "+entry.getValue().printHeights());
        }



    }
}