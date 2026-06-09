class EarthVolumeCalculator {
    public static void main(String[] args) {
        double earthRadiusKmA = 6378;
        double piA = 3.141592653589793;
        double volumeKmCubicA = (4.0 / 3.0) * piA * earthRadiusKmA * earthRadiusKmA * earthRadiusKmA;
        double kmToMilesFactorA = 0.621371;
        double earthRadiusMilesA = earthRadiusKmA * kmToMilesFactorA;
        double volumeMilesCubicA = (4.0 / 3.0) * piA * earthRadiusMilesA * earthRadiusMilesA * earthRadiusMilesA;

        System.out.println("The volume of earth in cubic kilometers is " + volumeKmCubicA + " and cubic miles is " + volumeMilesCubicA);
    }
}
