class Solution {
    //int[] ans = new int[2];
    public int[] twoSum (int[] numbers, int target) {
        int i =0; int j = numbers.length-1;
        while(true){
           if(numbers[i]+numbers[j]==target){
              // ans[0]=i+1;
              // ans[1]=j+1;
              // return ans;
               return(new int[]{i+1,j+1});

           }
            else if(numbers[i]+numbers[j]<target){
               i++;

            }
            else{
               j--;
            }
        }



    }
}
