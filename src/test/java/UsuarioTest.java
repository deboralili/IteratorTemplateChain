import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    @Test
    void getInfo() {
        Usuario usuario = new Usuario("Camila", "0");
        AssistidosMes lista = new AssistidosMes(
                new Filme("Toy Story - Um Mundo de Aventuras", "1"),
                new Filme("Toy Story 2", "2"),
                new Filme("Toy Story 3", "3"),
                new Filme("Toy Story 4", "4")
        );
        usuario.setListaFilmesAssistidosMes(lista);
        usuario.setQuantidadeFilmeMes();
        assertEquals("Nome: Camila - Filmes Assistidos: 4, Total a pagar: 0.0", usuario.getInfo());
    }
}