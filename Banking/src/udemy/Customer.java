package udemy;

import java.util.ArrayList;
public class Customer {
    private String name;
    private ArrayList<Double> transaction;

    public Customer(String name, double transaction) {
        this.name = name;
        this.transaction = new ArrayList<Double>();
        addTransaction(transaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transaction;
    }

    public void addTransaction(double transaction) {
        this.transaction.add(transaction);
    }
}
