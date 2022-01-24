package org.itstep.task03;

import org.itstep.task02.EmployeeAndTax;

public class EmployeeAndChild extends EmployeeAndTax {
    private boolean hasChild;

    public EmployeeAndChild(String fullName, String paymentType, double payment) {
        super(fullName, paymentType, payment);
        if (!hasChild) {
            setTax(getTax() + 5);
        }
    }

    public EmployeeAndChild(String fullName, String paymentType, double payment, boolean hasChild) {
        super(fullName, paymentType, payment);
        this.hasChild = hasChild;
    }

    public boolean isHasChild() {
        return hasChild;
    }

    public void setHasChild(boolean hasChild) {
        this.hasChild = hasChild;
    }
}
