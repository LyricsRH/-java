package 图论;
//相邻矩阵和相邻列表都是从顶点出发记录边。
//相邻多元列表法直接存放边

import javafx.scene.input.Mnemonic;

public class GrapMutipList {

    public static void main(String[] args) {
      int [][]data ={{1,2},{1,3},{2,4}};
      //共1，2,3,4个顶点，建立一个Head数组
        Head[] heads=new Head[5];
        for(int i=1;i<heads.length;i++){
            heads[i]=new Head(i);
        }
       //创建所有边的数组，
        MNode[] mNodes=new MNode[data.length];
        for (int j = 0; j <data.length ; j++) {
            //新建的边节点只有v1与v2。
            mNodes[j]=new MNode(data[j][0],data[j][1]);
        }





    }
}

class Head{
    int val;
    MNode next;
    public Head(int val){
        this.val=val;
        this.next=null;
    }
}

class MNode{
    //有M,记录单元，记录节点是否被存储，v1边线起点，v2边线终点，Link1指向V1下一个连接边,若没有指向null。Link2类似、
    int m;
    int v1,v2;
    MNode link1,link2;

    public MNode(int v1, int v2){
        this.v1=v1;
        this.v2=v2;
        this.link1=null;
        this.link2=null;
        this.m=0;
    }

}


