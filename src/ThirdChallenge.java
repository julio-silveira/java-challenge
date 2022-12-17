public class ThirdChallenge {
  private int target;
  private int count;

  public int getTarget() {
    return target;
  }
  public int getCount() {
    return count;
  }
  public void setTarget(int target) {
    this.target = target;
  }
  public void setCount(int count) {
    this.count = count;
  }

  public void counter(int[] numberList,int number){
    setTarget(number);
    for(int i : numberList){
      for( int j : numberList){
        if( i - j == getTarget()){
          setCount(getCount() + 1 );
        }
      }
    }
    System.out.println(getCount());
  }

}
