package homeworks.homework2;

public class FoodGenerator extends ItemFabric{
    @Override
    public IGameItem createItem() {
        return new FoodReward();
    }
}
