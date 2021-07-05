import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AssistidosMes implements Iterable<Filme>{

    private List<Filme> filmes = new ArrayList<Filme>();

    public AssistidosMes(Filme... filmes) {
        this.filmes = Arrays.asList(filmes);
    }

    @Override
    public Iterator<Filme> iterator() {
        return filmes.iterator();
    }
}
