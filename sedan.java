package CarBillAppli;
public class sedan extends GenericCar {

    void initRepairList() {
        RepairList.put("BS01", 4000);
        RepairList.put("EP01", 8000);
        RepairList.put("CP01", 4000);
        RepairList.put("BF01", 1500);
        RepairList.put("GP01", 6000);
    }

    @Override
    void BasicService() {
        totalCost += 4000;
    }

    @Override
    void BrakeFixing() {
        totalCost += 1500;
    }

    @Override
    void ClutchProblem() {
        totalCost += 4000;
    }

    @Override
    void EngineProblem() {
        totalCost += 8000;
    }

    @Override
    void GearProblem() {
        totalCost += 6000;
    }
}
