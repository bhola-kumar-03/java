
public class SearchIn_2DMatrix_ii {
    public static boolean SearchMatrix(int [][]a,int target){
        int n=a.length;
        int m=a[0].length;
        int i=0;
        int j=m-1;
        while (i<n && j>=0) {
            if(target==a[i][j])
            {
                return true;
            }
            else
            {
                if (target>a[i][j]) {
                    i++;
                }
                else
                {
                    j--;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [][]a={{1,4,7,11,14},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24}};
        System.out.println(SearchMatrix(a, 5));
    }
}