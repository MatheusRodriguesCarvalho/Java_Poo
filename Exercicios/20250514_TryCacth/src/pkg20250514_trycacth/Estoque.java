package pkg20250514_trycacth;


public class Estoque 
{
   private ItemEstoqueInt estoque[];
   private int count;

    public Estoque(int max) 
    {
       estoque = new ItemEstoqueInt[max];
       this.count = 0;
    }
   
    public int add(ItemEstoqueInt item)
    {
        //if (count<estoque.length)
        {
            estoque[count] = item;
            this.count = count + 1;
            return count - 1;
        }
        //return -1;
    }
    
    public boolean incUnits(int index, int qtd)
    {
//        if(index < 0 || index >= count) return false;
        estoque[index].incUnits(qtd);
        return true;
    }
    
    public boolean decUnits(int index, int qtd)
    {
//        if(index < 0 || index >= count) return false;
        estoque[index].decUnits(qtd);
        return true;
    }
    
    public void listAll()
    {
        float valor = 0; 
        for(int i=0;i<count;i++)
        {
          estoque[i].print();
          Produto p;
          p = (Produto) estoque[i];
          valor = valor + p.getPrice()*p.getUnits();
        }
        System.out.println("Total Estoque: " + valor + "\n\n");
    }
}
