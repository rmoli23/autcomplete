import java.util.ArrayList;
import java.util.Collections;
import java.util.ArrayList;

public class Autocomplete {


    // Declare array with all the keywords that will be use for matching
    
    static String[] keywords = {
        "Pandora", "Pinterest", "Paypal", "Pg&e", "Project free tv", "Priceline", 
        "Press democrat", "Progressive", "Project runway", "Proactive", 
        "Programming", "Progeria", "Progesterone", "Progenex", "Procurable", 
        "Processor", "Proud", "Print", "Prank", "Bowl", "Owl", "River", 
        "Phone", "Kayak", "Stamps", "Reprobe"
    };

    // Autocomplete method
    public static ArrayList<String> autocomplete(String word) {
        ArrayList<String> suggestions = new ArrayList<>(); // Create an empty ArrayList

        // Loop through the keywords array
        for (String keyword : keywords) {
            // Check if the keyword starts with the input word (case insensitive)
            if (keyword.toLowerCase().startsWith(word.toLowerCase()) && !keyword.equalsIgnoreCase(word) ) {
                suggestions.add(keyword); // Add the matching keyword to suggestions
            }
        }

        // Order arraylist in alphabetical order
        Collections.sort(suggestions);

        //Choose the top 4 results
        
        int index=Math.min(4,suggestions.size());
        ArrayList<String> top4 =new ArrayList<>(suggestions.subList(0, index));

        return top4; // Return the suggestions list
    }

   
    }



