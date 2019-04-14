public class Temperature extends Subject  {
    private double value;

    public double getValue() {
      return value;
    }

    public void setValue(double value) {
      This.value = value;
      notifyObservers();
    }
}
  