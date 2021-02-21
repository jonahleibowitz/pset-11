import java.util.ArrayList;

public class ProblemSet11 {

    public static void main(String[] args) {

    }

    public ArrayList<String> fizzBuzz(int start, int end) {
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

    public int maxSpan(ArrayList<Integer> numbers) {
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

    public ArrayList<Integer> fix34(ArrayList<Integer> numbers) {
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

    public ArrayList<Integer> fix45(ArrayList<Integer> numbers) {
    if(numbers == null){
            return null;
        }
        ArrayList<Integer> others = new ArrayList<Integer>();
        int fiveCount = 0;
        int fourCount = 0;

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

    public boolean canBalance(ArrayList<Integer> numbers) {
        if (numbers == null || numbers.size() == 0) {
            return false;
        }

        int[] front = new int[numbers.size()];
        boolean equal = false;
        int numberSum = 0;
        int frontSum = 0;

        for(int i = 0; i < numbers.size(); i++){
            frontSum=0;
            numberSum = 0;
            front[i] = numbers.get(i);
            numbers.set(i, 0);

            for (int j = 0; j < numbers.size(); j++) {
                numberSum += numbers.get(j);
            }
            for (int k = 0; k < front.length; k++) {
                frontSum += front[k];
            }
            if (frontSum == numberSum) {
                equal = true;
                break;
            }
        }
        return equal;
    }

    public boolean linearIn(ArrayList<Integer> outer, ArrayList<Integer> inner) {
        if(outer == null || outer == null || outer.size() == 0 || inner.size() == 0){
            return false;
        }
        boolean check = true;
        for(int i = 1; i< outer.size(); i++){
            if (outer.get(i) < outer.get(i-1)){
                check = false; } }
        for(int i = 1; i < inner.size(); i++){
            if (inner.get(i) < inner.get(i-1)){
                check = false; } }

        for(int j = 0; j < inner.size(); j++){
            if(outer.contains(inner.get(j)) == false){
                check = false;
                break; }
        }
        return check;
    }

    public ArrayList<Integer> squareUp(int n) {
        if (n < 0) {
            return null;
        }
        ArrayList<Integer> squareList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int[] section = new int[n];
            int addOn = 0;
            for (int j = n - 1; j >= 0; j--) {
                if (addOn < i + 1) {
                    section[j] = addOn + 1;
                    addOn++;
                }
            }
            for (int k : section) {
                squareList.add(k); }
        }
        return squareList;
    }

    public ArrayList<Integer> seriesUp(int n) {
        if(n<0){
            return null; }

        ArrayList<Integer> series = new ArrayList<>();
        for(int i = 0; i < n; i ++){
            for(int j = 1; j < i + 2; j ++){
                series.add(j);}}
        return series;
    }

    public int maxMirror(ArrayList<Integer> numbers) {
    if (numbers == null){
        return -1;
    }
    ArrayList<Integer> forward = new ArrayList<Integer>();
    ArrayList<Integer> backward = new ArrayList<Integer>();
    ArrayList<Integer> duplicate = new ArrayList<Integer>();
    for(int i = 0; i < numbers.size(); i++){
        duplicate.add(numbers.get(i));
    }

    int currentTest;
    for(int j =0; j<duplicate.size(); j++){
        currentTest = duplicate.get(j);
        for(int k = j+1; k<duplicate.size(); k++){
            if(duplicate.get(k) == currentTest){
                forward.add(currentTest); } } }

    int backTest;
    for(int j = duplicate.size()-1; j>=0; j--){
         backTest = duplicate.get(j);
         for(int k = j-1; k>=0; k--){
            if(duplicate.get(k) == backTest){
                backward.add(backTest); } } }

    int count =0;
    for(int x =0; x < backward.size(); x++){
        if(backward.get(x) == forward.get(x)){
            count++;
        }
    }
        ArrayList<Integer> newForward = new ArrayList<Integer>();
        for(int i = 0; i < forward.size(); i++){
            newForward.add(forward.get(i));
        }

        if(count == 1){
            for(int p = 0; p <numbers.size(); p++){
                if(numbers.get(p) == numbers.get(p+2)){
                    return 3;
                }}}

    if(count == 0){
        forward.remove(0);
        for(int x =0; x < forward.size(); x++){
            if(backward.get(x) == forward.get(x)){
                count++;
            }
        }
    }
        if(count == 0){
            backward.remove(0);
            for(int x =0; x < backward.size(); x++){
                if(backward.get(x) == newForward.get(x)){
                    count++;
                }
            }
        }
    return count;
    }

    public int countClumps(ArrayList<Integer> numbers) {
        if(numbers == null){return -1;}
        int clumpCount = 0;
        int currentI = 0;
        for(int i = 1; i < numbers.size(); i++){
            if(numbers.get(i) == numbers.get(i-1)){
                clumpCount ++;
            } }
        for (int j = 2; j < numbers.size(); j++)
            if(numbers.get(j) == numbers.get(j-2) && numbers.get(j) == numbers.get(j-1)){
                clumpCount--;
            }
        return clumpCount;
    }
}