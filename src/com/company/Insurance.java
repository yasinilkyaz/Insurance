package com.company;

import java.util.Date;

public abstract class Insurance {
    private String insuranceName;
    private double insuranceFee;
    private Date insuranceStartDate;
    private Date insuranceDueDate;

    public double calculate() {
        return 0;
    }
}
