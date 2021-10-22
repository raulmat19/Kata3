package kata3;

public class Kata3 {

    public static void main(String[] args) {
        
        Histogram<String> histogram = new Histogram<>();
        histogram.increment("gmail.com");
        histogram.increment("ulpgc.es");
        histogram.increment("outlook.com");
        histogram.increment("icloud.com");
        histogram.increment("ulpgc.es"); // Clave repetida
        histogram.increment("outlook.com"); // Clave repetida
        histogram.increment("ulpgc.es"); // Clave repetida
        
        new HistogramDisplay(histogram).execute();
    }
    
}
