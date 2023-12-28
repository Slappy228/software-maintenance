public class Pizza {
    private String base;
    private String topping;
    private boolean baked;
    private boolean packed;
    private double cost;

    // Конструктор приватний, щоб заборонити створення об'єкта без використання будівельника
    private Pizza() {
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public boolean isBaked() {
        return baked;
    }

    public void setBaked(boolean baked) {
        this.baked = baked;
    }

    public boolean isPacked() {
        return packed;
    }

    public void setPacked(boolean packed) {
        this.packed = packed;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public static class PizzaBuilder {
        private Pizza pizza;

        public PizzaBuilder() {
            pizza = new Pizza();
        }

        public PizzaBuilder setBase(String base) {
            pizza.base = base;
            return this;
        }

        public PizzaBuilder setTopping(String topping) {
            pizza.topping = topping;
            return this;
        }

        public PizzaBuilder setBaked(boolean baked) {
            pizza.baked = baked;
            return this;
        }

        public PizzaBuilder setPacked(boolean packed) {
            pizza.packed = packed;
            return this;
        }

        public PizzaBuilder setCost(double cost) {
            pizza.cost = cost;
            return this;
        }

        public Pizza build() {
            return pizza;
        }
    }
}
