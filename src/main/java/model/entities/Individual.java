package model.entities;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Individual extends TaxPayer {

    private double healthExpenditures;

    public Individual(String name, double annualIncome, double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
       if (getAnnualIncome() < 20000.0){
           return getAnnualIncome() * 0.15 - healthExpenditures * 0.50;
       }
       else {
           return getAnnualIncome() * 0.25 - healthExpenditures * 0.50;
       }
    }
}
