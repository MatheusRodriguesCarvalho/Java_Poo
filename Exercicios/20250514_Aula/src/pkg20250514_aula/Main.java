package pkg20250514_aula;

public class Main
{
    public static void main(String[] args)
    {
        int a = 10, b = 0, r = 0;
        
        try
        {
            r = a / b;
        }
        catch(ArithmeticException exc)
        {
            System.out.println(exc.getMessage());
        }
        
        System.out.println("Resultado:" + r);
    }
    
}
