class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] array = {-1,-1};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int res = target - nums[i];
            if(map.containsKey(res)){
                array[0] = map.get(res);
                array[1] = i;
                break;
            }
            else{
                map.put(nums[i],i);
            }
        }
     return array;
    }
}