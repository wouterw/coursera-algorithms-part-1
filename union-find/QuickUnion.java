// lazy approach
public class QuickUnion implements UnionFind {
  // depicts a forest (collection of trees)
  // each connected component is represented by a tree
  private int[] ids;

  // set id of each object to itself
  // (n array accesses)
  public QuickUnion(int n) {
    ids = new int[n];

    for (int i = 0; i < n; i++)
      ids[i] = i;
  }

  // check if p and q have the same root
  // (depth of p and q array accesses
  public boolean connected(int p, int q) {
    return root(p) == root(q);
  }

  // change root of p to point to root of q
  // (depth of p and q array accesses)
  public void union(int p, int q) {
    int i = root(p);
    int j = root(q);

    ids[i] = j;
  }

  // chase parent pointers untill reach root
  // (depth of i array accesses)
  private int root(int i) {
    while (i != ids[i]) i = ids[i];
    return i;
  }
}
