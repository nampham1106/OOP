package lab13.builder.excercise1.builders;

import lab13.builder.excercise1.cars.CarType;
import lab13.builder.excercise1.cars.Engine;
import lab13.builder.excercise1.cars.GPS;
import lab13.builder.excercise1.cars.TripComputer;

public interface Builder {
    Builder setCarType(CarType carType);
    Builder reset();
    Builder setSeats(int seats);
    Builder setEngine(Engine engine);
    Builder setTripComputer(TripComputer tripComputer);
    Builder setGPS(GPS gps);
}
