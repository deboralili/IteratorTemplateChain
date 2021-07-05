public class PlanoDois implements PlanoCobranca {
    private PlanoCobranca proximo;

    @Override
    public double calcula(Usuario usuario) {
        if(usuario.getQuantidadeFilmeMes() > faixa1 && usuario.getQuantidadeFilmeMes() <= faixa2)
            return 2.00;
        else
            return proximo.calcula(usuario);
    }

    @Override
    public void proximo(PlanoCobranca proximo) {
        this.proximo = proximo;
    }
}
