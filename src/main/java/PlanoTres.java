public class PlanoTres implements PlanoCobranca {
    private PlanoCobranca proximo;

    @Override
    public double calcula(Usuario usuario) {
        if(usuario.getQuantidadeFilmeMes() > faixa2 && usuario.getQuantidadeFilmeMes() <= faixa3)
            return 5.00;
        else
            return proximo.calcula(usuario);
    }

    @Override
    public void proximo(PlanoCobranca proximo) {
        this.proximo = proximo;
    }
}
