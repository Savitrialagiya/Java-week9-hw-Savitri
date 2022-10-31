package week9hw;
// Write a Java program to reverse an array of integer values.
public class Programme3_ReverseArray {
    public static void main(String[] args) {
        //Object creation
        Programme3_ReverseArray obj = new Programme3_ReverseArray();
        obj.reverseArrayIfIntegerValues();
    }
    public void reverseArrayIfIntegerValues(){
        //initialize array
        int [] array = new int[] {04,10,19,20,29};
        System.out.println("Original array: ");
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i] + "");
        }
        System.out.println();
        System.out.println("Array in reverse order: ");
        //Loop through the array in reverse order
        for (int i = array.length-1; i >=0;i--){
            System.out.println(array[i] + "");
        }
    }
}
