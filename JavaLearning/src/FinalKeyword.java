
public class FinalKeyword extends ParentClass{
	final int x;
	static final String name;
	{
		System.out.println("Initializer Block");
	}
	static {name="subrat";}
	
	public FinalKeyword()
	{
		x=0;
	}
	
	public static void main(String[] args)
	{
		FinalKeyword obj = new FinalKeyword();
		
		obj.ShowMessage();
	}

}
class ParentClass
{
	public final void ShowMessage()
	{
		System.out.println("Parent class message");
	}
}
