class Solution {
    public boolean isPalindrome(int x) {

        String x_string = String.valueOf(x);
        int left_side = 0;
        int right_side = x_string.length() - 1;

        while(left_side < right_side){
            if(x_string.charAt(left_side) == x_string.charAt(right_side)){
                left_side++;
                right_side--;
            }
            else{
                return false;
            }
        }
        return true;

    }
}