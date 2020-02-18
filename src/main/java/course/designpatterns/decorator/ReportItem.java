package course.designpatterns.decorator;

import java.time.LocalDate;

public class ReportItem {
    private int saleId;
    private String customerName;
    private LocalDate date;
    private double amount;

    public ReportItem(int saleId, String customerName, LocalDate date, double amount) {
        this.saleId = saleId;
        this.customerName = customerName;
        this.date = date;
        this.amount = amount;
    }

    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
