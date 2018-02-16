import controller.CharacterController;
import model.Character;
import org.junit.Before;
import org.junit.Test;
import model.Pace;
import view.CharacterView;

import static org.junit.Assert.*;

public class CharacterControllerTests {

    CharacterController controller;

    @Before
    public void setup(){
        controller = new CharacterController(new Character(), new CharacterView());
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
            result = controller.calculateHealth(pace, lastNourishment, characterStamina);
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
            result = controller.calculateHealth(pace, lastNourishment, characterStamina);
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
            result = controller.calculateHealth(pace, lastNourishment, characterStamina);
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
            result = controller.calculateHealth(pace, lastNourishment, characterStamina);
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
            result = controller.calculateHealth(pace, lastNourishment, characterStamina);
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
            result = controller.calculateHealth(pace, lastNourishment, characterStamina);
        }catch(Exception e){
            assertFalse(e.getMessage().toString(), true);
        }

        assertEquals(expectedResult, result);
    }
}
