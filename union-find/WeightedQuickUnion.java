public class WeightedQuickUnion implements UnionFind {
  private int[] ids;
  private int[] sizes;

  public WeightedQuickUnion(int n) {
    ids = new int[n];

    for (int i = 0; i < n; i++)
      ids[i] = i;

    sizes = new int[n];

    for (int i = 0; i < n; i++)
      sizes[i] = 1;
  }

  public boolean connected(int p, int q) {
    return root(p) == root(q);
  }

  public void union(int p, int q) {
    int i = root(p);
    int j = root(q);

    if (i == j) return;

    if (sizes[i] < sizes[j]) {
      id[i] = j;
      size[j] += sizes[i];
    } else {
      id[j] = i;
      size[i] += sizes[j];
    }
  }

  private int root(int i) {
    while (i != ids[i]) i = ids[i];
    return i;
  }
}
