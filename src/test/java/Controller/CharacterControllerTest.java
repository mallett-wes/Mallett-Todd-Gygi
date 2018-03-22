/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Exceptions.CharacterControllerException;
import java.util.Random;
import model.Pace;
import model.Character;
import model.Team;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wesmallett
 */
public class CharacterControllerTest {
    
    public CharacterControllerTest() {
    }
    
CharacterController controller;

    @Before
    public void setup(){
        controller = new CharacterController();
    }
    
    @Test
    public void testCalculateTeamHealthAverage_ValidValues(){
        Team team = new Team();
        team.setPace(Pace.AVERAGE);
        team.addCharacterToTeam(createCharacter(3));
        team.addCharacterToTeam(createCharacter(8));
        team.addCharacterToTeam(createCharacter(8));
        team.addCharacterToTeam(createCharacter(8));
        
        int lastNourishment = 2;
        double expectedResult = 6.0;
        
        double result = controller.calculateTeamAverageHealth(team, lastNourishment);
        
        assertEquals(expectedResult, result, .0);
    }
    
    @Test
    public void testCalculateTeamHealthAverage_ZeroStamina(){
        Team team = new Team();
        team.setPace(Pace.AVERAGE);
        team.addCharacterToTeam(createCharacter(3));
        team.addCharacterToTeam(createCharacter(0));
        team.addCharacterToTeam(createCharacter(0));
        team.addCharacterToTeam(createCharacter(0));
        
        int lastNourishment = 2;
        String expectedResult = "health could not be calculated";
        String result = null;
        
        try{
            controller.calculateTeamAverageHealth(team, lastNourishment);
        }catch(CharacterControllerException e){
            result = e.getMessage();
        }
        
        assertTrue(result.contains(expectedResult));
    }
    
     @Test
    public void testCalculateTeamHealthAverage_OneCharacterTeam(){
        Team team = new Team();
        team.setPace(Pace.AVERAGE);
        team.addCharacterToTeam(createCharacter(3));
        
        int lastNourishment = 2;
        double expectedResult = 3;
        
        double result = controller.calculateTeamAverageHealth(team, lastNourishment);
        
        assertEquals(expectedResult, result, .0);
    }
    
    @Test
    public void testCalculateTeamHealthAverage_TeamNoMembers(){
        Team team = new Team();
        
        int lastNourishment = 2;
        String expectedResult = "Team must have at least one member on it.";
        String result = null;
        
        try{
            controller.calculateTeamAverageHealth(team, lastNourishment);
        }catch(CharacterControllerException e){
            result = e.getMessage();
        }
        
        assertEquals(expectedResult, result);
    }


    @Test
    public void testCalculateHealth_AllGoodValues() {
        System.out.println("calculateHealth");
        Pace pace = Pace.AVERAGE;
        int lastNourishment = 1;
        int characterStamina = 5;
        int expectedResult = 10;
        int result = 0;

        try{
            result = controller.calculateIndividualCharacterHealth(pace, lastNourishment, characterStamina);
        }catch(Exception e){
            assertFalse(e.getMessage().toString(), true);
        }

        assertEquals(expectedResult, result);
    }

    @Test
    public void testCalculateHealth_NullPace() {
        System.out.println("calculateHealth");
        Pace pace = null;
        int lastNourishment = 1;
        int characterStamina = 5;
        String expectedResult = "You must pass in a valid pace.";
        double result = 0;

        try{
            result = controller.calculateIndividualCharacterHealth(pace, lastNourishment, characterStamina);
        }catch(Exception e){
            assertEquals(expectedResult, e.getMessage());
        }


    }

    @Test
    public void testCalculateHealth_NoCharacterStamina() {
        System.out.println("calculateHealth");
        Pace pace = Pace.FAST;
        int lastNourishment = 1;
        int characterStamina = 0;
        String expectedResult = "Character Stamina must be greater than 0.";
        int result = 0;

        try{
            result = controller.calculateIndividualCharacterHealth(pace, lastNourishment, characterStamina);
        }catch(Exception e){
            assertEquals(expectedResult, e.getMessage());
        }
    }

    @Test
    public void testCalculateHealth_LastNourishmentNegative() {
        System.out.println("calculateHealth");
        Pace pace = Pace.AVERAGE;
        int lastNourishment = -1;
        int characterStamina = 5;
        int expectedResult = 10;
        int result = 0;

        try{
            result = controller.calculateIndividualCharacterHealth(pace, lastNourishment, characterStamina);
        }catch(Exception e){
            assertFalse(e.getMessage().toString(), true);
        }

        assertEquals(expectedResult, result);
    }

    @Test
    public void testCalculateHealth_LowStamina() {
        System.out.println("calculateHealth");
        Pace pace = Pace.AVERAGE;
        int lastNourishment = 1;
        int characterStamina = 1;
        int expectedResult = 2;
        int result = 0;

        try{
            result = controller.calculateIndividualCharacterHealth(pace, lastNourishment, characterStamina);
        }catch(Exception e){
            assertFalse(e.getMessage().toString(), true);
        }

        assertEquals(expectedResult, result);
    }

    @Test
    public void testCalculateHealth_FastPace() {
        System.out.println("calculateHealth");
        Pace pace = Pace.FAST;
        int lastNourishment = 2;
        int characterStamina = 3;
        int expectedResult = 1;
        int result = 0;

        try{
            result = controller.calculateIndividualCharacterHealth(pace, lastNourishment, characterStamina);
        }catch(Exception e){
            assertFalse(e.getMessage().toString(), true);
        }

        assertEquals(expectedResult, result);
    }
    
    private Character createCharacter(int stamina){
        Character character = new Character();
        Random random = new Random();
        character.setName("TEST" + random.nextInt(10));
        character.setStamina(stamina);
        return character;
    }
    
}
