package seminars.seminar2;

public class MagicGenerator extends ItemFabric {
    @Override
    public IGameItem createItem() {
        return new MagicReward();
    }
}
