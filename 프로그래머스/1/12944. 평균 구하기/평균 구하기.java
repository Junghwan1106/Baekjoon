class Solution {
  public double solution(int[] arr) {
        double sum = 0;

        for (int number : arr) {
            sum += number;
        }

        return sum / arr.length;
    }
}
