package Car;

public class WagonType extends VehicleTypeByBodyTypes{
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.WAGON.name();
    }
}
