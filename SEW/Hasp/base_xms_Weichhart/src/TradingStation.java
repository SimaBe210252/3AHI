public class TradingStation {
    SpaceTrader[] traders = new SpaceTrader[100];
    int maxIndex = 0;
    TradingStation(SpaceTrader[] traders){
        for (SpaceTrader trader: traders) {
            addTrader(trader);
        }
    }
    boolean addTrader(SpaceTrader st){
        if (maxIndex >= 100) return false;
        traders[maxIndex] = st;
        maxIndex++;
        return true;
    }

    public SpaceTrader findMostProfitalTrader() {
        SpaceTrader maxTrader = traders[0];
        for (SpaceTrader trader: traders) {
            if (trader == null) return maxTrader;
            if (trader.credits >= maxTrader.credits){
                maxTrader = trader;
            }
        }
        return maxTrader;
    }
    public void simulateTradingRound(int offer) {
        for (SpaceTrader trader: traders) {
            if (trader == null) return;
            if(trader.trade(offer)){
                System.out.println(trader.presentYourself());
            }
        }
    }

    public SpaceTrader findTraderByName(String regex,int index){
        if (traders[index].presentYourself().matches(regex)){
            return traders[index];
        } else if (index >= 100) {
            return null;
        }
        return findTraderByName(regex,index +1);
    }
}
