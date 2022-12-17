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

  public void sortNumbers(int[] numbers ){
    int sizeOfArray = numbers.length;
    for(int i = 0; i < sizeOfArray; i += 1 ){
      if(numbers[i] % 2 == 0 ){
        this.addToEven(numbers[i]);
      } else {
        this.addToOdds(numbers[i]);
      }
 
  }
  Collections.sort(oddNumbers, Collections.reverseOrder());
  Collections.sort(evenNumbers);
  System.out.println(oddNumbers);
  System.out.println(evenNumbers);
}
}