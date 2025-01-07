public class AlienMerchant extends SpaceTrader{
    int technologyPower;
    public AlienMerchant(String name,int credits, int technologyPower) {
        this.credits = credits;
        this.name = name;
        this.technologyPower = technologyPower;
    }
    String presentYourself(){
        return name + " Alien";
    }
    boolean trade(int offer) {
        return offer > technologyPower * 10;
    }
}
