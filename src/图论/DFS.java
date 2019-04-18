package 图论;

import java.awt.dnd.DnDConstants;
//先广后深遍历，用相邻表法存储

public class DFS {
    //顶点个数+1
    static  int nums=9;
    //DFS判断有没有访问过的标志位
    static int []run=new int[nums];
    //顶点链表数组，并进行初始化
    static DGraphLinK[] dgks=new DGraphLinK[nums];
    public static void main(String[] args) {
        int [][]data={{1,2},{2,1},{1,3},{3,1},{2,4},{4,2},{2,5},{5,2},{3,6},{6,3},{3,7},{7,3},{4,5}
        ,{5,4},{6,7},{7,6},{5,8},{8,5},{6,8},{8,6}};
        //初始化
        for(int i=1;i<nums;i++){
            dgks[i]=new DGraphLinK();
        }
        //遍历data数组，将相邻点加入对应顶点link中
        for (int[] a :data) {
            dgks[a[0]].insert(a[1]);
        }
        //打印所有link
        for (int j = 1; j <nums ; j++) {
            System.out.println();
            System.out.print("顶点"+j+"-->");
            dgks[j].print();
        }
        System.out.println("DPS 结果");
        dps(1);
    }

    //dgks[]数组，[i]存的是顶点i所有相邻顶点，不包括i
    public static void dps(int val){
        //访问val,将其run改为1
        run[val]=1;
        //遍历val
        System.out.print(val+"  ");
        //当val所有相邻顶点全部遍历完，遍历结束，先深后广，所以他的相邻节点最后访问
        while(dgks[val].first!=null){
            //判断val相邻顶点，若没被访问，则对其进行递归访问。先访问他的相邻顶点
            if(run[dgks[val].first.val]==0)
                dps(dgks[val].first.val);
            //指向下一个相邻顶点。
                dgks[val].first=dgks[val].first.next;
        }
    }

}

class DNode{
    int val;
    DNode next;
    public DNode(int val){
        this.val=val;
        this.next=null;
    }
}

class DGraphLinK{
    DNode first;
    DNode last;

    public boolean isEmpty(){
        return this.first==null;
    }

    public void insert(int val){
        DNode newNode=new DNode(val);
        if(this.isEmpty()){
            first=newNode;
            last=newNode;
        }else{
            last.next=newNode;
            last=newNode;
        }
    }

    public void print(){
        DNode temp=first;
        while (temp!=null){
                System.out.print("["+ temp.val+"]");
                temp=temp.next;
            }
        }

}



