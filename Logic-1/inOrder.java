public boolean inOrder(int a, int b, int c, boolean bOk) {
  
  if(bOk == true){
    if(c > b){
      return true;
    }
    return false;
  }
  if(a < b && b < c){
    return true;
  }
  return false;
  
}
