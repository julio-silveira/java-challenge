import java.util.Locale;

public class secondChallenge {
  private double currentValue;
  private double[] bills = { 100.00f,50.00f, 20.00f, 10.00f ,5.00f, 2.00f };
  private double[] coins = {1.00f, 0.50f, 0.25f, 0.10f, 0.05f, 0.01f };

  private void setCurrentValue(double currentValue) {
    this.currentValue = currentValue;
  }
  private double getCurrentValue() {
    return currentValue;
  }

  private void calcFiat(double moneyValue, String message) {
    int moneyUnit = (int) Math.floor(this.getCurrentValue()/moneyValue);
    double newValue = getCurrentValue() - (moneyUnit*moneyValue);
    setCurrentValue(newValue);
    System.out.println(String.format(Locale.US,"%d %s %.2f", moneyUnit, message, moneyValue));
  }

  public void toFiat(double value){
    this.setCurrentValue(value);
    for(int i = 0; i< bills.length ; i += 1){
      calcFiat(bills[i], " nota(s) de R$ ");
    }
    for(int i = 0; i< coins.length ; i += 1){
      calcFiat(coins[i], " moedas(s) de R$ ");
    }
   
  }
}
