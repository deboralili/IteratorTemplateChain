public interface PlanoCobranca {
    public int faixa1 = 4;
    public int faixa2 = 8;
    public int faixa3 = 16;

    public double calcula(Usuario usuario);
    public void proximo(PlanoCobranca proximo);
}
