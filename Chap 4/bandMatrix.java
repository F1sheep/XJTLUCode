public class bandMatrix {
    public static void main(String[] args) {
        bandMatrix(4, 2);
    }

    public static void bandMatrix(int n, int width) {//这是主流使用创建一个矩阵的方法
        String[][] outComeArray = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                outComeArray[i][j] = "0";
        }
        for (int i = 0; i < n; i++) {
            outComeArray[i][i] = "*";
            for (int j = 0; j <= width; ++j) {
                if (i - j >= 0)
                    outComeArray[i][i - j] = "*";
                if (i + j < n)
                    outComeArray[i][i + j] = "*";
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(outComeArray[i][j] + "  ");
            System.out.println();
        }
    }

    public static void bandMatrix1 (int n, int width){
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < n+1; j++) {
                if(j>=i-width&&j<=i+width){
                    System.out.print("*  ");
                }else if(i+width<=j&&j<=n){
                    System.out.print("0  ");
                }else if(j>=1&&j<i-width){
                    System.out.print("0  ");
                }
            }
            System.out.println();
        }
    }
}
