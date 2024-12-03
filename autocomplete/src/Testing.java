import java.util.ArrayList;

// Simple class holding the testing
public class Testing {

    public static void main(String[] args) {
        
        ArrayList<String> results=Autocomplete.autocomplete("p");
        String res =test(results);
        System.out.println(res);
      
        results=Autocomplete.autocomplete("pr");
        res =test(results);
        System.out.println(res);

        results=Autocomplete.autocomplete("pro");
        res =test(results);
        System.out.println(res);
      

        results=Autocomplete.autocomplete("prog");
        res =test(results);
        System.out.println(res);

        results=Autocomplete.autocomplete("progenex");
        res =test(results); 
        System.out.println(res);
      
      
        
        
    }

    public static String test (ArrayList<String> result){


        if(result.isEmpty()){
            return "No matches found";
        }else{
            return "Results: " + result;
        }
    }

   
}
