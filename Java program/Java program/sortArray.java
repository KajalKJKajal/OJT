public class sortArray {
    public void merge(int A[], int m, int B[], int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (A[i] > B[j]) {
                A[k--] = A[i--];
                } else {
                    A[k--] = B[j--];
                    }
                }
    }
    public static void main(String[] args) {
        int A[] = {1,2,3,0,0,0};
        int B[] = {2,4,5};
        int m = 3;
        int n = 3;
        sortArray s = new sortArray();
        s.merge(A, m, B, n);
        for(int i = 0; i < A.length; i++){
            System.out.print(A[i] + " ");

        }
    }
}
    