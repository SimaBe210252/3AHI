public class RobotDealer extends SpaceTrader{
    int processingPower;
    public RobotDealer(String name,int credits, int processingPower){
        this.credits = credits;
        this.name = name;
        this.processingPower = processingPower;
    }
    String presentYourself(){
        return name + " Robot";
    }
    boolean trade(int offer) {
        return offer < processingPower;
    }
}
