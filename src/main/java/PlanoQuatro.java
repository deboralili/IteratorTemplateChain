public class PlanoQuatro implements PlanoCobranca {
    private PlanoCobranca proximo;

    @Override
    public double calcula(Usuario usuario) {
            return 7.00;
    }

    @Override
    public void proximo(PlanoCobranca proximo) {
        this.proximo = proximo;
    }
}
