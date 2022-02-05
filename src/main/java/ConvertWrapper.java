public class ConvertWrapper {

    private Converter convert;

    public ConvertWrapper() {
      convert = new Converter();
    }

    public String convert(double amount, Currency currency,double fee){
        double convertedAmount = convert.convert(amount,currency,fee);
        String output = null;
        if(currency.equals(Currency.USD)){
            output = Double.toString(amount)+" EUR = "+ Double.toString(convertedAmount)+" "+currency.toString();
            return output;
        }
        else if(currency.equals(Currency.EUR)){
            output = Double.toString(amount)+" USD = "+ Double.toString(convertedAmount)+" "+currency.toString();
        }
        return output;
    }
}
