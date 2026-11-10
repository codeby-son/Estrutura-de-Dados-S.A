import java.util.ArrayList;
import java.util.List;

public class TesteBubbleSort {

    public static void main(String[] args) {

        BubbleSort bubbleSort = new BubbleSort();

        // Teste 1: exemplo pequeno (mesmo exemplo da atividade)
        List<Empresa> empresas = new ArrayList<>();

        empresas.add(new Empresa("Empresa A", "12345678-9", 5000000));
        empresas.add(new Empresa("Empresa B", "98765432-1", 3000000));
        empresas.add(new Empresa("Empresa C", "11223344-5", 7000000));

        System.out.println("Teste 1 - Antes da ordenacao:");
        imprimir(empresas);

        bubbleSort.bubbleSort(empresas);

        System.out.println("Teste 1 - Depois da ordenacao:");
        imprimir(empresas);
        System.out.println("Ordem decrescente: " + estaDecrescente(empresas));
        System.out.println();

        // Teste 2: valores repetidos (verifica se a ordem original e mantida)
        List<Empresa> repetidas = new ArrayList<>();

        repetidas.add(new Empresa("Empresa D", "11111111-1", 2000000));
        repetidas.add(new Empresa("Empresa E", "22222222-2", 9000000));
        repetidas.add(new Empresa("Empresa F", "33333333-3", 2000000));
        repetidas.add(new Empresa("Empresa G", "44444444-4", 9000000));

        System.out.println("Teste 2 - Antes da ordenacao:");
        imprimir(repetidas);

        bubbleSort.bubbleSort(repetidas);

        System.out.println("Teste 2 - Depois da ordenacao:");
        imprimir(repetidas);
        System.out.println("Ordem decrescente: " + estaDecrescente(repetidas));
        System.out.println();

        // Teste 3: lista ja ordenada, lista com 1 elemento e lista vazia
        List<Empresa> jaOrdenada = new ArrayList<>();

        jaOrdenada.add(new Empresa("Empresa H", "55555555-5", 8000000));
        jaOrdenada.add(new Empresa("Empresa I", "66666666-6", 4000000));
        jaOrdenada.add(new Empresa("Empresa J", "77777777-7", 1000000));

        bubbleSort.bubbleSort(jaOrdenada);

        System.out.println("Teste 3 - Lista ja ordenada:");
        imprimir(jaOrdenada);
        System.out.println("Ordem decrescente: " + estaDecrescente(jaOrdenada));

        List<Empresa> umElemento = new ArrayList<>();
        umElemento.add(new Empresa("Empresa K", "88888888-8", 1500000));
        bubbleSort.bubbleSort(umElemento);
        System.out.println("Lista com 1 elemento: " + estaDecrescente(umElemento));

        List<Empresa> vazia = new ArrayList<>();
        bubbleSort.bubbleSort(vazia);
        System.out.println("Lista vazia: " + estaDecrescente(vazia));
        System.out.println();

        // Teste 4: vetor do exercicio dos slides (60 valores)
        int[] valores = {66, 83, 10, 10, 40, 51, 11, 64, 45, 50, 40, 76, 28, 6, 98, 17, 44, 55, 47, 8,
                53, 38, 1, 94, 72, 39, 7, 23, 37, 71, 92, 15, 29, 38, 36, 22, 71, 55, 27, 68,
                71, 64, 74, 20, 17, 79, 12, 59, 96, 85, 6, 96, 30, 50, 4, 1, 51, 53, 90, 22};

        List<Empresa> exercicio = new ArrayList<>();

        for (int i = 0; i < valores.length; i++) {
            exercicio.add(new Empresa("Empresa " + i, "00000000-0", valores[i]));
        }

        bubbleSort.bubbleSort(exercicio);

        System.out.println("Teste 4 - Valores ordenados:");

        for (Empresa empresa : exercicio) {
            System.out.print((int) empresa.getValorMercado() + " ");
        }

        System.out.println();
        System.out.println("Total de empresas: " + exercicio.size());
        System.out.println("Ordem decrescente: " + estaDecrescente(exercicio));
    }

    public static void imprimir(List<Empresa> empresas) {

        for (Empresa empresa : empresas) {
            System.out.println(
                    empresa.getNomeFantasia() + " | " +
                            empresa.getInscricaoEstadual() + " | " +
                            empresa.getValorMercado()
            );
        }
    }

    public static boolean estaDecrescente(List<Empresa> empresas) {

        for (int i = 0; i < empresas.size() - 1; i++) {
            if (empresas.get(i).getValorMercado() < empresas.get(i + 1).getValorMercado()) {
                return false;
            }
        }

        return true;
    }
}