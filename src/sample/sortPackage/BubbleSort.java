package sample.sortPackage;

public class BubbleSort extends Sort {

    public void sorting(int array[]){
        int ok, aux, size = array.length;
        int[] v = new int[size];

        System.arraycopy(array, 0, v, 0, size);

        do {
            ok=1;
            for(int i=0; i < size - 1; i++) {
                if(v[i] > v[i + 1]) {
                    ok = 0;
                    aux = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = aux;
                }
            }
        }while (ok != 1);

        print(size, v, "Bubble Sort");
    }

    public void sortg(int array[]) {
        int ok, aux, q = 0, size = array.length;
        int[] v = new int[size];

        System.arraycopy(array, 0, v, 0, size);

        do{
            ok = 1;
            for(int i = 0; i < size - 1; i++)
            {
                if(v[i] > v[ i + 1 ])
                {
                    grafic(v,q,"bubbleSort");
                    ok=0;
                    aux = v[i];
                    v[i] = v[i+1];
                    v[ i + 1 ] = aux;
                    q++;
                }
            }

        }while(ok != 1);
        grafic(v,q,"bubbleSort");
    }

}
