public class PlanoUm implements PlanoCobranca {

    private PlanoCobranca proximo;

    @Override
    public double calcula(Usuario usuario) {
        if(usuario.getQuantidadeFilmeMes() <= faixa1)
            return 0;
        else
            return proximo.calcula(usuario);
    }

    @Override
    public void proximo(PlanoCobranca proximo) {
        this.proximo = proximo;
    }
}
