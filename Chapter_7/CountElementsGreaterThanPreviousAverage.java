

public class CountElementsGreaterThanPreviousAverage {

    public static int countGreaterThanPreviousAverage(int[] responseTimes) {
        int count = 0;
        int sum = responseTimes[0];
        
        for (int i = 1; i < responseTimes.length; i++) {
            double average = (double) sum / i;
            if (responseTimes[i] > average) {
                count++;
            }
            sum += responseTimes[i];
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        int[] responseTimes = {100, 200, 150, 300};
        int result = countGreaterThanPreviousAverage(responseTimes);
        System.out.println(result);
    }
}
