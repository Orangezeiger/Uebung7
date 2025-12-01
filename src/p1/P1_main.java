package p1;

public class P1_main {
    public static void main(String[] args) {
        Bruch a = new Bruch(5, 2);
        Bruch b = new Bruch(3, 4);
        multFrac(5,2,3,4);
        multFrac(a,b);
        System.out.println(a);
        System.out.println(a.toString());
    }

    public static void multFrac(int z1, int n1, int z2, int n2) {
        System.out.println(z1 * z2 +":" + n1 * n2);
    }

    public static void multFrac(Bruch a, Bruch b) {
        System.out.println(a.z * b.z + ":" + a.n * b.n);
    }
}
