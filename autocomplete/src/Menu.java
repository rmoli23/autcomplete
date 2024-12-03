import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    
        // Simple method for the main menu of the app
    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean on=true;

        while(on){
        System.out.println("Please choose an option:");
        System.out.println("1. AutoComplete");
        System.out.println("2. Leave");
        
      
        int choice = scanner.nextInt();
        scanner.nextLine();

      

   
            switch (choice) {
                case 1:
                    System.out.println("Enter letter or letters that you wish to autcomplete with keywords");
                    String letter =scanner.nextLine();
                   
    
                    ArrayList<String> results=Autocomplete.autocomplete(letter);
                    String res =Testing.test(results);
                    System.out.println(res);
    
    
                    
                    break;
                case 2:
                    System.out.println("Bye...");
                    on=false;
                    break;
                default:
                    System.out.println("Invalid option. Please choose either 1 or 2.");
                    break;
            }
    
            
        }
       
        scanner.close();
    }
}
