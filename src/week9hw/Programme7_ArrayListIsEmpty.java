package week9hw;

import java.util.ArrayList;

//Write a Java program to test an array list is empty or not. Define array list with
// underground tube names
public class Programme7_ArrayListIsEmpty {
    public static void main(String[] args) {
        //Creating an object
        Programme7_ArrayListIsEmpty obj = new Programme7_ArrayListIsEmpty();
        obj.arrayListIsEmptyOrNot();
    }
    public void arrayListIsEmptyOrNot(){
        ArrayList<String> tubeList = new ArrayList();
        tubeList.add("Bakerloo");
        tubeList.add("Central");
        tubeList.add("Circle");
        tubeList.add("District");
        tubeList.add("Hammersmith & city");
        tubeList.add("Jubilee");
        tubeList.add("Metropolitan");
        tubeList.add("Northern");
        tubeList.add("Piccadilly");
        tubeList.add("Victoria");
        tubeList.add("Waterloo & city");

        System.out.println("Original tube list " + tubeList);
        System.out.println("The above array list is empty! " + " = " + tubeList.isEmpty());
        tubeList.removeAll(tubeList);
        System.out.println("Array list after removing all elements " + tubeList);
        System.out.println("The above array list is empty! "+ " = " +  tubeList.isEmpty());
    }
}
