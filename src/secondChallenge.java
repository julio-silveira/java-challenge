public class secondChallenge {
  private float currentValue;
  private float[] bills = { 100.00f,50.00f, 20.00f, 5.00f, 2.00f };
  private float[] coins = {1.00f, 0.50f, 0.25f, 0.10f, 0.05f, 0.01f };

  private void setCurrentValue(float currentValue) {
    this.currentValue = currentValue;
  }
  private float getCurrentValue() {
    return currentValue;
  }

  

  public void toFiat(float value){
    setCurrentValue(value);    
  }
}
