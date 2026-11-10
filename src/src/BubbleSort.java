import java.util.List;

public class BubbleSort {

    public void bubbleSort(List<Empresa> empresas) {

        int n = empresas.size();
        boolean houveTroca = true;
        Empresa tmp;

        for (int i = 0; i < n - 1 && houveTroca; i++) {

            houveTroca = false;

            for (int j = n - 1; j > i; j--) {

                if (empresas.get(j).getValorMercado() > empresas.get(j - 1).getValorMercado()) {

                    tmp = empresas.get(j - 1);
                    empresas.set(j - 1, empresas.get(j));
                    empresas.set(j, tmp);

                    houveTroca = true;
                }
            }
        }
    }
}
 