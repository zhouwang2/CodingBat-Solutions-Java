public int fibonacci(int n) {
  
  if(n < 2){
    return n;
  }
  int prev = fibonacci(n - 1);
  int prevprev = fibonacci(n - 2);
  int result = prev + prevprev;
  return result;
  
}
