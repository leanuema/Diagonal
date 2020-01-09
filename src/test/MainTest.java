
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void sumaPrimerDiagonal4x4() {

        Main main = new Main();

        int[][] matriz = new int[][]{{1, 2, 3, 6}, {4, 5, 6, 7}, {3, 9, 8, 5}, {3, 5, 3, 3}};

       assertEquals(17, main.sumaPrimerDiagonal(matriz));
    }

    @Test
    void sumaPrimerDiagonal3x3() {

        Main main = new Main();

        int[][] matriz = new int[][]{{1, 2, 3}, {4, 5, 6}, {3, 9, 8}};

        assertEquals(14, main.sumaPrimerDiagonal(matriz));
    }

    @Test
    void sumaPrimerDiagonal4x3() {

        Main main = new Main();

        int[][] matriz = new int[][]{{1, 2, 3}, {4, 5, 6}, {3, 9, 8}, {3, 5, 3}};

        assertEquals(14, main.sumaPrimerDiagonal(matriz));
    }

    @Test
    void sumaPrimerDiagonal3x4() {

        Main main = new Main();

        int[][] matriz = new int[][]{{1, 2, 3, 5}, {4, 5, 6, 9}, {3, 9, 8, 2}};

        assertEquals(14, main.sumaPrimerDiagonal(matriz));
    }
}
