import java.util.ArrayList;

public class ProblemSet11 {

    public static void main(String[] args) {
        int start = 12;
        int end = 16;
        System.out.println(fizzBuzz(start, end));
        //(Arrays.toString(
    }

    public static ArrayList<String> fizzBuzz(int start, int end) {
        if (start >= end){
            return null;
        }
        ArrayList<String> finalArray = new ArrayList<String>();
        for (int i = start; i < end; i++){
            String currentValue;
            if(i%3 != 0 && i%5 != 0) {
                currentValue = String.valueOf(i);
                finalArray.add(currentValue);
            }
            else if(i%3 == 0 && i%5 != 0){
                finalArray.add("Fizz");
            }
            else if(i%5 == 0 && i%3 != 0){
                finalArray.add("Buzz");
            }
            else if(i%5 == 0 && i%3 == 0){
                finalArray.add("FizzBuzz");
            } }
        return finalArray;
    }
/*
    public int maxSpan(ArrayList<Integer> numbers) {

    }

    public ArrayList<Integer> fix34(ArrayList<Integer> numbers) {

    }

    public ArrayList<Integer> fix45(ArrayList<Integer> numbers) {

    }

    public boolean canBalance(ArrayList<Integer> numbers) {

    }

    public boolean linearIn(ArrayList<Integer> outer, ArrayList<Integer> inner) {

    }

    public ArrayList<Integer> squareUp(int n) {

    }

    public ArrayList<Integer> seriesUp(int n) {

    }

    public int maxMirror(ArrayList<Integer> numbers) {

    }

    public int countClumps(ArrayList<Integer> numbers) {

    }*/
}