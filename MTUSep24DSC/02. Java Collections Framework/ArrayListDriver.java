import java.util.ArrayList;
import java.util.List;

public class ArrayListDriver {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John"); // adds at end of the array list
        names.add("Danny");
        names.add("Nathan");
        names.add("Conor");
        names.add("Lara"); // creates a list(names) with John,Danny, Nathan, Conor and Lara

        //Check if the names list contains Laura
        boolean isLauraPresent = names.contains("Laura");

        for(int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            System.out.println(name);
        }
        System.out.println("Array List Size:" + names.size()); //showing how many names in the array
        System.out.println("Names list contains Laura: " + isLauraPresent + '\n');

        List<String> Alternames = new ArrayList<String>();
        Alternames.add("JJ");
        Alternames.add("Casey");
        Alternames.add("CJ");
        Alternames.add("Coach");
        Alternames.add("RoRO");
        Alternames.add(0,"Laura"); //adding in Laura at index 0 to see how it alters the list
        Alternames.add(6,"Laura");

        //Check if the Alternames list contains Laura
        boolean isLauraPresent2 = Alternames.contains("Laura");

        //output the contents of the Alternames list
        for(int j = 0; j < Alternames.size(); j++){
            String Altername = Alternames.get(j);
            System.out.println(Altername);
        }
        System.out.println("Array List Size:" + names.size()); //showing how many names in the array
        System.out.println("Alternames list contains Laura: " + isLauraPresent2 + '\n');
    }
}
