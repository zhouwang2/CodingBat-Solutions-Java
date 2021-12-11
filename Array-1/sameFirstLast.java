public boolean sameFirstLast(int[] nums) {

  for(int i = 0; i < nums.length; i++){
    if(nums[0] == nums[nums.length - 1] && nums.length >= 1){
      return true;
    }
  }
  return false;
  
}
