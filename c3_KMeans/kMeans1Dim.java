package c3_KMeans;

import java.util.ArrayList;
import java.util.List;

public class kMeans1Dim {

    static int[] data = { 9, 4, 13, 13, 10, 2, 10, 5, 4, 7, 8, 12, 16, 4, 8, 4, 10, 13, 8, 5 };
    static List<Cluster> cluster = new ArrayList<>();
    static boolean isReady = false;

    public static void main(String[] args) {

        initClusters();

        do {
            clearClusters();
            addDataToClusters();
            calculateNewMeans();
        } while (!isReady);

        System.out.println(cluster);

    }

    private static void initClusters() {
        cluster.add(new Cluster("A", 1));
        cluster.add(new Cluster("B", 12));
        cluster.add(new Cluster("C", 14));

    }

    private static void clearClusters() {
        Cluster c;
        for (int cl = 0; cl < cluster.size(); cl++) {
            c = cluster.get(cl);
            c.removeAll();
        }
    }

    private static void calculateNewMeans() {

        ArrayList<Boolean> newMeans = new ArrayList<>();
        for (int i = 0; i < cluster.size(); i++) {
            newMeans.add(cluster.get(i).calcMean());
        }

        if (newMeans.contains(true)) {
            isReady = false;
        } else {
            isReady = true;
        }

    }

    private static void addDataToClusters() {
        double dis;
        double minDis;
        Cluster c = null;
        Cluster nextCluster = null;
        int index;

        // Ordne alle Datenpunkte dem nächsten Cluster zu
        for (int i = 0; i < data.length; i++) {
            minDis = Double.MAX_VALUE;
            index = -1;

            // Finde das nächste Cluster
            for (int cl = 0; cl < cluster.size(); cl++) {
                c = cluster.get(cl);

                // Abstand des akt. Datenpunktes zum Cluster
                dis = getDistance(c.getMean(), data[i]);

                // Merke das naheste Cluster
                if (dis < minDis) {
                    minDis = dis;
                    nextCluster = c;
                    index = i;
                }

            }

            // Füge den Datenpunkt dem gefundenen Cluster hinzu
            nextCluster.addValue(data[index]);

        }
    }

    public static double getDistance(double cMean, int val) {
        return Math.abs(cMean - val);
    }

}
