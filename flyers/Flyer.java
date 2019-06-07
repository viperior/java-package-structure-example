package flyers;

abstract public class Flyer {
    private static int flyerCount = 0;
    int altitude = 0;
    int speed = 0;

    Flyer() {
        flyerCount++;
    }

    public int getFlyerCount() {
        return flyerCount;
    }

    public void changeAltitude(int newValue) {
         altitude = newValue;
    }

    public void speedUp(int increment) {
         speed = speed + increment;
    }

    public void decelerate(int decrement) {
         speed = speed - decrement;
    }

    public void printStates() {
         System.out.println("altitude:" +
             altitude + " speed:" +
             speed);
    }
}
