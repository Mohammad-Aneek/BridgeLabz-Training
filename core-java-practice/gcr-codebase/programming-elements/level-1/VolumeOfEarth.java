// Program to calculate the volume of Earth
public class VolumeOfEarth {

    static double getVolume(double radiusOfEarth){
        // Approximate value of PI
        final double PI = 3.14;

        // calculate and store the volume
        double volume = 4 / 3 * PI * radiusOfEarth * radiusOfEarth * radiusOfEarth;

        return volume;
    }

    static double kilometersToMiles(double distance){
        // convert and store the distance from kilometers to miles 
        double convertedDistance = distance * 1.6 ;
        
        return convertedDistance;
    }

    public static void main(String[] args) {
        // Radius of Earth in kilometers
        final int radiusOfEarth = 6378;

        // store the volume of earth in cubic kilometers
        final double volumeInKilometers = VolumeOfEarth.
            getVolume(radiusOfEarth);

        // store the volume of earth in cubic miles
        final double volumeInMiles = VolumeOfEarth.
            getVolume(kilometersToMiles(radiusOfEarth));

        // display the data 
        System.out.println("The volume of Earth in cubic kilometers is "+volumeInKilometers + " and cubic miles is " + volumeInMiles);


    }
}
