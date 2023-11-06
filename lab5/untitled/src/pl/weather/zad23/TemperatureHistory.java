package pl.weather.zad23;

import java.util.ArrayList;

public class TemperatureHistory {
    private ArrayList<Double> temperatures;

    public TemperatureHistory() {
        this.temperatures = new ArrayList<>();
    }

    // Getter dla listy temperatur
    public ArrayList<Double> getTemperatures() {
        return temperatures;
    }

    // Dodaj temperaturę do listy
    public void addTemperature(double temperature) {
        temperatures.add(temperature);
    }

    // Usuń temperaturę z listy na podstawie indeksu
    public void removeTemperature(int index) {
        if (index >= 0 && index < temperatures.size()) {
            temperatures.remove(index);
        } else {
            System.out.println("Błąd: Nieprawidłowy indeks");
        }
    }

    // Oblicz i zwróć średnią temperaturę
    public double averageTemperature() {
        if (temperatures.isEmpty()) {
            System.out.println("Brak danych o temperaturach.");
            return 0.0;
        }

        double sum = 0.0;
        for (double temperature : temperatures) {
            sum += temperature;
        }

        return sum / temperatures.size();
    }
}
