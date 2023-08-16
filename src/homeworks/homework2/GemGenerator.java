package homeworks.homework2;

public class GemGenerator extends ItemFabric {
    @Override
    public IGameItem createItem() {
        return new GemReward();
    }
}
