package model.entities;

public class Company extends TaxPayer{

    private int numberOfEmployees;


    @Override
    public double tax() {
        return 0;
    }
}
