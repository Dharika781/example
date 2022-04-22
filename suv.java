package CarBillAppli;
public class suv extends GenericCar {
    
    void initRepairList() {
        RepairList.put("BS01", 5000);
        RepairList.put("EP01", 10000);
        RepairList.put("CP01", 6000);
        RepairList.put("BF01", 2500);
        RepairList.put("GP01", 8000);
    }

    @Override
    void BasicService() {
        totalCost += 5000;
    }

    @Override
    void BrakeFixing() {
        totalCost += 2500;
    }

    @Override
    void ClutchProblem() {
        totalCost += 6000;
    }

    @Override
    void EngineProblem() {
        totalCost += 10000;
    }

    @Override
    void GearProblem() {
        totalCost += 8000;
    }
}
