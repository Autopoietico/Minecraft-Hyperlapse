/*
 Minecraft Hyperlapse Command Creator V1.1

 Create by Autopoietico:

 Github: https://github.com/Autopoietico
 Twitter: https://twitter.com/AutopoieticoLP
 Youtube: https://www.youtube.com/user/SrAutopoietico/
 */

package cod;

public class Calc {

    public static int getHopperClockTicks(int days, int hours, int minutes) {

        int totalHours, totalMinutes;

        double hopperClockTicks;

        totalHours = days * 24 + hours;

        totalMinutes = (totalHours * 60) + minutes;

        hopperClockTicks = totalMinutes * 80;

        return (int) hopperClockTicks;
    }
    
    public static int getCommandBlockClockTicks(int days, int hours, int minutes) {

        int totalHours, totalMinutes;

        double commandBlockClockTicks;

        totalHours = days * 24 + hours;

        totalMinutes = (totalHours * 60) + minutes;

        commandBlockClockTicks = totalMinutes * 1200;

        return (int) commandBlockClockTicks;
    }

    public static double getDistanceBetweenTwoPoints2D(double x1, double z1, double x2, double z2) {

        double distance;

        distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(z2 - z1, 2));

        return distance;
    }

    public static double getDistanceBetweenTwoPoints3D(double x1, double y1, double z1, double x2, double y2, double z2) {

        double distance;

        distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));

        return distance;
    }

    public static double getHorizontalAngle(double x1, double z1, double xC, double zC) {

        double distanceX, distanceZ, angle;

        distanceX = xC - x1;

        distanceZ = zC - z1;

        if (distanceZ > 0) {

            angle = -Math.atan(distanceX / distanceZ);
        } else if (distanceZ < 0 && distanceX < 0) {

            angle = Math.PI - Math.atan(distanceX / distanceZ);
        } else if (distanceZ < 0 && distanceX > 0) {

            angle = -Math.PI - Math.atan(distanceX / distanceZ);
        } else if (distanceX == 0 && distanceZ < 0) {

            angle = -Math.PI;
        } else if (distanceX > 0 && distanceZ == 0) {

            angle = -Math.PI / 2;
        } else if (distanceX < 0 && distanceZ == 0) {

            angle = Math.PI / 2;
        } else {

            angle = 0;
        }

        return angle;
    }

    public static double getHorizontalAngle2Points1Center(double x1, double z1, double x2, double z2, double xC, double zC) {

        double angleA, angleB, horizontalAngle;

        angleA = Calc.getHorizontalAngle(x1, z1, xC, zC);

        angleB = Calc.getHorizontalAngle(x2, z2, xC, zC);

        horizontalAngle = angleB - angleA;

        if (horizontalAngle > Math.PI) {

            horizontalAngle = -(Math.PI + angleA + Math.PI - angleB);
        } else if (horizontalAngle < -Math.PI) {

            horizontalAngle = (Math.PI - angleA + Math.PI + angleB);
        }

        return horizontalAngle;
    }

    public static double getHorizontalAngle2Points2Centers(double x1, double z1, double xC1, double zC1, double xC2, double zC2) {

        double angleA, angleB, horizontalAngle;

        angleA = Calc.getHorizontalAngle(x1, z1, xC1, zC1);

        angleB = Calc.getHorizontalAngle(x1, z1, xC2, zC2);

        horizontalAngle = angleB - angleA;

        if (horizontalAngle > Math.PI) {

            horizontalAngle = -(Math.PI + angleA + Math.PI - angleB);
        } else if (horizontalAngle < -Math.PI) {

            horizontalAngle = (Math.PI - angleA + Math.PI + angleB);
        }

        return horizontalAngle;
    }
    
    public static double getHorizontalAngle2Points2Centers(double x1, double z1, double x2, double z2, double xC1, double zC1, double xC2, double zC2) {

        double angleA, angleB, horizontalAngle;

        angleA = Calc.getHorizontalAngle(x1, z1, xC1, zC1);

        angleB = Calc.getHorizontalAngle(x2, z2, xC2, zC2);

        horizontalAngle = angleB - angleA;

        if (horizontalAngle > Math.PI) {

            horizontalAngle = -(Math.PI + angleA + Math.PI - angleB);
        } else if (horizontalAngle < -Math.PI) {

            horizontalAngle = (Math.PI - angleA + Math.PI + angleB);
        }

        return horizontalAngle;
    }

    public static double convertRadiansToDegrees(double value) {

        return (value * 180) / Math.PI;
    }

    public static double getVerticalAngle(double x1, double y1, double z1, double xC, double yC, double zC) {

        double horizontalDistance, verticalDistance, angle;

        horizontalDistance = Math.abs(Calc.getDistanceBetweenTwoPoints2D(x1, z1, xC, zC));
        //System.out.println("DistanciaHor: " + distanciaHor);
        verticalDistance = yC - y1;
        //System.out.println("DistanciaVer: " + distanciaVer);

        angle = -Math.atan(verticalDistance / horizontalDistance);

        return angle;
    }

    public static double getVerticalAngle2Points1Center(double x1, double y1, double z1, double x2, double y2, double z2, double xC, double yC, double zC) {

        double anguloA, anguloB, anguloVertical;

        anguloA = Calc.getVerticalAngle(x1, y1, z1, xC, yC, zC);

        anguloB = Calc.getVerticalAngle(x2, y2, z2, xC, yC, zC);

        anguloVertical = anguloB - anguloA;

        return anguloVertical;
    }
    
    public static double getVerticalAngle2Points2Centers(double x1, double y1, double z1, double xC1, double yC1, double zC1, double xC2, double yC2, double zC2) {

        double anguloA, anguloB, anguloVertical;

        anguloA = Calc.getVerticalAngle(x1, y1, z1, xC1, yC1, zC1);

        anguloB = Calc.getVerticalAngle(x1, y1, z1, xC2, yC2, zC2);

        anguloVertical = anguloB - anguloA;

        return anguloVertical;
    }

    public static double getVerticalAngle2Points2Centers(double x1, double y1, double z1, double x2, double y2, double z2, double xC1, double yC1, double zC1, double xC2, double yC2, double zC2) {

        double anguloA, anguloB, anguloVertical;

        anguloA = Calc.getVerticalAngle(x1, y1, z1, xC1, yC1, zC1);

        anguloB = Calc.getVerticalAngle(x2, y2, z2, xC2, yC2, zC2);

        anguloVertical = anguloB - anguloA;

        return anguloVertical;
    }
}
