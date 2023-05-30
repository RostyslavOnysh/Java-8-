package HW.RandomColor;


import org.Java8P1.FunctionalInerface.FunctionalInterfaceInJDK.Supplier.Supplier;

import java.util.Random;

public class GetRandomColor implements  Supplier<String>{
    private static final String[] COLORS = {"red", "green", "blue", "yellow", "pink",
            "black", "white"};

    @Override
    public String get() {
        Random random = new Random();
        Supplier<String> colorSupplier = () -> COLORS[random.nextInt(COLORS.length)];
        String randomColorIs = colorSupplier.get();
        return randomColorIs;
    }
}