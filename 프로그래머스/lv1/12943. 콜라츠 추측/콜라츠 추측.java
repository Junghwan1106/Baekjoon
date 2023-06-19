class Solution {
    public int solution(int num) {

        if(num == 1){
            return 0;
        }
        
        long copy = num;
        
        int count = 0;
        while(copy != 1 && count < 501){
            count++;
            if(copy % 2 == 0){
                copy = copy / 2;
            } else {
                copy = copy * 3 + 1;
            }
        }
        if(count == 501){
            return -1;
        } else {
            return count;
        }
    }
}