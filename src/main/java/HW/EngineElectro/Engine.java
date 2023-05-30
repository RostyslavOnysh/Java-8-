package HW.EngineElectro;

public class Engine {
    private EngineType engineType;

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Engine {" + "engineType = " + engineType + '}';
    }
}
