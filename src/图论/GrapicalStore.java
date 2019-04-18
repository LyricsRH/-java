package 图论;
/*
利用相邻矩阵法存储无向图,有向图。n个顶点，x*n矩阵（m,n）有连线则值为1，否则为0
 将边二维数组集合，转换成相邻矩阵
 */

public class GrapicalStore {

    //成员变量，默认赋值
    static int [][]arr=new int[5][5];
    public static void main(String[] args) {
       // int [][]data={{1,2},{2,1},{1,5},{5,1},{2,3},{3,2},{2,4},{4,2},{3,4},{4,3},{4,5},{3,5},{5,3},{5,4}};
        //遍历矩阵data,有边就将值赋为1。
        //有向图，
        int [][]data2={{1,2},{2,1},{2,3},{2,4},{4,3}};

        for (int[] a:data2) {
          arr[a[0]][a[1]]=1;
        }


        //打印矩阵
        for (int i=1;i<arr.length;i++) {
            for (int j = 1; j <arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
