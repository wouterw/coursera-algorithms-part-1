// eager approach
public class QuickFind implements UnionFind {
  private int[] ids;

  // set id of each object to itself
  // (n array accesses)
  public QuickFind(int n) {
    ids = new int[n];

    for (int i = 0; i < n; i++)
      ids[i] = i;
  }

  // check whether p and q are in the same component
  // (2 array accesses)
  public boolean connected(int p, int q) {
    return ids[p] == ids[q];
  }

  // change all entries with ids[q] to ids[q]
  // (at most 2n + 2 array accesses)
  public void union(int p, int q) {
    int pid = ids[p];
    int qid = ids[q];

    for (int i = 0; i < ids.length; i++)
      if (ids[i] == pid) ids[i] = qid;
  }
}
