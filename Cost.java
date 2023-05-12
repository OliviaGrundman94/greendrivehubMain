package HybridVehicleCostTracker;

public class Cost {
        private double partsCost;
        private double laborCost;
        private double savings;

        public Cost() {
            this.partsCost = 0;
            this.laborCost = 0;
            this.savings = 0;
        }

        public double getPartsCost() {
            return partsCost;
        }

        public void setPartsCost(double partsCost) {
            this.partsCost = partsCost;
        }

        public double getLaborCost() {
            return laborCost;
        }

        public void setLaborCost(double laborCost) {
            this.laborCost = laborCost;
        }

        public double getSavings() {
            return savings;
        }

        public void setSavings(double savings) {
            this.savings = savings;
        }

        public double getTotalCost() {
            return partsCost + laborCost;
        }

        public double getNetCost() {
            return getTotalCost() - savings;
        }
    }