package com.pedalo.builder;

/**
 * 通用生成器接口
 */
public interface Builder {
    void setCarType(CarType carType);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);

    void builder();
}
