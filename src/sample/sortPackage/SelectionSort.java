package sample.sortPackage;

public class SelectionSort extends Sort {

    public void sorting(int array[]){
        int aux, size = array.length;
        int[] v;

        v = new int [size];

        System.arraycopy(array, 0, v, 0, size);

        for(int i = 0; i < size - 1; i++)
            for(int j = i + 1 ; j < size; j++)
                if(v[i] > v[j]) {
                    aux = v[j];
                    v[j] = v[i];
                    v[i] = aux;
                }

        print(size, v, "Selection Sort");
    }
    public void sortg(int array[]) {
        int aux, q = 0, size = array.length;
        int[] v;

        v = new int [size];

        System.arraycopy(array, 0, v, 0, size);

        for(int i = 0; i < size - 1; i++)
            for(int j = i + 1 ; j < size; j++)
                if(v[i] > v[j]) {
                    grafic(v, q, "selectionSort");
                    aux = v[j];
                    v[j] = v[i];
                    v[i] = aux;
                    q++;
                }
        grafic(v, q, "selectionSort");
    }
}
