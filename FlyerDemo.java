import flyers.*;

class FlyerDemo {
  public static void main(String[] args) {

        Flyer flyer1 = new flyers.Drone();
        Flyer flyer2 = new flyers.Drone();
        Flyer flyer3 = new flyers.Jet();
        Flyer flyer4 = new flyers.Jet();

        // Invoke methods on those objects
        flyer1.changeAltitude(80);
        flyer1.speedUp(12);
        flyer1.printStates();

        flyer2.changeAltitude(90);
        flyer2.speedUp(14);
        flyer2.changeAltitude(100);
        flyer2.speedUp(18);
        flyer2.printStates();
  }
}
