import static java.lang.System.out;

public class treescript
{
	public static void main(String argz[])
	{
		IntegerTreeNode root = new IntegerTreeNode(10);
		root.add(2);
		root.add(12);
		root.add(4);
		root.add(19);
		root.add(7);
		root.add(16);
		root.add(5);
		root.add(11);
		
		out.println(root.contains(7));
		out.println(root.contains(17));

		out.println(root.getMax());
		out.println(root.getMin());
		
		out.println(root.toString());

	}
}
