package week9hw;

import java.util.ArrayList;
//Write a Java program to retrieve an element (at a specified index) from a given
//array list
public class Programme6_RetrieveElement {
    public static void main(String[] args) {
        //Creating object
        Programme6_RetrieveElement obj = new Programme6_RetrieveElement();
        obj.retrieveElementFromArrayList();
    }
    //instance method
    public void retrieveElementFromArrayList() {

        ArrayList<Integer> list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        //print the list
        System.out.println(list);
        //Retrieve element at index 2
        Integer element = list.get(2);
        System.out.println("The element at index 2 is: " + element);
        //Retrieve element at index 4
        element = list.get(4);
        System.out.println("The element at index 4 is: " + element);

    }
}
