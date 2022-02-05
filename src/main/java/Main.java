public class Main {

    public static void main(String[] args) {
        ConvertWrapper wrapper = new ConvertWrapper();
        String finalOutput = wrapper.convert(1, Currency.EUR, 10);
        System.out.println(finalOutput);
    }
}
