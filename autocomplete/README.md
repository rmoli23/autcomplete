# 1.
-This is a basic app that the uses a switch case that works as a menu, so you can keep running the program till you decide to end it.
-The program is run on App.java class there you only have to run the main method
-I have preferred to use static methods, as I can call them use by using the class, I could've donde without making them static and just calling them by instantiating the object and call the method from there. I do believe that static methods allow you for more freedom.
-As it wasn't specified how to show the results y just simply print and ArrayList, that will show the results in alphabetical order as mentioned on the instructions.
- If you choose to completely type a word that is on the keyword array, it wont return any suggestions. Also if the word isn't in the keyword array it won't return suggestions either.


# source:
https://stackoverflow.com/questions/8712090/string-java-startswith
https://stackoverflow.com/questions/19006257/how-does-math-min-actually-work
https://stackoverflow.com/questions/8938235/sort-an-array-in-java


# What would you change if the list of keywords was large (several millions)?
With a framework like Springboot you can use microservices to better upscale when handling larger amounts of data.
In plain java (without no framework) you can use processes to ease the load by distributing different chunks of data in processes.

# What would you change if the requirements were to match any portion of the keywords (example:
# for string “pro”, code would possibly return “reprobe”)
Instead of using startsWith, you could use contains as the if statement will become True or false if the desired string exists en the word you are comparing against.
