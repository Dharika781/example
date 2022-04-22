package CarBillAppli;
public class hatchback extends GenericCar {

    void initRepairList() {
        RepairList.put("BS01", 2000);
        RepairList.put("EP01", 5000);
        RepairList.put("CP01", 2000);
        RepairList.put("BF01", 1000);
        RepairList.put("GP01", 3000);
    }

    @Override
    void BasicService() {
        totalCost += 2000;
    }

    @Override
    void BrakeFixing() {
        totalCost += 1000;
        
    }

    @Override
    void ClutchProblem() {
        totalCost += 2000;
        
    }

    @Override
    void EngineProblem() {
        totalCost += 5000;
        
    }

    @Override
    void GearProblem() {
        totalCost += 3000;
        
    }
    
}
