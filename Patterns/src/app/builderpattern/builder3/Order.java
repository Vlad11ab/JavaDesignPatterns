package app.builderpattern.builder3;

public class Order {
    private final int id;
    private final int customerId;
    private final int amount;
    private final String shippingAddress;

    private Order(int id, int customerId, int amount, String shippingAddress) {
        this.id = id;
        this.customerId = customerId;
        this.amount = amount;
        this.shippingAddress = shippingAddress;
    }

    public static CustomerStep builder() {
        return new Builder();
    }

    public interface CustomerStep {
        AmountStep customerId(int customerId);
    }

    public interface AmountStep {
        OptionalStep amount(int amount);
    }

    public interface OptionalStep {
        OptionalStep id(int id);
        OptionalStep shippingAddress(String addr);
        Order build();
    }

    private static class Builder implements CustomerStep, AmountStep, OptionalStep {
        private int id = 0;
        private int customerId;
        private int amount;
        private String shippingAddress = "";

        @Override
        public AmountStep customerId(int customerId) {
            this.customerId = customerId;
            return this;
        }

        @Override
        public OptionalStep amount(int amount) {
            this.amount = amount;
            return this;
        }

        @Override
        public OptionalStep id(int id) {
            this.id = id;
            return this;
        }

        @Override
        public OptionalStep shippingAddress(String addr) {
            this.shippingAddress = addr;
            return this;
        }

        @Override
        public Order build() {
            return new Order(id, customerId, amount, shippingAddress);
        }
    }

    public int getId() {
        return id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getAmount() {
        return amount;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    @Override
    public String toString() {
        return id + "," + customerId + "," + amount + "," + shippingAddress;
    }
}