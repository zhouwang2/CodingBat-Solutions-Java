public boolean commonEnd(int[] a, int[] b) {
  
  for(int i = 0; i < a.length; i++){
    if(a[0] == b[0] || a[a.length - 1] == b[b.length - 1]){
      return true;
    }
  }
  return false;
  
}
