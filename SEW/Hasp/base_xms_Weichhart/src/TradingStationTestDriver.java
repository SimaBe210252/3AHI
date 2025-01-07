public class TradingStationTestDriver {
    public static void main(String[] args) {
        SpaceTrader[] stArr = new SpaceTrader[3];

        stArr[0] = new HumanMerchant("a",1);
        stArr[1] = new AlienMerchant("a",1,2);
        stArr[2] = new RobotDealer("a",2,10);

        TradingStation ts = new TradingStation(stArr);

        ts.simulateTradingRound(10);
        System.out.println(ts.findTraderByName("a Alien",0).presentYourself());
        System.out.println(ts.findMostProfitalTrader().presentYourself());
    }
}
