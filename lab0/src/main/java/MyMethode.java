import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Arrays;

public class MyMethode {
    public int MyInteger(int kg){
        return kg/1000;
    }
    public boolean MyBoolean(int num){
        return num%2!=0;
    }
    public int MyIf(int num){
        if(num>=0){
            return num+1;
        }else {
            return num-2;
        }
    }
    public String MyCase(int k){
        switch (k){
            case 1:
                return "плохо";
            case 2:
                return "неудовлетворительно";
            case 3:
                return "удовлетворительно";
            case 4:
                return "хорошо";
            case 5:
                return "отлично";
            default:
                return "ошибка";
        }
    }
    public int[] MyFor(int a,int b){
        assert (a<b && a>=0);
        int[] res =new int[b-a+1];
        res[0] = a;
        for (int i = 1;i<res.length;i++){
            res[i] = a+i;
        }
        return res;
    }
    public int MyWhile(int a, int b){
        assert (a>b && b>=0);
        int count = 0;
        while (a-b>=0){
            a-=b;
            count++;
        }
        return count;
    }
    public int MyMinMax(int n, ArrayList<Point2D> rectangles){
        int res = (int) (rectangles.get(0).getX()*rectangles.get(0).getY());
        for (var rect: rectangles) {
            int temp = (int) (rect.getX()*rect.getY());
            if(temp<res){
                res = temp;
            }
        }
        return res;
    }
    public int[] MyArray(int n){
        assert (n>0);
        int[] res = new int[n];
        for (int i = 0; i<n;i++){
            res[i] = (int) Math.pow(2,i+1);
        }
        return res;
    }
    public int[][] MyMatrix(int m,int n){
        int[][] res = new int[m][n];
        for (int i = 1;i<n+1;i++){
            res[0][i-1] = i*5;
        }
        for (int i = 1;i<m;i++){
            res[i] = res[0];
        }
        return res;
    }
}
