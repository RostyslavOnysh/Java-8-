package HW.RandomColor;

import java.util.function.BinaryOperator;

public class EngineCompare implements BinaryOperator<Integer> {
    @Override
    public Integer apply(Integer integer, Integer integer2) {
        return integer - integer2;
    }
}
