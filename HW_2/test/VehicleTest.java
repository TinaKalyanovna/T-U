package HW_2.test;

import HW_2.Carr;
import HW_2.Motorcycle;
import HW_2.Vehicle;



class vehicleTest {
    //    класс служит для проверки методов класса Vehicle
    private Carr car;
    private Motorcycle motorcycle;

    @BeforeEach
    void setUp() {
        car = new Carr("Bentley", "Continental GT", 2019);
        motorcycle = new Motorcycle("Honda", "GL1800 Gold Wing", 2016);
    }

    @AfterEach
    void tearDown() {
        car = null;
        motorcycle = null;
    }

    @Test
    @DisplayName("Проверка принадлежности машины к транспортным средствам")
    void testCarIsInstanceOfVehicle() {
        assertTrue(car instanceof Vehicle);
    }

    @Test
    @DisplayName("Проверка что машина создается с 4 колесами")
    void CarHasHasFourWheels() {
        assertEquals(car.getNumWheels(), 4);
    }

    @Test
    @DisplayName("Проверка что мотоцикл создается с 2 колесами")
    void MotorcycleHasHasTwoWheels() {
        assertEquals(motorcycle.getNumWheels(), 2);
    }

    @Test
    @DisplayName("Проверка что машина развивает скорость 60 в режиме тестового вождения")
    void testDriveCar() {
        car.testDrive();
        assertEquals(car.getSpeed(), 60);
    }

    @Test
    @DisplayName("Проверка что мотоцикл развивает скорость 75 в режиме тестового вождения")
    void testDriveMotorcycle() {
        motorcycle.testDrive();
        assertEquals(motorcycle.getSpeed(), 75);
    }

    @Test
    @DisplayName("Проверка что машина правильно паркуется")
    void CarPark() {
        car.testDrive();
        car.park();
        assertEquals(car.getSpeed(), 0);
    }

    @Test
    @DisplayName("Проверка что мотоцикл правильно паркуется")
    void MotorcyclePark() {
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(motorcycle.getSpeed(), 0);
    }
}
