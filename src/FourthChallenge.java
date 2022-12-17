public class FourthChallenge {
  private String firstHalf = "";
  private String secondHalf = "";

  public void setFirstHalf(String firstHalf) {
    this.firstHalf = firstHalf;
  }

  public String getFirstHalf() {
    return firstHalf;
  }

  public void setSecondHalf(String secondHalf) {
    this.secondHalf = secondHalf;
  }

  public String getSecondHalf() {
    return secondHalf;
  }

  private void resetWords() {
      setFirstHalf("");
      setSecondHalf("");
  }
  

  public void fix(String[] data){
    int phrasesQuantity = Integer.parseInt(data[0]);
    for(int i = 1; i<= phrasesQuantity; i += 1 ){
      resetWords();
      int halfStringSize = data[i].length()/2;

      String rawFirstHalf = data[i].substring(0, halfStringSize);
      String rawSecondHalf = data[i].substring(halfStringSize);

      for( int j = (halfStringSize -1); j >= 0 ; j-= 1){
        setFirstHalf(getFirstHalf() + rawFirstHalf.charAt(j) );
      }
      for( int j = (halfStringSize -1); j >= 0 ; j-= 1){
        setSecondHalf(getSecondHalf() + rawSecondHalf.charAt(j) );
      }
      System.out.println(getFirstHalf() + getSecondHalf());
    }
  } 

}
