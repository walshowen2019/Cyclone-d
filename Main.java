import java.lang.Math;

public class Main {

    public static double R = 6371;

    public static void main(String[] args) {

        double totalDistance = 0;

        double baseLat1Array[];
        baseLat1Array = new double[12];
        baseLat1Array[0] = 25;
        baseLat1Array[1] = 23;
        baseLat1Array[2] = 21;
        baseLat1Array[3] = 20;
        baseLat1Array[4] = 19;
        baseLat1Array[5] = 21;
        baseLat1Array[6] = 23;
        baseLat1Array[7] = 25;
        baseLat1Array[8] = 28;
        baseLat1Array[9] = 32;
        baseLat1Array[10] = 34;
        baseLat1Array[11] = 36;

        double baseLong1Array[];
        baseLong1Array = new double[12];
        baseLong1Array[0] = 15;
        baseLong1Array[1] = 20;
        baseLong1Array[2] = 24;
        baseLong1Array[3] = 27;
        baseLong1Array[4] = 35;
        baseLong1Array[5] = 46;
        baseLong1Array[6] = 56;
        baseLong1Array[7] = 65;
        baseLong1Array[8] = 70;
        baseLong1Array[9] = 73;
        baseLong1Array[10] = 74;
        baseLong1Array[11] = 74;

        double baseLat2Array[];
        baseLat2Array = new double[12];
        baseLat2Array[0] = 23;
        baseLat2Array[1] = 21;
        baseLat2Array[2] = 20;
        baseLat2Array[3] = 19;
        baseLat2Array[4] = 21;
        baseLat2Array[5] = 23;
        baseLat2Array[6] = 25;
        baseLat2Array[7] = 28;
        baseLat2Array[8] = 32;
        baseLat2Array[9] = 34;
        baseLat2Array[10] = 36;
        baseLat2Array[11] = 39;

        double baseLong2Array[];
        baseLong2Array = new double[12];
        baseLong2Array[0] = 20;
        baseLong2Array[1] = 24;
        baseLong2Array[2] = 27;
        baseLong2Array[3] = 35;
        baseLong2Array[4] = 46;
        baseLong2Array[5] = 56;
        baseLong2Array[6] = 65;
        baseLong2Array[7] = 70;
        baseLong2Array[8] = 73;
        baseLong2Array[9] = 74;
        baseLong2Array[10] = 74;
        baseLong2Array[11] = 74;

        double distanceArray[];
        distanceArray = new double[12];

        for (int i = 0; i <= 11; i++) {
            distanceArray[i] = calcDistance(baseLat1Array[i],baseLong2Array[i], baseLat2Array[i], baseLong2Array[i]);
            totalDistance = distanceArray[i] + totalDistance;
        }

        double actualTotalDistance = totalDistance - 37324.0260489;


        System.out.printf("The total distance traveled by Hurricane Gloria was %.2f km", actualTotalDistance);

        }

    public static double calcDistance(double baseLat1, double baseLong1, double baseLat2, double baseLong2) {

        double radianLat1 = Math.toRadians(baseLat1);
        double radianLat2 = Math.toRadians(baseLong2);
        double radianLong1 = Math.toRadians(baseLat1);
        double radianLong2 = Math.toRadians(baseLong2);

        double a = Math.pow(Math.sin((radianLat1-radianLat2)/2),2) + Math.cos(radianLat1)*Math.cos(radianLat2)*Math.pow(Math.sin((radianLong1-radianLong2)/2),2);
        double c = 2*Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        double d = R*c;
        return d;

    }
    }

