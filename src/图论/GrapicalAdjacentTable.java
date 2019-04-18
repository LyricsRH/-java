package 图论;

public class GrapicalAdjacentTable {

    public static void main(String[] args) {
        int [][]data={{1,2},{2,1},{1,5},{5,1},{2,3},{3,2},{2,4},{4,2},{3,4},{4,3},{3,5},{5,3},{4,5},{5,4}};
        GrapLink grapLink[]=new GrapLink[6];
        for (int i = 1; i <grapLink.length ; i++) {
          //必须要先new一下，才能insert()。
           grapLink[i]=new GrapLink();
           grapLink[i].insert(i);
        }
        for (int[] a:data) {
            grapLink[a[0]].insert(a[1]);
        }

        for (int k=1;k<grapLink.length;k++) {
          // grapLink[0].print();出错，为什么
            grapLink[k].print();
        }
    }
}

class Node{
    int val;
    Node next;
    public Node(int val){
     this.val=val;
     this.next=null;
    }
}
class GrapLink{
    Node first,last;
    public boolean isEmpty(){
       return  first==null;
    }
    public void insert(int val){
        Node node=new Node(val);
        if(this.isEmpty()){
            first=node;
            last=node;
        }else {
            last.next=node;
            last=node;
        }
    }

    public void print(){
        if(first==null) return;
        Node temp=first;
        while(temp!=null){
            if(temp==first)
            {
                System.out.println();
                System.out.print("节点"+first.val+"-->");
             temp=temp.next;
            }
            else{System.out.print("["+temp.val+"]");
            temp=temp.next;}

        }
    }


}
