package sample.sortPackage;

public class CountingSort extends Sort {

    public void sorting(int array[]){
        int i, j, size = array.length;
        int[] a, b, c;
        a = new int [size];
        b = new int [size];
        c = new int [size];

        for(i = 0; i < size; i++){
            b[i] = 0;
            c[i] = a[i] = array[i];
        }

        for(i = 0; i < size; i++)
        {
            for(j = i + 1; j < size; j++)
                if (a[i] < a[j])
                    b[j]++;
                else
                    b[i]++;
        }

        for(i = 0; i < size; i++)
            a[b[i]] = c[i];

        print(size, a, "Counting sort");
    }
    public void sortg(int array[]) {
        int q = 0, i, j, size = array.length;
        int[] a, b, c;
        a = new int[size];
        b = new int[size];
        c = new int[size];

        for (i = 0; i < size; i++) {
            c[i] = array[i];
            a[i] = array[i];
            b[i] = 0;
        }

        grafic(a, q, "countingSort");

        for (i = 0; i < a.length; i++) {
            for (j = i + 1; j < a.length; j++)
                if (a[i] < a[j])
                    b[j]++;
                else
                    b[i]++;
        }

        for (i = 0; i < size; i++) {
            a[b[i]] = c[i];
            q++;
            grafic(a, q, "countingSort");
        }
    }
}

