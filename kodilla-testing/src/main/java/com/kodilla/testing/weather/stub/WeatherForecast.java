package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverage() {
        double result = 0;
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            result += temperature.getValue();
        }
        return result / temperatures.getTemperatures().size();
    }

    public Double calculateMedian() {
        Map<String, Double> resultMap = temperatures.getTemperatures();
        List<Double> list = new ArrayList<>(resultMap.values());
        Collections.sort(list);
        if (list.size() % 2 == 0) {
            int num1 = (int) (list.size() / 2 + 0.5);
            int num2 = (int) (list.size() / 2 - 0.5);
            return list.get((num1 + num2) / 2);
        } else {
            return list.get(list.size() / 2);
        }
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WeatherForecast that = (WeatherForecast) o;

        return temperatures != null ? temperatures.equals(that.temperatures) : that.temperatures == null;
    }

    @Override
    public int hashCode() {
        return temperatures != null ? temperatures.hashCode() : 0;
    }
}
