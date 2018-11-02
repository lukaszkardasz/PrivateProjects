package training.oop.manufacter;

class ProductionLine {
    private static Car[] cars = new Car[3];

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Production stated");

        for (int i = 0; i < 2; i++) {
            Car car = new Car();
            System.out.println(car);
            car.workTime();
        }
        ////diesel engine in tesla car
        Car car = new Car("Blue", "Tesla", "S", 2017,
                CarSortOf.SEDAN, 4);
        System.out.println(car);

        Engine engine = new DieselEngine(110, 1.9);
        car.setEngine(engine);
        System.out.println(car.getEngine());
        cars[0] = car;

        ////gas engine in mercedes car
        car = new Car("White", "Merceses-Benz", "C300", 2017,
                CarSortOf.SEDAN, 5);
        System.out.println(car);

        engine = new GasEngine(264, 3.0);
        car.setEngine(engine);
        System.out.println(car.getEngine());
        ((GasEngine) engine).activatedLpgSystem();
        System.out.println(car.getEngine());
        cars[1] = car;

        ////eclectronic car
        car = new Car("Green", "Nissan", "Leaf",
                2018, CarSortOf.COUPE, 2);
        car.setEngine(new ElectroEngine(100));
        System.out.println(car);
        System.out.println(car.getEngine());
        cars[2] = car;

        System.out.println("Production finished");

        System.out.println("Print only ecologic cars");
        for (Car c : cars) {
            Engine e = c.getEngine();
            if (!(e instanceof Catalyst)) {
                System.out.println(c);
                System.out.println(e);
            }
        }

        System.out.println("Run test - start");
        car.workTime();
        car.start();
        Thread.sleep(1300);
        car.workTime();
        Thread.sleep(1690);
        car.stop();
        car.workTime();
        System.out.println("Run test - stop");
    }
}
