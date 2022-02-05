public class Converter implements ConversterService{

    @Override
    public double convert(double amount, Currency currency, double free) {
        double finalAmount =0;
        if(currency.equals(Currency.EUR)){
            finalAmount = amount * 0.87;
            return finalAmount;
        }
        else if(currency.equals(Currency.USD)){
            finalAmount = amount * 1.14;
            return finalAmount;
        }
        return finalAmount;
    }
}
