///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Views;
//
//import java.util.Random;
//
///**
// *
// * @author hiramtodd
// */
//public class HuntingSceneView extends HuntingView {
//    
//    public HuntingSceneView() {
//        super(displayHunt());
//    }
//    private static String displayHunt() {
//        String message = "Select 'P' for animal probiblity\n" 
//            + "Select 'R' to hunt Rabbits\n"
//            + "'D' to hunt Deer" 
//            + "'B' to hunt Bison" 
//            + "Select 'Q' to Quit Hunting Menu"
//            + "Please make a selection";
//        
//        return message;
//    }
//    
//    @Override
//    public boolean doAction(String input) {
//        
//        switch(input) {
//            case "P": //to see probability of catching animal
//                this.huntProbability();
//                break;
//                
//            case "R": //to hunt for rabbits
//                this.huntForRabbit();
//                break;
//                
//           case "D": //to hunt for deer
//                this.huntForDeer();
//                break;
//                
//            case "B": //to hunt for bison
//                this.huntForBison();
//                break;
//                
//            default:
//                System.out.println("Ivalid choice!");
//                break;
//        }
//        return false;
//    }
//    
//    private void huntProbability() {
//        System.out.println("Each animal yeilds a different challenge to hunt\n"
//        + "and amount of meat. \n"
//        + "Rabbit\n"
//        + "\t-80% chance with 4lbs. of meat.\n"
//        + "Deer\n"
//        + "\t-60% chance with 65lbs. of meat.\n"
//        + "Bison\n"
//        + "\t-45% chance with 300lbs. of meat.\n");
//    }
//    
//    private void huntForRabbit() {
//        Random random = new Random();
//            int chance = random.nextInt(100);
//            
//            if(chance < 80) {
//                System.out.println("You have caught a 4lb. rabbit!");
//            } else {
//                System.out.println("Ooh! You just missed the rabbit! How about another try?");
//            }
//    }
//    
//    private void huntForDeer() {
//        Random random = new Random();
//            int chance = random.nextInt(100);
//            
//            if(chance < 60) {
//                System.out.println("You have caught a 50lb. deer!");
//            } else {
//                System.out.println("Aah! You just missed the deer! How about another try?");
//            }
//    }
//    
//    private void huntForBison() {
//        Random random = new Random();
//            int chance = random.nextInt(100);
//            
//            if(chance < 45) {
//                System.out.println("You have caught a 300lb.  Bison!");
//            } else {
//                System.out.println("Yikes! You just missed the bison! How about another try?");
//            }
//    }
//}
