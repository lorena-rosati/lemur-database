package lemurdatabase;

import java.util.Scanner;

public class LemurDatabase {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("How many lemurs would you like to create?");
        
        Lemur [] lemurs = new Lemur[in.nextInt()];
        
        for (int i = 0; i < lemurs.length; i++) {
            
            System.out.println("Please enter the type of lemur to add");
            System.out.println("1 - Tree Lemur");
            System.out.println("2 - Desert Lemur");
            System.out.println("3 - Jungle Lemur");
            
            int input = in.nextInt();

            if (input == 1) {
                
                lemurs[i] = new TreeLemur(chooseAge(), chooseWeight(), chooseGender());
                
            } else if (input == 2) {
                
                lemurs[i] = new DesertLemur(chooseAge(), chooseWeight(), chooseGender());
                
            } else if (input == 3) {
                
                lemurs[i] = new JungleLemur(chooseAge(), chooseWeight(), chooseGender());
                
            }
            
        }
        
        System.out.println("Printing the lemur's info...");
        for (int i = 0; i < lemurs.length; i++) {
            System.out.println(lemurs[i].toString());
        }
        
    }
    
    public static String chooseGender() {
        int random = (int)(Math.random()*2+1);
        if (random == 1) {
            return "male";
        } else {
            return "female";
        }
    }
    
    public static int chooseAge() {
        int random = (int)(Math.random()*20+1);
        return random;
    }
    
    public static int chooseWeight() {
        int random = (int)(Math.random()*5+1);
        return random;
    }
    
    
}
