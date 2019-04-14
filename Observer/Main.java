public class TesteTemperature {
    public static void main() {
      Temperature t = new Temperature(30);
      t.addObserver(new TermometerCelsius ());
      t.addObserver(new TermometerFahrenheit ());
      t.setValue(40);
    }
  }
  