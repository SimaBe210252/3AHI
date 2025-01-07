public abstract class SpaceTrader extends Negotiator {
    String name;
    int credits;
    String presentYourself(){
        return name;
    }
    int showRiches(){
        return credits;
    }
}

