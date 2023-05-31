package HW.AutoFindWeight;


import java.util.function.Function;

public class FindAutoType implements Function<Integer, AutoType> {

    @Override
    public AutoType apply(Integer carWeight) {
        if (carWeight < 1500) {
            return AutoType.CAR;
        } else {
            return AutoType.TRUCK;
        }
    }
}