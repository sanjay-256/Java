public class matrix {
    public static void main(String[] args) {
    int numrows=3,numcols=3;
    int [][] matrix=new int[numrows][numcols];
    int value=1;
    for(int row=0;row<numrows;row++)
    {
        for(int col=0;col<numcols;col++)
        {
            matrix[row][col]=value;
            value++;
        }
    }
    //print
     for(int row=0;row<numrows;row++)
    {
        for(int col=0;col<numcols;col++)
        {
           System.out.print(matrix[row][col]+"\t");;
        }
        System.out.println();
    }
    }
}
