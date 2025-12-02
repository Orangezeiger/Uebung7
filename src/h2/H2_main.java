package h2;

import java.util.Arrays;

public class H2_main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(change(new int[]{2,7,1,9}, new int[]{5,6,7}, 2, 4)));
        System.out.println(Arrays.toString(change(new int[]{2,7,1,9}, new int[]{2,7,1,9}, 2, 4)));
        System.out.println(Arrays.toString(change(new int[]{2,7,1,9}, new int[]{2,7,1,9}, 3, 2)));
    }

    public static int[] change(int[] a, int[] b, int start, int end) {
        if (end > start && Arrays.compare(a,b) != 0) {
            return Arrays.copyOf(a, a.length);
        }else if (end > start && Arrays.compare(a, b) == 0) {
            Arrays.sort(a);
            int[] c = new int[end - start];
            for (int i = 0; i < end - start; i++) {
                c[i] = a[i + start];
            }
            return c;
        }
            return new int[]{};
    }
}
