class Node{
	public int Data;
	public Node NextNode;
	
	public Node(int value) {Data=value;}
}
public class LinkedList {
int count=0;
Node head;
Node currentNode;
public LinkedList(int length,int initial)
{
	count=length;
	
	head=new Node(initial);
	
	InitializeLinkedList(head,currentNode,count);
}
public void InitializeLinkedList(Node head,Node currentNode,int count)
{
for(int i=0;i<count;i++)
{
	Node newNode=new Node(0);
	if(i==0)
	{
		head.NextNode=newNode;
	}
	else
	{
		currentNode.NextNode=newNode;
	}
	newNode.NextNode=null;
	currentNode=newNode;
}
}

static public void main(String[] args)
{
	LinkedList list = new LinkedList(3,0);
	Node node=list.head;
	while(node.NextNode!=null)
	{
		System.out.println(node.Data);
	}
}
}
