import java.util.List;
import java.io.IOException;

public class TesteLeitura {

    public static void main(String[] args) throws IOException {

        LeitorArquivo leitor = new LeitorArquivo();

        List<Empresa> empresas = leitor.lerArquivo(
                "src/src/Empresas_BubbleSort.txt"
        );

        System.out.println("Total de empresas: " + empresas.size());

        for (Empresa empresa : empresas) {
            System.out.println(
                    empresa.getNomeFantasia() + " | " +
                            empresa.getInscricaoEstadual() + " | " +
                            empresa.getValorMercado()
            );
        }
    }
}