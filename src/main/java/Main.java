package app;

import Views.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import model.Game;
import model.Character;

public class Main {
    private static Character character = null;
    private static Game game = null;
    private static BufferedReader inFile = null;
    private static PrintWriter outFile = null;
    private static PrintWriter logFile = null;

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        Main.logFile = logFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        Main.inFile = inFile;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        Main.outFile = outFile;
    }
    
    public static void main(String... args){
        try{
            inFile = new BufferedReader(new InputStreamReader(System.in));
            outFile = new PrintWriter(System.out, true);
            logFile = new PrintWriter("logFile.txt");
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.display(); 
            return;
            
        }catch(Exception e){
            System.out.println("There was an error starting the program. " + e.getMessage());
        }finally{
            try{
                if(inFile != null){
                 inFile.close();   
                }
                
                if(outFile != null){
                 outFile.close();   
                }
                
                if (logFile !=null){
                    logFile.close();
                }
                
            }catch(IOException e){
                System.out.println("Error closing files");
            }
            
        }      
    }

    public static Character getCharacter() {
        return character;
    }

    public static void setCharacter(Character character) {
        Main.character = character;
    }

    public static Game getGame() {
        return game;
    }

    public static void setGame(Game game) {
        Main.game = game;
    }
    
    
}
