public class TestAccount {
    public static void main(String[] args) {
        
        Account acc1 = new Account("ACC123", 5000);
        Account acc2 = new Account("ACC456", 4000);

        
        System.out.println("Initial balance of Acc1: $" + acc1.getBalance());
        System.out.println("Initial balance of Acc2: $" + acc2.getBalance());

        
        acc1.transfer(1000, acc2);

        
        System.out.println("After transfer:");
        System.out.println("Balance of Acc1: $" + acc1.getBalance());
        System.out.println("Balance of Acc2: $" + acc2.getBalance());
    }
}
