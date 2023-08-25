package homeworks.homework2;

public class GoldGenerator extends ItemFabric{
    @Override
    public IGameItem createItem() {  // createItem создаёт Product, то есть он создаёт gem в сундуке
        return new GoldReward();
    }
}
