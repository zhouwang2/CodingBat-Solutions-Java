public int bunnyEars2(int bunnies) {
  
  if(bunnies <= 0) {
    return bunnies;
  }
  if(bunnies % 2 != 0) {
    return 2 + bunnyEars2(bunnies - 1);
  }
  else{
    return 3 + bunnyEars2(bunnies - 1);
  }

}
