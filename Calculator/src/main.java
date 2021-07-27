
public class main {
    public static void main(String[] args)
    {
        int num1 = 8;
        int num2 = 2;
        double num3 = 6.2;
        double num4 = 3.5;
        double percent = 10;
        double exchangeRatesUAHtoUSD=27.1002;
        double exchangeRatesUAHtoEUR=31.9824;
        double exchangeRatesUSDtoUAH=26.9100;
        double exchangeRatesEURtoUAH=31.6413;

        BasicCalc basicCalc=new BasicCalc();
        FinCalc finCalc=new FinCalc(exchangeRatesUAHtoUSD,exchangeRatesUAHtoEUR,exchangeRatesUSDtoUAH,exchangeRatesEURtoUAH);
        IngenCalc ingenCalc=new IngenCalc();

        System.out.println("Result of sum: " + basicCalc.plus(num1, num2));
        System.out.println("Result of minus: " + finCalc.minus(num1, num2));
        System.out.println("Result of remainder: " + finCalc.divide(num1, num2));
        System.out.println("Result of multiply: " + ingenCalc.multiply(num3, num4));
        System.out.println("Result of divider: " + ingenCalc.divide(num3, num4));

        System.out.println("Result of sin: " + ingenCalc.operationSin(num1));
        System.out.println("Result of cos: " + ingenCalc.operationCos(num1));
        System.out.println("Result of tan: " + ingenCalc.operationTan(num1));
        System.out.println("Result of atan: " + ingenCalc.operationAtan(num1));
        System.out.println("Result of log: " + ingenCalc.operationLog(num1));
        System.out.println("Result of sqrt: " + ingenCalc.operationSqrt(num1));

        System.out.println("Result of percent: " + finCalc.percent(num1,percent));
        System.out.println("Result of UAHtoUSD: " + finCalc.UAHtoUSD(num1));
        System.out.println("Result of UAHtoEUR: " + finCalc.UAHtoEUR(num1));
        System.out.println("Result of USDtoUAH: " + finCalc.USDtoUAH(num1));
        System.out.println("Result of EURtoUAH: " + finCalc.EURtoUAH(num1));




    }
}
