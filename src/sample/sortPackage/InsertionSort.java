package sample.sortPackage;

public class InsertionSort extends Sort {

    public int[] insertion(int array[], int i){
        int x, j, size = array.length;
        int[] v = new int [size];

        System.arraycopy(array, 0, v, 0, size);

        if (v[i] < v[i-1])
        {
            x = v[i];
            j = i - 1;
            while (j >= 0 && v[j] > x)
            {
                v[j+1] = v[j];
                j--;
            }
            v[j+1] = x;
        }
        return v;
    }

    public void sorting(int array[]){
        int size = array.length;
        int[] v = new int [size];

        System.arraycopy(array, 0, v, 0, size);

        for(int i = 1; i < size; i++)
            v=insertion(v,i);

        print(size, v, "Insertion Sort");
    }

    public void sortg(int array[]) {
        int q, size = array.length;
        int[] v = new int [size];

        System.arraycopy(array, 0, v, 0, size);

        grafic(v, 0, "insertionSort");
        q=1;

        for(int i = 1; i < size; i++) {
            v=insertion(v,i);
            grafic(v, q, "insertionSort");
            q++;
        }
    }
}
