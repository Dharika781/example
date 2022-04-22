package CarBillAppli;
import java.util.HashMap;
import java.util.Scanner;

public class Biller {

    //static HashMap<String, GenericCar> objectList;
    //static HashMap<String, Runnable> RepairList;

    static void init() {
        objectList.put("sedan", new sedan());
        objectList.put("suv", new suv());
        objectList.put("hatchback", new hatchback());
    }

    // static void initRepairList(GenericCar obj) {
    //     RepairList.put("BS01", obj::BasicService);
    //     RepairList.put("EP01", obj::EngineProblem);
    //     RepairList.put("CP01", obj::ClutchProblem);
    //     RepairList.put("BF01", obj::BrakeFixing);
    //     RepairList.put("GP01", obj::GearProblem);
    // }

    // static void Cost(hatchback obj) {
    //     System.out.println("\nhatchback called");
    // }
    
    // static void Cost(sedan obj) {
    //     System.out.println("\nsedan called");
    // }

    // static void Cost(suv obj) {
    //     System.out.println("\nsuv called");
    // }

    public static void main(String[] args) {
        objectList = new HashMap<>();
        RepairList = new HashMap<>();
        init();
        Scanner sc = new Scanner(System.in);
        System.out.print("\nType of car: ");
        String carType = sc.nextLine();
        carType = carType.toLowerCase();
        GenericCar obj = objectList.get(carType);
        obj.RepairList=new HashMap<>();
        obj.initRepairList();
        // initRepairList(obj);
        System.out.print("\nEnter Service code: ");
        String repairs[] = sc.nextLine().split(",");
        for (String s : repairs) {
            s = s.replaceAll("\s", "");
            s = s.toUpperCase();
            if (obj.RepairList.containsKey(s))
                obj.totalCost += obj.RepairList.get(s);
            //Runnable r = RepairList.get(s);
            // if (r == null) {
            //     System.err.println("R is null");
            // }
            // else
            //     r.run();
        }
        System.out.println(obj.totalCost);
        obj.printTotalCost();
        sc.close();
    }
}
