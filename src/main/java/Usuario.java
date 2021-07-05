public class Usuario {
    String nome;
    String id;
    AssistidosMes listaFilmesAssistidosMes;
    int quantidadeFilmeMes;

    public Usuario(String nome, String id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public AssistidosMes getListaFilmesAssistidosMes() {
        return listaFilmesAssistidosMes;
    }

    public void setListaFilmesAssistidosMes(AssistidosMes listaFilmesAssistidosMes) {
        this.listaFilmesAssistidosMes = listaFilmesAssistidosMes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getQuantidadeFilmeMes() {
        return quantidadeFilmeMes;
    }

    public void setQuantidadeFilmeMes() {
        this.quantidadeFilmeMes = CalculadoraPlano.contarTotalFilmesAssistidosMes(this.listaFilmesAssistidosMes);
    }

    public String getInfo(){
        return "Nome: " + getNome()
                + " - Filmes Assistidos: " + getQuantidadeFilmeMes()
                + ", Total a pagar: " + CalculadoraPlano.calculaPlano(this);
    }
}
