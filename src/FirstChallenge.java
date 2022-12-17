import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FirstChallenge {
  private List<Integer> oddNumbers = new ArrayList<Integer>();
  private List<Integer> evenNumbers = new ArrayList<Integer>();;
  
  private void addToOdds(Integer number) { 
    this.oddNumbers.add(number);
  }

  private void addToEven(Integer number) {
    this.evenNumbers.add(number);
  }
  
  private void oddOrEven(int[] numbers ){
    for(int i = 0 ; i< numbers.length; i+= 1 ){
      if(numbers[i] % 2 == 0 ){
        this.addToEven(numbers[i]);
      } else {
        this.addToOdds(numbers[i]);
      }
  }
  }

  private void sortLists(){
    Collections.sort(this.oddNumbers, Collections.reverseOrder());
    Collections.sort(this.evenNumbers);
  }

  private void printLists(List<Integer> numbers){
    for( int i = 0; i < numbers.size() ; i += 1){
      System.out.println(numbers.get(i));
    }
  }

  public void sortNumbers(int[] numbers ){
    
  this.oddOrEven(numbers);
  this.sortLists();

  this.printLists(evenNumbers);
  this.printLists(oddNumbers);
}
}