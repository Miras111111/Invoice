package Car;

public class PetrolType extends VehicleTypeByBodyTypes{
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PETROL.name();
    }
}
