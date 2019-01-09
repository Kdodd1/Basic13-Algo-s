import java.util.ArrayList;

public class Basic13 {

        // the code that actually runs!!!!!
        public static void main(String[] args) {
            int[] arr1 = new int[]{1,2,3,4,5};
            int[] arr2 = new int[]{1,5,10,-2};
            Basic13 b13 = new Basic13();
            b13.shiftValues(arr2);
            // b13.maxMinAvg(arr2);
            // b13.elimNegativeNums(arr2);
            // int count =b13.returnArrayCountGreaterThanY(arr1, 2);
            // System.out.println(count);
            // b13.squareArrayVals(arr2);
            // b13.returnOddsArray1To255();
            // b13.printAverageOfArray(arr1);
            // b13.printMaxOfArray(arr1);
            // b13.print1to255();
            // b13.printOdds();
            // b13.printSum();
            // b13.print0to255();
            // System.out.println( b13.arr2Str( arr1 )) ;
        }

        public void shiftValues(int[] arr) {
            Basic13 b13 = new Basic13();
            for(int i = 0; i < arr.length; i++) {
                if(i < arr.length-1){
                arr[i] = arr[i+1];
                }else{
                    arr[i] = 0;
                }
            }

            System.out.println(b13.printArray(arr));
        }

        public void maxMinAvg(int[] arr) {
            int min = arr[0];
            int max = arr[0];
            int count = 0;
            for(int i = 1; i < arr.length; i++) {
                if(arr[i] > max){
                    max = arr[i];
                }
                if(arr[i] < min) {
                    min = arr[i];
                }
                count += arr[i];
            }
            System.out.println(String.format("Max: %d, Min: %d, Avg: %d", max, min, count/arr.length));
        }
        public void elimNegativeNums(int[] arr) {
            Basic13 b13 = new Basic13();
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] < 0) {
                    arr[i] = 0;
                }
            }
            System.out.println(b13.printArray(arr));
        }

        public Integer returnArrayCountGreaterThanY(int[] arr, int y){
            int count = 0;
            for(int i =0; i < arr.length; i++){
                if(arr[i] > y){
                    count++;
                }
            }
            return count;
        }

        public void squareArrayVals(int[] arr) {
            Basic13 b13 = new Basic13();
            for(int i=0; i < arr.length; i++) {
                arr[i] = arr[i]*arr[i];
            }
            System.out.println(b13.printArray(arr));
        }

        public void returnOddsArray1To255() {
            ArrayList<Integer> array1 = new ArrayList<Integer>();
            for(int i = 0; i < 256; i++){
                if(i % 2 != 0){
                    array1.add(i);
                }
            }
            System.out.println(array1);
        }

        public void printAverageOfArray(int[] arr) {
            int total = 0;
            for(int i=0; i < arr.length; i++) {
                total += arr[i];
            }
            System.out.println(total/arr.length);
        }

        public void printMaxOfArray(int[] arr) {
            int max = arr[0];
            for(int i=0; i< arr.length; i++){
                if(max < arr[i]){
                    max = arr[i];
                }
            }
            System.out.println(max);
        }

        public void print1to255() {
            for(int i=1; i<256; i++) {
                System.out.println(i);
            }
        }

        public void printOdds() {
            for(int i = 1; i<256; i++) {
                if(i % 2 != 0){
                    System.out.println(i);
                }
            }
        }
        public void print0to255() {
            for(int i = 0; i<256; i++) {
                System.out.println(i);
            }
        }
        
        public void printSum() {
            int sum = 0;
            for(int i=0; i<256; i++) {
                sum += i;
                System.out.println(String.format("New number is: %d Sum: %d", i, sum));
            }
        }

        public String printArray(int[] arr){
            String s = "[";
            for(int i=0; i<arr.length; i++) {
                if(i < arr.length-1){
                s += arr[i] + ", ";
                }
                else{
                    s += arr[i];
                }
            }
            s += "]";
            return s;
        }

}