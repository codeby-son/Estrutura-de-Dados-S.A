import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeitorArquivo {

    public List<Empresa> lerArquivo(String caminho) throws IOException {

        List<Empresa> empresas = new ArrayList<>();

        try (BufferedReader leitor = new BufferedReader(new FileReader(caminho))) {

            String linha;

            while ((linha = leitor.readLine()) != null) {

                String[] dados = linha.split("\\|");

                String nome = dados[0].trim();
                String inscricao = dados[1].trim();
                String valorTexto = dados[2].trim();

                double valor = Double.parseDouble(valorTexto);

                Empresa empresa = new Empresa(nome, inscricao, valor);

                empresas.add(empresa);
            }
        }

        return empresas;
    }
}
