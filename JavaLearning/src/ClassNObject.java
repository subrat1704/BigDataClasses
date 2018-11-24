
public class ClassNObject {
public static void main(String[] args)
{
	Parent obj=new Parent();
	obj.Add(10, 20);
	Child obj1=new Child();
	obj1.Add(15, 15);
	Parent objP=new Child();
	objP.Add(20, 10);
}
}

class Parent{
	public Parent()
	{
		System.out.println("Hello Parent");
	}
	
	public void Add(int x,int y)
	{
		System.out.println("Addition Result:"+(x+y));
	}
}

class Child extends Parent{
	public Child() {
		System.out.println("Hello Child");
	}
	
	public void Add(int x,int y)
	{
		System.out.println("Addition Result:"+(Integer.toString(x)+":"+Integer.toString(y)));
	}
}
