
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GravadorArquivo {

    public void gravarArquivo(List<Empresa> empresas, String caminho)
            throws IOException {

        try (BufferedWriter escritor = new BufferedWriter(
                new FileWriter(caminho))) {

            for (Empresa empresa : empresas) {

                String linha = empresa.getNomeFantasia() + "|"
                        + empresa.getInscricaoEstadual() + "|"
                        + empresa.getValorMercado();

                escritor.write(linha);
                escritor.newLine();
            }
        }

        System.out.println("Arquivo gravado com sucesso!");
    }
}
