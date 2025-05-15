package pkg20250514_trycacth;

public class Main
{
    public static void main(String[] args)
    {
        
        Estoque est = new Estoque (7);
        int p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0, p6 = 0;
        
        try
        {
            p1 = est.add(new Produto ("Jaqueta", 8, 149.99));
            p2 = est.add(new Produto ("Moletom", 8, 149.99));
            p3 = est.add(new Produto ("Calca", 10, 125.99));
            p4 = est.add(new Produto ("Shorts", 21, 89.99));
            p5 = est.add(new Produto ("T-Shirt", 25, 99.99));
            p6 = est.add(new Produto ("Regata", 7, 45.99));
        }
        catch(Exception exc)
        {
            System.out.println(exc.getMessage());
        }
        
        try
        {
            est.incUnits(1, 15);
            est.incUnits(2, 10);
            est.incUnits(3, 20);
            est.incUnits(4, 13);
            est.incUnits(5, 34);
            est.incUnits(6, 04);
            est.incUnits(9, 17);
        }
        catch(ArrayIndexOutOfBoundsException exc)
        {
            System.out.println(exc.getMessage());
        }
        est.listAll();
        
    }
    
}

