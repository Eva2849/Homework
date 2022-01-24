package org.itstep.task02;

import org.itstep.PaymentTypes;
import org.itstep.task01.Employee;

import java.util.Locale;

public class EmployeeAndTax extends Employee {
    private int tax;

    public EmployeeAndTax(String fullName, String paymentType, int payment, int tax) {
        super(fullName, paymentType, payment);
        this.tax = tax;
    }

    public int getTax() {
        return tax;
    }

    @Override
    public void setPaymentType(String paymentType) {
        if (paymentType.equals(PaymentTypes.HOURLY)) {
            tax = 20;
        } else {
            tax = 15;
        }
    }

    public double getPaymentWithTax(double payment) {
        return payment - payment * (tax / 100.0);
    }

    @Override
    public String toString() {
        Locale.setDefault(Locale.US);
        return String.format("%-8s | %8s%s | %-11s | %.1f", getFullName(), getTax(),
                "%", getPayment(), getPaymentWithTax(getPayment()));
    }
}
