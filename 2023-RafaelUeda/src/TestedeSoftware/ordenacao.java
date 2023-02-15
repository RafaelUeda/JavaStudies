package TestedeSoftware;

public class ordenacao {
    public static void main(String[] args) {
        int n = 0;
        int arr[] = {2, 5, 1, 3, 4};
        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                idx = i;
                break;
            }
            /*int idx = i;
            for (int j = i + 1;j < arr.length + 1; j++) {
                if (arr [j] >= arr [idx]) {
                    idx = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;*/
        }
    }
}