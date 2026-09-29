import com.xworkz.commercialBuilding.*;
import commercialBuilding.CommercialBuilding;

public class CommercialBuildingRunner {
    public static void main(String[] args) {
        //abstraction
        CommercialBuilding commercialBuilding= new HariSuperSandwich();
        commercialBuilding.doBusiness();

        CommercialBuilding commercialBuilding1 =new Watch();
        commercialBuilding1.doBusiness();

        CommercialBuilding commercialBuilding2 =new FlyingMachine();
        commercialBuilding2.doBusiness();

        CommercialBuilding commercialBuilding3 = new ToyShop();
        commercialBuilding3.doBusiness();

        CommercialBuilding commercialBuilding4 =new Footwear();
        commercialBuilding4.doBusiness();
    }
}
