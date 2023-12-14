package c1_KNN;

import java.util.ArrayList;

public class Main {
    public static int k = 3;

    public static void main(String[] args) {
        ArrayList<DataObject> objs = new ArrayList<DataObject>();
        objs.add(new DataObject(97, 3, 0));
        objs.add(new DataObject(96, 4, 0));
        objs.add(new DataObject(94, 6, 0));
        objs.add(new DataObject(73, 20, 0));
        objs.add(new DataObject(90, 10, 0));
        objs.add(new DataObject(91, 3, 1));
        objs.add(new DataObject(92, 11, 1));
        objs.add(new DataObject(87, 8, 1));
        objs.add(new DataObject(85, 10, 1));
        objs.add(new DataObject(84, 24, 1));
        objs.add(new DataObject(77, 6, 1));
        objs.add(new DataObject(86, 25, 2));
        objs.add(new DataObject(81, 27, 2));
        objs.add(new DataObject(77, 12, 2));
        objs.add(new DataObject(76, 25, 2));
        DataObject o = new DataObject(89, 9);
        System.out.println(kNN(o, objs));

    }

    public static int kNN(DataObject o, ArrayList<DataObject> objs) {
        int[] indices = new int[k];
        double[] mins = new double[k];
        for (int i = 0; i < k; i++) {
            mins[i] = Double.MAX_VALUE;
        }
        for (int i = 0; i < objs.size(); i++) {
            double dist = distance(o, objs.get(i));
            double max = Double.MIN_VALUE;
            int maxIdx = 0;
            for (int j = 0; j < k; j++) {
                if (max < mins[j]) {
                    max = mins[j];
                    maxIdx = j;
                }
            }
            if (mins[maxIdx] > dist) {
                mins[maxIdx] = dist;
                indices[maxIdx] = i;
            }
        }
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < k; i++) {
            if (objs.get(indices[i]).klasse == 0) {
                a++;
            }
            if (objs.get(indices[i]).klasse == 1) {
                b++;
            }
            if (objs.get(indices[i]).klasse == 2) {
                c++;
            }
           
        }


            if (a > b && a > c) {
                return 0;
            }
            if (b > a && b > c) {
                return 1;
            }
           if (c > a && c > b) {
                return 2;
            }
            else{
                return 99;
            }
            
    }
        
    

    private static double distance(DataObject o, DataObject ref) {
        return Math.sqrt((o.x - ref.x) * (o.x - ref.x)) + ((o.y - ref.y) * o.y - ref.y);
    }

}
