package program1calculate;

public class Calculator {
    public void addition(int a, int b){
        System.out.println(a+b);}
    public void subtraction(int a, int b){
        System.out.println(a-b);}
    public void division(int a, int b){
        System.out.println(a/b);}
    public void multiplication(int a, int b){
        System.out.println(a*b);}
    public void calculateResult(int a, int b, char symbol){
        if (symbol == '+'){
            System.out.println(a + " + " + b + " = " + (a+b));
        } else if (symbol == '-') {
            System.out.println(a + " - " + b + " = " + (a-b));
        } else if (symbol == '/') {
            System.out.println(a + " / " + b + " = " + (a/b));
        } else if (symbol == '*') {
            System.out.println(a + " * " + b + " = " + (a*b));
        } else {
            System.out.println("Please enter correct symbol");
        }

    }
}
