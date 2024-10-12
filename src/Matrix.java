import java.time.Instant;

public class Matrix {

    public void Matrix(){    }

    public static void minhaMatrix(){

        int matrix[][][][][][]= new int[6][6][6][6][6][6];

        for (int i1 = 0; i1 < matrix.length; i1++) {
            for (int i2 = 0; i2 < matrix[i1].length; i2++) {
                for (int i3 = 0; i3 < matrix[i1][i2].length; i3++) {
                    for (int i4 = 0; i4 < matrix[i1][i2][i3].length; i4++) {
                        for (int i5 = 0; i5 < matrix[i1][i2][i3][i4].length; i5++) {
                            for (int i6 = 0; i6 < matrix[i1][i2][i3][i4][i5].length; i6++) {
                                matrix[i1][i2][i3][i4][i5][i6] = (i1+1) * (i2+1) * (i3+1) * (i4+1) * (i5+1) * (i6+1);
                            }
                        }
                    }
                }
            }
        }
        for (int i1 = 0; i1 < matrix.length; i1++) {
            for (int i2 = 0; i2 < 6; i2++) {
                for (int i3 = 0; i3 < 6; i3++) {
                    for (int i4 = 0; i4 < 6; i4++) {
                        for (int i5 = 0; i5 < 6; i5++) {
                            for (int i6 = 0; i6 < 6; i6++) {
                                System.out.println( matrix[i1][i2][i3][i4][i5][i6]);
                            }
                        }
                    }
                }
            }
        }
    }
}
