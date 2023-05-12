package HybridVehicleCostTracker;

public class CostView {
        public void printCostDetails(String type, double cost) {
            System.out.println("HybridVehicleCostTracker.Cost of " + type + ": " + cost);
        }

        public void printTotalCost(double totalCost) {
            System.out.println("Total HybridVehicleCostTracker.Cost: " + totalCost);
        }

        public void printNetCost(double netCost) {
            System.out.println("Net HybridVehicleCostTracker.Cost: " + netCost);
        }
    }
