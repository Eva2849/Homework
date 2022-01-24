package org.itstep.task06;

import org.itstep.task05.EmployeeAndOffshore;

import java.util.Locale;

public class EmplyeeAndBonus extends EmployeeAndOffshore {
    private double workHours;

    public EmplyeeAndBonus(String fullName, String paymentType, double payment,
                           boolean hasChild, double workHours) {
        super(fullName, paymentType, payment, hasChild);
        this.workHours = workHours;
        if (workHours > 200) {
            setPayment(getPayment() + (getPayment() * 0.2));
        }
    }

    public EmplyeeAndBonus(String fullName, String paymentType, double payment, double workHours) {
        super(fullName, paymentType, payment);
        this.workHours = workHours;
        if (workHours > 200) {
            setPayment(getPayment() + (getPayment() * 0.2));
        }
    }

    public double getWorkHours() {
        return workHours;
    }

    public void setWorkHours(double workHours) {
        this.workHours = workHours;
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
