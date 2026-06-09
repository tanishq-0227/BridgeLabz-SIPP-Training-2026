class KilometerToMilesConverter {
    public static void main(String[] args) {
        double distanceInKmA = 10.8;
        double milesPerKmA = 1.6;
        double distanceInMilesA = distanceInKmA * milesPerKmA;

        System.out.println("The distance " + distanceInKmA + " km in miles is " + distanceInMilesA);
    }
}
