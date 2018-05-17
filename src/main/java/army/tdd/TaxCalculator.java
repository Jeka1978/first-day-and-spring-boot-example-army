package army.tdd;

import lombok.Setter;

/**
 * @author Evgeny Borisov
 */
public class TaxCalculator {
    @Setter
    private MaamResolver maamResolver;

    public double withMaam(double price) {
        double maam = maamResolver.getMaam();
        return price * maam +price;

    }
}
