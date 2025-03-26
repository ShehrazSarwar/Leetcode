public class Binary_Search {
    public static void main(String [] args){
        int[] numbers = {-1,0,3,5,9,12};
        System.out.println(binary_search(numbers,5));
    }
    static int binary_search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        while(low <= high){
            mid = (low + high) / 2;
            int guess = nums[mid];
            if(target == guess){
                return mid;
            }  
            if(guess > target){
                high = mid - 1;
            } 
            else{
                low = mid + 1;
            }  
        }
        return -1;
    }
}