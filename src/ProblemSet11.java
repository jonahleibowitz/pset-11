import java.util.ArrayList;

public class ProblemSet11 {

    public static void main(String[] args) {
       // int[] numbers = {1, 2, 3, 4, 5, 5};
        //int end = 16;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        //1, 4, 1, 5, 5, 4, 1 }) → { 1, 4, 5, 1, 1, 4, 5 }
        numbers.add(1);
        numbers.add(4);
        numbers.add(1);
        numbers.add(5);
        numbers.add(5);
        numbers.add(4);
        numbers.add(1);

        System.out.println(fix45(numbers));
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

    public static int maxSpan(ArrayList<Integer> numbers) {
        int span;
        int max = 0;
        if(numbers == null){
            return -1;
        } else if (numbers.size() == 0){
            span = 0;
        } else if (numbers.size() == 1){
            span = 1;
        } else {
            int currSpan = 0;
            for (int i = 0; i < numbers.size(); i++) {
                for (int j = i; j < numbers.size(); j++) {
                    if (numbers.get(i) == numbers.get(j)) {
                        currSpan = j - i + 1;
                    }
                }
                if (currSpan > max) {
                    max = currSpan;
                }
            }
            span = max;
        }
        return span;
    }

    public static ArrayList<Integer> fix34(ArrayList<Integer> numbers) {
        //////////////////////////////////////////////
        if(numbers == null){
            return null;
        }
        ArrayList<Integer> others = new ArrayList<Integer>();
        int threeCount = 0;
        int fourCount = 0;
        //int otherCount = 0;

        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) == 3){
                threeCount ++;
            } else if(numbers.get(i) == 4){
                fourCount ++;
            } else{
                others.add(numbers.get(i));
            } }
        //////////////////////////////////////////////
        boolean fourFirst = false;
        for(int j = 0; j < numbers.size(); j++) {
            if (numbers.get(j) == 3) {
                break;
            }
            if (numbers.get(j) == 4) {
                fourFirst = true;
                break;
            }
        }
        //////////////////////////////////////////////
        boolean consecutive = false;
        boolean end = false;
        for(int k = 0; k < numbers.size()-1; k++){
            if(numbers.get(k) == 3 && numbers.get(k+1) == 4){
                consecutive = true;
                break; } }

        if(numbers.get(numbers.size()-1) == 3){
            end = true; }
        //////////////////////////////////////////////
        if(numbers == null || threeCount != fourCount || fourFirst == true || consecutive == true || end == true){
            return null; }
        //////////////////////////////////////////////
        //////////////////////////////////////////////////
       ArrayList<Integer> arr = new ArrayList<Integer>();
        while(arr.size() < numbers.size()) arr.add(null);

        for(int i = 0; i <numbers.size(); i++){
            if(numbers.get(i) == 3){
                arr.set(i, 3);
                arr.set(i+1, 4); } }
        int otherIndex =0;
        for(int j = 0; j <arr.size(); j++) {
            if(arr.get(j) == null){
                arr.set(j, others.get(otherIndex));
                otherIndex++;
            } }
        return arr;
    }

    public static ArrayList<Integer> fix45(ArrayList<Integer> numbers) {
    if(numbers == null){
            return null;
        }
        ArrayList<Integer> others = new ArrayList<Integer>();
        int fiveCount = 0;
        int fourCount = 0;
        //int otherCount = 0;

        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) == 4){
                fourCount ++;
            } else if(numbers.get(i) == 5){
                fiveCount ++;
            } else{
                others.add(numbers.get(i));
            } }
        //////////////////////////////////////////////
        boolean consecutive = false;
        boolean end = false;
        for(int k = 0; k < numbers.size()-1; k++){
            if(numbers.get(k) == 4 && numbers.get(k+1) == 4){
                consecutive = true;
                break; } }

        if(numbers.get(numbers.size()-1) == 4){
            end = true; }
        //////////////////////////////////////////////
        if(numbers == null || fiveCount != fourCount || consecutive == true || end == true){
            return null; }
        //////////////////////////////////////////////
        //////////////////////////////////////////////////
       ArrayList<Integer> arr = new ArrayList<Integer>();
        while(arr.size() < numbers.size()) arr.add(null);

        for(int i = 0; i <numbers.size(); i++){
            if(numbers.get(i) == 4){
                arr.set(i, 4);
                arr.set(i+1, 5); } }
        int otherIndex =0;
        for(int j = 0; j <arr.size(); j++) {
            if(arr.get(j) == null){
                arr.set(j, others.get(otherIndex));
                otherIndex++;
            } }
        return arr;

    }

    public static boolean canBalance(ArrayList<Integer> numbers) {

    }
/*
    public static boolean linearIn(ArrayList<Integer> outer, ArrayList<Integer> inner) {

    }

    public static ArrayList<Integer> squareUp(int n) {

    }

    public static ArrayList<Integer> seriesUp(int n) {

    }

    public static int maxMirror(ArrayList<Integer> numbers) {

    }

    public static int countClumps(ArrayList<Integer> numbers) {

    }*/
}