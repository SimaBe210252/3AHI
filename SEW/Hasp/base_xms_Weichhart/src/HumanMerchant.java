public class HumanMerchant extends SpaceTrader{
    public HumanMerchant(String name,int credits){
        this.credits = credits;
        this.name = name;
    }
    String presentYourself(){
        return name + " Human";
    }

    boolean trade(int offer) {
        return offer >= 0;
    }
}
