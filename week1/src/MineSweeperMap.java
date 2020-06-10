import java.util.Scanner;

public class MineSweeperMap {
    public static void main(String[] args) {
        System.out.println("Please enter size of MineMap:");

        String[][] mineMap = {
                {".",".",".","*","."},
                {".","*",".","*","."},
                {".","*",".",".","."},
                {".",".","*",".","."},
                {".",".",".","*","."},
        };

        System.out.println("The MineMap:");
        for (int i = 0; i < mineMap.length; i++) {
            for (int j = 0; j < mineMap[i].length; j++) {
                System.out.print(mineMap[i][j] + '\t');
            }
            System.out.println();
        }
        String mineSymbol = "*";
        String[][] mineMapReport = reportMineMap(mineMap, mineSymbol);
        System.out.println("The MineMapReport:");
        for (int i = 0; i < mineMapReport.length; i++) {
            for (int j = 0; j < mineMapReport[i].length; j++) {
                System.out.print(mineMapReport[i][j] + '\t');
            }
            System.out.println();
        }
    }

    public static String[][] reportMineMap(String[][] mineMap, String mineSymbol) {
        int size = mineMap.length;
        String[][] mineMapReport = new String[mineMap.length][mineMap[0].length];
        for (int i = 0; i < mineMap.length; i++) {
            for (int j = 0; j < mineMap[i].length; j++) {
                if (mineMap[i][j].equals(mineSymbol)) {
                    mineMapReport[i][j] = mineSymbol;
                } else {
                    int[][] neighbours = {
                            {i, j - 1},
                            {i - 1, j - 1},
                            {i - 1, j},
                            {i - 1, j + 1},
                            {i, j + 1},
                            {i + 1, j + 1},
                            {i + 1, j},
                            {i + 1, j - 1}
                    };
                    int mineCounter = 0;
                    for (int k = 0; k < neighbours.length; k++) {
                        int x = neighbours[k][0];
                        int y = neighbours[k][1];
                        boolean hasNeighbour = x >= 0 && y >= 0 && x < size && y < size;
                        if (hasNeighbour) {
                            boolean neighbourHasMine = mineMap[x][y].equals(mineSymbol);
                            if (neighbourHasMine) {
                                mineCounter++;
                            }
                        } else {
                            continue;
                        }
                        mineMapReport[i][j] = Integer.toString(mineCounter);
                    }
                }
            }
        }
        return mineMapReport;
    }
}
