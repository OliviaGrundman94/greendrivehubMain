package HybridVehicleCostTracker;
public class Main {
        public static void main(String[] args) {
            // Create a new Cost object
            Cost model = new Cost();

            // Create a new View to display the cost
            CostView view = new CostView();

            // Create a Controller to coordinate the model and view
            CostController controller = new CostController(model, view);

            // Define the costs and savings
            controller.setPartsCost(5000.0);
            controller.setLaborCost(2000.0);
            controller.setSavings(1500.0);

            // Update the view to display the costs and savings
            controller.updateView();
        }
    }
