package view;

import controller.TeamController;
import model.Pace;
import model.Team;

import java.io.InputStreamReader;
import java.util.Scanner;

public class TeamView {
    Scanner scanner = new Scanner(new InputStreamReader(System.in));

    public String nameTeam(){
        System.out.println("What would you like to name your team?");
        return scanner.nextLine();
    }

    public Pace setPace(){
        System.out.println("What pace would you like to move at?");
        System.out.println("1. Slow");
        System.out.println("2. Average");
        System.out.println("3. Fast");

        int input = scanner.nextInt();

        Pace pace = null;

        switch(input){
            case 1:
                pace = Pace.SLOW;
                break;
            case 2:
                pace = Pace.AVERAGE;
                break;
            case 3:
                pace = Pace.FAST;
                break;
        }

        return pace;
    }

    public void selectTeamMembers(){
        System.out.println("Please select a team member from below: ");
    }
}
