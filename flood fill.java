import java.util.Arrays;
public class Main{
    int[][] dir = {{0,1}, {0,-1}, {1,0}, {-1,0}}; 
    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int change = image[sr][sc];
        fill(image, sr, sc, color, change);
        return image;
    }
    
    public void fill(int[][] image, int sr, int sc, int color, int org) {
        int m = image.length, n = image[0].length;
        if(sr < 0 || sc < 0 || sr >= m || sc >= n || image[sr][sc] == color || image[sr][sc] != org) {
            return;
        }
        if(image[sr][sc] == org) {
            image[sr][sc] = color;
        }
        for(int[] di: dir) {
            int dr = di[0], dc = di[1];    
            fill(image, sr + dr, sc + dc, color, org); 
        }
    }
    public static void main(String[] args) {
        Main sol = new Main();
        int[][] image = {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 1}
        };
        int sr = 1, sc = 1, color = 2;

        int[][] result = sol.floodFill(image, sr, sc, color);

        // Print the result
        for(int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}
