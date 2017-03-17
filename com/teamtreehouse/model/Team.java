package com.teamtreehouse.model;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
public class Team{
    private final static int MAX_SIZE = 11;
    private String mTeamName;
    private String mCoach;
    private Set<Player> mRoster;
    private int mExperiencedPlayers;
    private int mInexperiencedPlayers;
    private Map<Integer, Integer> heightCount;
    public Team(String teamName, String Coach){
        mTeamName= teamName;
        mCoach = Coach;
        mRoster = new HashSet<Player>();
        mExperiencedPlayers = 0;
        mInexperiencedPlayers =0;
        heightCount = new TreeMap<>();
    }
    public Team(String teamName, String Coach, Player[] players){
        mTeamName= teamName;
        mCoach = Coach;
        mExperiencedPlayers = 0;
        mInexperiencedPlayers =0;
        mRoster = new HashSet<Player>();
        heightCount = new TreeMap<>();
        for(Player player: players){
            addPlayer(player);
        }
    }

    public void addPlayer(Player player){
        if(mRoster.size()==11){
            System.out.println("Sorry but you can not add any more players to this team.");
        }
        else {
            if(mRoster.add(player)){
                if(player.isExperienced()){
                    mExperiencedPlayers++;
                }
                else{
                    mInexperiencedPlayers++;
                }
                int heightKey = player.getHeightInInches();
                int count = heightCount.containsKey(heightKey) ? heightCount.get(heightKey) : 0;
                heightCount.put(heightKey, count + 1);
            }
        }
    }
    public void removePlayer(Player player){
        if(mRoster.remove(player)){
            if(player.isExperienced()){
                mExperiencedPlayers--;
            }
            else{
                mInexperiencedPlayers--;
            }
            int heightKey = player.getHeightInInches();
            int count = heightCount.get(heightKey);
            if(count==1){
                heightCount.remove(heightKey);
            }
            else{
                heightCount.put(heightKey, count - 1);
            }
        }
    }

    public void removePlayerByIndex(int index){
        Object[] players = mRoster.toArray();
        removePlayer((Player)players[index-1]);
    }
    public String getName(){
        return mTeamName;
    }
    public Set<Player> getRoster(){
        return mRoster;

    }
    public int getExperienced(){
        return mExperiencedPlayers;
    }
    public int getInexperienced(){
        return mInexperiencedPlayers;
    }
    public String toString(){
        String result ="";
        int counter = 1;
        for(Player player : mRoster){
            result += counter + ") " + player.firstLast()+ "\n";
            counter++;
        }
        return result;
    }
    public String firstLastHeight(){
        String result ="";
        int counter = 1;
        for(Player player : mRoster){
            result += counter + ") " + player.firstLast()+ " - Height: " + player.getHeightInInches() + " inches\n";
            counter++;
        }
        return result;
    }
    public String printHeights(){
        String result = "";
        for (Map.Entry<Integer, Integer> height : heightCount.entrySet()) {

            result += height.getKey()+"in: "+ height.getValue()+"  ";
        }

        return result;

    }


}