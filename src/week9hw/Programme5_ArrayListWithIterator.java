package week9hw;

import java.util.ArrayList;
import java.util.Iterator;

//Write a Java program to iterate through all elements in an array list using
//Iterator.
public class Programme5_ArrayListWithIterator {
    public static void main(String[] args) {
        //object creation
        Programme5_ArrayListWithIterator obj = new Programme5_ArrayListWithIterator();
        obj.arrayListWithIterator();}
     //Instance method
    public void arrayListWithIterator() {
        ArrayList<String> stationeryList = new ArrayList();
        stationeryList.add("Pen");
        stationeryList.add("Pencil");
        stationeryList.add("Eraser");
        stationeryList.add("Sharpener");
        stationeryList.add("Ruler");
        stationeryList.add("Calculator");
        stationeryList.add("Books");
        System.out.println("ArrayList: " + stationeryList);
        //Creating an Instance of Stationery list iterator
        Iterator<String> stationeryName = stationeryList.iterator();
        System.out.println("Iterating over ArrayList: ");
        while (stationeryName.hasNext()) {
            System.out.println(stationeryName.next());
        }
    }
}
