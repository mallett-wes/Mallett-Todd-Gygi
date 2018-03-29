/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;
import app.Main;
import java.io.PrintWriter;
/**
 *
 * @author Kyrie Gygi
 */
public class ErrorView {
    private static PrintWriter console = Main.getOutFile();
    private static PrintWriter log = Main.getLogFile();
    
    public static void display(String className, String errorMessage){
        
        console.println(
        "\n ---Error -----------------------------------------"
                + "\n" + errorMessage
         + "\n -----------------------------------------------------------"
        );
        log.printf("%n%n%s", className + " - " + errorMessage);
    }
}
