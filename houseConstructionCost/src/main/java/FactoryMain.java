import com.gayathri.houseConstructionCost.*;


public class FactoryMain {
	public static void main(String[] args) {
    HouseFactory houseFactoryObject=new HouseFactory();
    HouseConstructionCost object=houseFactoryObject.getInstance("standard");
	object.calculatingTotalCost(100, "standard");
    System.out.println(object.totalCostOfHouse+"INR");
    }

}
