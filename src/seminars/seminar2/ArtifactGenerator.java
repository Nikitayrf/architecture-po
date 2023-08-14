package seminars.seminar2;

public class ArtifactGenerator extends ItemFabric{
    @Override
    public IGameItem createItem() {
        return new ArtifactReward();
    }
}
