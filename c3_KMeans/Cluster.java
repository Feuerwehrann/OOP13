package c3_KMeans;

import java.util.ArrayList;
import java.util.List;

public class Cluster {

    private String name;
    private double mean;
    private List<Integer> data;

    public Cluster(String name, double mean) {
        data = new ArrayList<>();
        this.mean = mean;
        this.name = name;
    }

    public void addValue(int val) {
        data.add(val);
    }

    public void removeAll() {
        data.clear();
    }

    public double getMean() {
        return mean;
    }

    public boolean calcMean() {
        boolean isNewMean;
        double sum = 0;
        double newMean;

        for (int i = 0; i < data.size(); i++) {
            sum = sum + data.get(i);
        }

        newMean = sum / data.size();

        if (newMean != mean) {
            mean = newMean;
            isNewMean = true;
        } else {
            isNewMean = false;
        }

        return isNewMean;
    }

    @Override
    public String toString() {

        return "\t" + name + " mean:" + mean + "\t" + data.toString() + "\n";
    }

}
