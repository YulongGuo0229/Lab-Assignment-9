import java.util.ArrayList;

public class Allpath {

    public int[][] allPaths(int[][] graph) {
        int[][] g = graph;
        int[][] r = new int[100][100];
        int len = 1000;
        int[] c = new int[len];
        c[0] = 0;
        dfs(c, r, g, 0);
        return r;
    }

    private void dfs(int[] c, int[][] r, int[][] g, int n) {
        if(n == g.length - 1) {
            int count = 0;
            r[count] = c;
            count++;
            return;
        }

        int[] nbs = g[n];
        for(int nb : nbs) {
            int i = 0;
            c[i] = nb;
            dfs(c, r, g, nb);
            c[c.length - 1] = Integer.parseInt(null);
        }
    }
}
