import com.teamtreehouse.model.*;
import java.util.Scanner;

public class LeagueManager {

  public static void main(String[] args) {
      Player[] players = Players.load();
      User user;
      MenuPrompter prompter = new MenuPrompter();
      Scanner scanner = new Scanner(System.in);
      user = prompter.askForUser();
      int option;
      Teams teams = LeagueManager.getTeams(players);
      do {
          user.printMenu();
          option = scanner.nextInt();
          switch (option) {
              case 1:
                  user.printTeams(teams);
                  break;
              case 2:
                  user.printTeam(teams);
                  break;
              case 3:
                  user.printBalanceReport(teams);
                  break;
              case 4:
                  user.addTeam(teams);
                  break;
              case 5:
                  user.removeTeam(teams);
                  break;
              case 6:
                  user.addPlayer(teams, players);
                  break;
              case 7:
                  user.removePlayer(teams, players);
                  break;
              case 8:
                  user = prompter.askForUser();
                  break;

          }
      }
      while (option != 9);


  }
  private static Teams getTeams(Player [] players){
      Player [] blueplayers = {players[1],players[2],players[3],players[4]};
      Team blue = new Team("blue","bob", blueplayers);
      Player [] redplayers = {players[5],players[6],players[7],players[8]};
      Team red = new Team("red", "pete", redplayers);
      Team [] teamArray = {blue,red};
      Teams teams = new Teams(teamArray);
      return teams;
  }

}
