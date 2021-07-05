import java.util.Iterator;

public class CalculadoraPlano {

    public static Integer contarTotalFilmesAssistidosMes(AssistidosMes lista){
        int quantidade = 0;
        for (Iterator a = lista.iterator(); a.hasNext();){
            quantidade++;
            a.next();
        }
        return quantidade;
    }

    public static double calculaPlano(Usuario usuario) {
        PlanoCobranca planoUm = new PlanoUm();
        PlanoCobranca planoDois = new PlanoDois();
        PlanoCobranca planoTres = new PlanoTres();
        PlanoCobranca planoQuatro = new PlanoQuatro();

        planoUm.proximo(planoDois);
        planoDois.proximo(planoTres);
        planoTres.proximo(planoQuatro);

        return planoUm.calcula(usuario);
    }
}
