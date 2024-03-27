package Car;

public class Main {
    public static void main(String[] args) {
        AdsService adsService = new AdsService();
        VehicleAd volvoAd = new VehicleAd("Volvo", "123", new PassengerType(),
                new SedanType(), new DieselType());
        VehicleAd kamazAd = new VehicleAd("Kamaz", "45", new TruckType(),
                new PickupType(), new DieselType());
        VehicleAd carAd = new VehicleAd("Camry", "23",new CarType(),new SedanType(),new ElectricType());

        VehicleAd sedanAd = new VehicleAd("Sedan", "56", new CarType(), new SedanType(), new HybridType());

        VehicleAd petrolAd = new VehicleAd("Petrol","43", new PassengerType(), new PetrolType(), new DieselType());

        adsService.setAdList(new VehicleAd[] {volvoAd, kamazAd, carAd, sedanAd, petrolAd});

        adsService.filterByVehicleTypeByPurpose(new PassengerType());

        adsService.filterByVehicleTypeByPurpose(new TruckType());

        adsService.filterByVehicleTypeByFuelTypes(new DieselType());


        //TODO Создайте объявление с типами CAR, SEDAN, PETROL и отфильтруйте объявления с бензиновым топливом

    }
}
