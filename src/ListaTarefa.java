import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefas> tarefasList;

    public ListaTarefa() {
        this.tarefasList = new ArrayList<>();
    }

    public void adiocionarTarefa(String descricao){
        tarefasList.add(new Tarefas(descricao));
    }

    public void removerTarefas(String descricao){
        List<Tarefas> tarefasParaRemover = new ArrayList<>();
        for(Tarefas t : tarefasList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefasList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefasList.size();
    }

    public void ObterDescricoesTarefas(){
        System.out.println(tarefasList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O numero total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());


        listaTarefa.adiocionarTarefa("tarefa 1");
        listaTarefa.adiocionarTarefa("tarefa 1");
        listaTarefa.adiocionarTarefa("tarefa 2");
        System.out.println("O numero total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefas("tarefa 1");
        System.out.println("O numero total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.ObterDescricoesTarefas();
    }

}
