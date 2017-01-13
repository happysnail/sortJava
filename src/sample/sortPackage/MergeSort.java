package sample.sortPackage;

public class MergeSort extends Sort {
    private int[] v;
    public int q=0;

    private void interclas(int i, int m, int j, int gr) {
        int[] b;
        b =new int [400000];
        int x = i;
        int k = 1;
        int y = m + 1;

        while(x <= m && y <= j)
            if (v[x] < v[y])
                b[k++] = v[x++];
            else
                b[k++] = v[y++];

        while (x <= m)
            b[k++] = v[x++];

        while (y <= j)
            b[k++] = v[y++];

        int t = i;
        for (k = 1; k <= (j-i)+1; k++)
            v[t++] = b[k];
        if(gr==1) {
            if (q == 0)
                q = 1;

            grafic(v, q, "mergeSort");q++;
        }
    }

    private void divimp(int i, int j,int gr) {
        if (i < j) {
            int m = (i+j) / 2;
            divimp(i,m,gr);
            divimp(m+1,j,gr);
            interclas(i,m,j,gr);
        }
    }

    public void sorting(int array[]) {
        int size = array.length;
        v = new int [array.length + 1];
        System.arraycopy(array, 0, v, 1, size);

        divimp(1, size, 0);

        print(size, v, "Merge Sort");
    }

    public void sortg(int array[]) {
        int size = array.length;
        v = new int [array.length + 1];
        System.arraycopy(array, 0, v, 1, size);

        grafic(v, q, "mergeSort");

        divimp(1, size, 1);
    }
}
