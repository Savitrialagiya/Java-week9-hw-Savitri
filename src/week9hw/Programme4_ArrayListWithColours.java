package week9hw;
//Write a Java program to create a new array list, add some colours (string) and
//printout the collection using for each loop.
import java.util.ArrayList;

public class Programme4_ArrayListWithColours {
    public static void main(String[] args) {
        //Object creation
        Programme4_ArrayListWithColours obj = new Programme4_ArrayListWithColours();
        obj.arrayListWithColours();
    }
    public void arrayListWithColours() {
        ArrayList<String> colours = new ArrayList();

        colours.add("Red");
        colours.add("Blue");
        colours.add("Pink");
        colours.add("White");
        colours.add("Black");
        colours.add("Green");
        colours.add("Purple");

        for (String colourName : colours) {
            System.out.println(colourName);
        }

    }
}
