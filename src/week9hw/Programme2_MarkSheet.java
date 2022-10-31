package week9hw;

import java.util.Scanner;

//Re write the student mark sheet programme using if else and while loop.
public class Programme2_MarkSheet {
    public static void main(String[] args) {
//Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter Student Name:           \t\t:\t");
        String name = scanner.next();
        System.out.println("Enter Student Roll number:    \t\t:\t");
        int rollNum = scanner.nextInt();
        System.out.println("Enter marks of the subject Maths:   \t:\t");
        int mathsMarks = scanner.nextInt();
        while (mathsMarks < 0 || mathsMarks > 100){
            System.out.println("\nInvalid input, Marks should be between 0 to 100");
            System.out.println("\nPlease enter correct marks\t\t:\t");
            mathsMarks = scanner.nextInt();
        }
        System.out.println("Enter marks of the subject Science:   \t:\t");
        int scienceMarks = scanner.nextInt();
        while (scienceMarks < 0 || scienceMarks >100){
            System.out.println("\nInvalis input, Marks should be between 0 to 100");
            System.out.println("\nPlease enter correct marks\t\t:\t");
            scienceMarks = scanner.nextInt();
        }
        System.out.println("Enter marks of the subject English:   \t:\t");
        int englishMarks = scanner.nextInt();
        while (englishMarks < 0 || englishMarks >100) {
            System.out.println("\nInvalis input, Marks should be between 0 to 100");
            System.out.println("\nPlease enter correct marks\t\t:\t");
            englishMarks = scanner.nextInt();
        }
        int total = sum(mathsMarks,scienceMarks,englishMarks);
        int percentage = (total*100) / 300;
        String result = calculateResult(mathsMarks,scienceMarks,englishMarks);
        String grade = calculateGrade(percentage,result);
        printTheMarkSheet(name,rollNum,mathsMarks,scienceMarks,englishMarks,total,percentage,result,grade);
        //closing the scanner
        scanner.close();

    }
    //calculating the sum
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    //calculating the result in subject marks
    public static String calculateResult(int mathsMarks, int scienceMarks, int englishMarks){
        if (mathsMarks < 35 || scienceMarks < 35 || englishMarks < 35){
            return "Fails";
        } else {
            return "Pass";
        }
    }
    //Calculating Grade on percentage and result
    public static String calculateGrade(int percentage, String result){
        String grade = null;
        if (result.equalsIgnoreCase("Pass")){
            if (percentage >= 80){
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >=50) {
                grade = "B";
            } else if (percentage >= 35) {
                grade = "C";
            }
        }else {
            grade = "-";
        }
        return grade;
    }
    //printing the Marks Sheet
    public static void printTheMarkSheet(String name, int rollNum, int mathsMarks, int scienceMarks,
                                         int englishMarks, double total, double percentage, String result,
                                         String grade){

        System.out.println("-----------------------------");
        System.out.println("|                           |");
        System.out.println("| Mark Sheet                |");
        System.out.println("|___________________________|");
        System.out.println("| Name:" + name + "                  |");
        System.out.println("| Roll No:" + rollNum + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Subjects: Marks           |");
        System.out.println("|___________________________|");
        System.out.println("| Math:" + mathsMarks + "                   |");
        System.out.println("| Science:" + scienceMarks + "                |");
        System.out.println("| English:" + englishMarks + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Total:" + total + "             |");
        System.out.println("|___________________________|");
        System.out.println("| Percentage:" + percentage + "           |");
        System.out.println("| Result:" + result + "               |");
        System.out.println("| Grade:" + grade + "                  |");
        System.out.println("|___________________________|");

    }

}
