import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();

    UnionFind uf = new QuickUnion(n);

    while (in.hasNextInt()) {
      int p = in.nextInt();
      int q = in.nextInt();

      if (!uf.connected(p, q)) {
        uf.union(p, q);
        System.out.println(p + " " + q);
      }
    }
  }
}
