
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TesteGravacao {

    public static void main(String[] args) throws IOException {

        List<Empresa> empresas = new ArrayList<>();

        empresas.add(new Empresa("Empresa A", "12345678-9", 5000000.00));
        empresas.add(new Empresa("Empresa B", "98765432-1", 7000000.00));
        empresas.add(new Empresa("Empresa C", "11223344-5", 3000000.00));

        BubbleSort ordenador = new BubbleSort();
        ordenador.bubbleSort(empresas);

        GravadorArquivo gravador = new GravadorArquivo();

        String caminho = "src/src/Empresas_Ordenadas.txt";

        gravador.gravarArquivo(empresas, caminho);

        LeitorArquivo leitor = new LeitorArquivo();
        List<Empresa> empresasGravadas = leitor.lerArquivo(caminho);

        boolean ordemCorreta = true;
        boolean dadosPreservados = empresas.size() == empresasGravadas.size();

        if (dadosPreservados) {
            for (int i = 0; i < empresas.size(); i++) {
                Empresa original = empresas.get(i);
                Empresa gravada = empresasGravadas.get(i);

                if (!original.getNomeFantasia().equals(gravada.getNomeFantasia())
                        || !original.getInscricaoEstadual().equals(gravada.getInscricaoEstadual())
                        || Double.compare(original.getValorMercado(), gravada.getValorMercado()) != 0) {
                    dadosPreservados = false;
                    break;
                }
            }
        }

        for (int i = 0; i < empresasGravadas.size() - 1; i++) {
            if (empresasGravadas.get(i).getValorMercado()
                    < empresasGravadas.get(i + 1).getValorMercado()) {
                ordemCorreta = false;
                break;
            }
        }

        System.out.println("Total de empresas gravadas: " + empresasGravadas.size());
        System.out.println("Dados preservados: " + dadosPreservados);
        System.out.println("Ordem decrescente: " + ordemCorreta);
    }
}
