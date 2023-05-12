package HybridVehicleCostTracker;

import HybridVehicleCostTracker.Cost;

public class CostController {
        private Cost model;
        private CostView view;

        public CostController(Cost model, CostView view) {
            this.model = model;
            this.view = view;
        }

        public void setPartsCost(double partsCost) {
            model.setPartsCost(partsCost);
        }

        public void setLaborCost(double laborCost) {
            model.setLaborCost(laborCost);
        }

        public void setSavings(double savings) {
            model.setSavings(savings);
        }

        public void updateView() {
            view.printCostDetails("Parts", model.getPartsCost());
            view.printCostDetails("Labor", model.getLaborCost());
            view.printCostDetails("Savings", model.getSavings());
            view.printTotalCost(model.getTotalCost());
            view.printNetCost(model.getNetCost());
        }
    }