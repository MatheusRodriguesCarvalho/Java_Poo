package pkg20250514_trycacth;

public class Produto implements ItemEstoqueInt
{
    private String descricao;
    private int tamanho, estoque;
    private double preco;
   

    public Produto(String descricao, int tamanho, double preco) 
    {
        this.descricao = descricao;
        this.tamanho = tamanho;
        this.preco = preco;
        this.estoque = 0;
    }

    public String getDescricao() 
    {
        return descricao;
    }

    public void setDescricao(String descricao) 
    {
        this.descricao = descricao;
    }

    public int getTamanho() 
    {
        return tamanho;
    }

    public void setTamanho(int tamanho) 
    {
        this.tamanho = tamanho;
    }

    public int getEstoque() 
    {
        return estoque;
    }

    public void setEstoque(int estoque) 
    {
        this.estoque = estoque;
    }

    public double getPreco() 
    {
        return preco;
    }

    public void setPreco(double preco)
    {
        this.preco = preco;
    }

    @Override
    public void incUnits(int qtd)
    {
       this.estoque = this.estoque + qtd;
    }

    @Override
    public void decUnits(int qtd)
    {
        if (qtd<=this.estoque)
        {
            this.estoque = this.estoque - qtd;
        }   
    }

    @Override
    public int getUnits()
    {
        return this.estoque;
    }

    @Override
    public float getPrice()
    {
        return (float) this.preco;
    }

    @Override
    public void print()
    {
        System.out.println("Descricao: " + descricao +
                "\nTamanho: " + getTamanho() + 
                "\nPreco: " + getPrice() +
                "\nEstoque: " + getUnits() + "\n");
    }
   
}
