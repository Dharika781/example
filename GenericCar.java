package CarBillAppli;
import java.util.*;

abstract class GenericCar {
    Scanner sc = new Scanner(System.in);
    protected double totalCost;
    HashMap<String, Integer> RepairList;

    abstract void BasicService();

    abstract void EngineProblem();

    abstract void ClutchProblem();

    abstract void BrakeFixing();

    abstract void GearProblem();

    abstract void initRepairList();

    void printTotalCost() {
        System.out.println("\nPlease enter any additional costs:");
        totalCost += sc.nextDouble();
        System.out.println("\nThe total payable amount is :" + totalCost);
    }
}