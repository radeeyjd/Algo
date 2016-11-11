package unionfind;

public class QuickFind {

    int ids[];

    public QuickFind(int size) {
        ids = new int[size];
        for (int i = 0; i < size; i++) {
            ids[i] = i;
        }
    }

    public boolean find(int x, int y) {
        return ids[x] == ids[y];
    }

    public void union(int x, int y) {

        int xid = ids[x];
        int yid = ids[y];

        for (int i = 0; i < ids.length; i++) {
            if (ids[i] == xid)
                ids[i] = yid;
        }
    }
}
