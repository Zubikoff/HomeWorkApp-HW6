package lesson_9;

public class Payment {
    public String paymentMethod;
    public String paymentIdentifier;
    public PurchaseItem[] purchases;

    public class PurchaseItem {
        public final String itemName;
        public int itemCount;

        public PurchaseItem(String itemName, int itemCount) {
            this.itemName = itemName;
            this.itemCount = itemCount;
        }
    }

    public Payment(String paymentMethod, String paymentIdentifier) {
        this.paymentMethod = paymentMethod;
        this.paymentIdentifier = paymentIdentifier;
    }
}
