package HW.EngineElectro;

import java.util.function.Predicate;

public class CheckElectricEngine implements Predicate<Engine>{
    @Override
    public boolean test(Engine engine) {
        return engine.getEngineType() == EngineType.ELECTRIC;
    }
}

