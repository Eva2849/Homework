package org.itstep.task05;

import org.itstep.task04.EmployeeAndTugrik;

import java.util.Locale;

public class EmployeeAndOffshore extends EmployeeAndTugrik {
    private boolean inOffshore;

    public EmployeeAndOffshore(String fullName, String paymentType, double payment,
                               boolean hasChild, boolean inOffshore) {
        super(fullName, paymentType, payment, hasChild);
        this.inOffshore = inOffshore;
        if (inOffshore) {
            setTax(0);
        }
    }

    public EmployeeAndOffshore(String fullName, String paymentType, double payment, boolean hasChild) {
        super(fullName, paymentType, payment, hasChild);
    }

    public EmployeeAndOffshore(String fullName, String paymentType, double payment) {
        super(fullName, paymentType, payment);
    }

    public boolean isInOffshore() {
        return inOffshore;
    }

    public void setInOffshore(boolean inOffshore) {
        this.inOffshore = inOffshore;
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
