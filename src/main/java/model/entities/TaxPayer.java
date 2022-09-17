package model.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public abstract class TaxPayer {

    private String name;
    private double annualIncome;

    public abstract double tax();

}
