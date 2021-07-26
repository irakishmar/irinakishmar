public class FinCalc extends BasicCalc{

    FinCalc(double UAHtoUSD,double UAHtoEUR,double USDtoUAH,double EURtoUAH)
    {
        exchangeRatesUAHtoUSD = UAHtoUSD;
        exchangeRatesUAHtoEUR = UAHtoEUR;
        exchangeRatesUSDtoUAH = USDtoUAH;
        exchangeRatesEURtoUAH = EURtoUAH;
    }
    private double exchangeRatesUAHtoUSD;
    private double exchangeRatesUAHtoEUR;
    private double exchangeRatesUSDtoUAH;
    private double exchangeRatesEURtoUAH;


    double percent(double num1, double percent)
    {
        return percent/100*num1;
    }
    double UAHtoUSD(double num1)
    {
        return num1/exchangeRatesUAHtoUSD;
    }
    double UAHtoEUR(double num1)
    {
        return num1/exchangeRatesUAHtoEUR;
    }
    double USDtoUAH(double num1)
    {
        return num1/exchangeRatesUSDtoUAH;
    }
    double EURtoUAH(double num1)
    {
        return num1/exchangeRatesEURtoUAH;
    }
    double divide(int num1,int  num2)
    {
        if (num2 == 0)
        {
            System.out.println("Exception: null!");
            return 0;
        } else
        {
            return num1%num2;
        }

    }
}
