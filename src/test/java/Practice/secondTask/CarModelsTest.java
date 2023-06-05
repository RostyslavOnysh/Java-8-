package Practice.secondTask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.List;


public class CarModelsTest {
        private static final String NEW_LIST_REGEX = ".*if.*|.*for.*|.*while.*|.*newArrayList.*|.*newLinkedList.*";
        private static String resultCode;

    @BeforeClass
    public static void beforeClass() {
        resultCode = CarModels.class.getSimpleName();
    }

        @Test
        public void getCarModels_oneCarAfterYear() {
            Car mini = new Car(1956, "Mini");
            Assert.assertEquals(String.format("The result should be \"%s\" for the input list with one car made after 1955\n",
                            List.of(mini.getModel())), List.of("Mini"),
                    CarModels.getCarModels(List.of(mini)));
        }

        @Test
        public void getCarModels_twoCarsAfterYear() {
            Car fordMustang = new Car(1964, "Ford Mustang");
            Car rangeRover = new Car(1970, "Range Rover");
            Assert.assertEquals(String.format("The result should be \"%s\" for the input list with two cars made after 1955\n",
                            List.of(fordMustang.getModel(), rangeRover.getModel())), List.of("Ford Mustang", "Range Rover"),
                    CarModels.getCarModels(List.of(fordMustang, rangeRover)));
        }

        @Test
        public void getCarModels_threeCars() {
            Car morrisManor = new Car(1948, "Morris Minor");
            Car pontiacSport = new Car(1989, "Pontiac Trans Sport");
            Car renaultEspace = new Car(1984, "Renault Espace");
            Assert.assertEquals(String.format("The result should be \"%s\" for the input list with two cars made after " +
                            "1955 and one car before\n", List.of(morrisManor.getModel(), pontiacSport.getModel(), renaultEspace.getModel())),
                    List.of("Pontiac Trans Sport", "Renault Espace"),
                    CarModels.getCarModels(List.of(morrisManor, pontiacSport, renaultEspace)));
        }

        @Test
        public void getCarModels_emptyFilteredResult() {
            Car ford = new Car(1932, "Ford V8");
            Car bugatti = new Car(1934, "Bugatti Type 57");
            Car volkswagenBeetle = new Car(1938, "Volkswagen Beetle");
            Assert.assertEquals(String.format("The result should be \"%s\" for the input list with cars made before 1955\n",
                            List.of(ford.getModel(), bugatti.getModel(), volkswagenBeetle.getModel())), List.of(),
                    CarModels.getCarModels(List.of(ford, bugatti, volkswagenBeetle)));
        }

        @Test
        public void getCarModels_emptyList() {
            Assert.assertEquals(String.format("The result should be an empty list \"%s\" for the empty input list\n",
                    List.of()), List.of(), CarModels.getCarModels(List.of()));
        }

        @Test
        public void solution_containsHardcoding() {
            Assert.assertEquals("You should not create a List by yourself or use loops. Use Stream API methods.\n",
                    false, resultCode.matches(NEW_LIST_REGEX));
        }
    }