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

        if (x > ids.length || y > ids.length) {
            throw new IllegalArgumentException("Invalid input. Upper bound: " + ids.length);
        }

        return ids[x] == ids[y];
    }

    public void union(int x, int y) {

        if (x > ids.length || y > ids.length) {
            throw new IllegalArgumentException("Invalid input. Upper bound: " + ids.length);
        }

        int xid = ids[x];
        int yid = ids[y];

        for (int i = 0; i < ids.length; i++) {
            if (ids[i] == xid)
                ids[i] = yid;
        }
    }
}
