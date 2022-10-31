package week9hw;

import java.util.HashSet;

//Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
//Show which numbers are between 1 and 10 are in the set. (Hint: use for loop
//and if else)
public class Programme8_HashSetStore {

    public static void main(String[] args) {
    Programme8_HashSetStore obj = new Programme8_HashSetStore();
    obj.hashSetStoreIntegerAndNumber();
    }
    public void hashSetStoreIntegerAndNumber(){
        //Create Hashset object called numbers
        HashSet<Integer> numbers = new HashSet();
        //add values to the set
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        //Show which number is between 1 to 10 in set
        for (int i = 1; i <=10; i++){
            if (numbers.contains(i)){
                System.out.println(i + " was found in the set. ");
            }else {
                System.out.println(i + " was not found in the set. ");
            }
        }
    }
}
