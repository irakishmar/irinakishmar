public class BasicCalc {


    int plus(int num1,int  num2)
    {
        return num1 + num2;
    }
    int minus(int num1, int num2 )
    {
        return num1-num2;
    }
    double divide(int num1,int  num2)
    {
        if (num2 == 0)
        {
            System.out.println("Exception: null!");
            return 0;
        } else
        {
            return num1/num2;
        }
    }
    int multiply(int num1,int  num2)
    {
        return num1*num2;
    }
    double plus(double num1,double  num2)
    {
        return num1 + num2;
    }
    double minus(double num1, double num2 )
    {
        return num1-num2;
    }
    double divide(double num1,double  num2)
    {
        if (num2 == 0)
        {
            System.out.println("Exception: null!");
            return 0;
        } else
        {
            return num1/num2;
        }

    }
    double multiply(double num1,double  num2)
    {
        return num1*num2;
    }
}
