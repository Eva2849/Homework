package org.itstep.task04;

import org.itstep.task03.EmployeeAndChild;

import java.util.Locale;

public class EmployeeAndTugrik extends EmployeeAndChild {
    private double tugrikExchange;

    public EmployeeAndTugrik(String fullName, String paymentType, double payment, boolean hasChild) {
        super(fullName, paymentType, payment, hasChild);
    }

    public EmployeeAndTugrik(String fullName, String paymentType, double payment) {
        super(fullName, paymentType, payment);
    }

    public double getTugrikExchange() {
        return tugrikExchange;
    }

    public void setTugrikExchange(double tugrikExchange) {
        this.tugrikExchange = tugrikExchange;
    }

    @Override
    public String toString() {
        Locale.setDefault(Locale.US);
        if (getTugrikExchange() == 0) {
            return String.format("%-8s | %8s%s | %-11s | %.1f", getFullName(), (int) getTax(),
                    "%", getPayment(), getPaymentWithTax(getPayment()));
        } else {
            return String.format("%-8s | %8s%s | %-11s | %.1f / %.1f", getFullName(), (int) getTax(),
                    "%", getPayment(), getPaymentWithTax(getPayment()) / 2,
                    getPaymentWithTax(getPayment()) / 2 / getTugrikExchange());
        }
    }
}
