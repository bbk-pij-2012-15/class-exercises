public class IntegerTreeNode 
{
	private int value;
	private IntegerTreeNode left;
	private IntegerTreeNode right;
	
	public IntegerTreeNode(int value)
	{
		this.value = value;
		this.left = null;
		this.right = null;
	}
	
	public void add(int newNumber)
	{
		if (newNumber > this.value)	// making the right side of tree numbers bigger than the root
		{
			if (right == null)
			{
				right = new IntegerTreeNode(newNumber);
			}
			else
			{
				right.add(newNumber);
			}
		}
		else // we make the left side for number smaller (or the same)
		{
			if (left == null)
			{
				left = new IntegerTreeNode(newNumber);
			}
			else
			{
				left.add(newNumber);
			}
		}
	}

	public boolean contains(int x)
	{
		if (x == this.value) // we have found it the first plave we looked (the root)
		{
			return true;
		}
		else if (x > this.value)
		{
			if (right == null) // if we're looking for a number higher than root we go right - if right is null the number ain't there
			{
				return false;
			}
			else 
			{
				return right.contains(x); // if right not null we call this method on root.right, etc, etc,
			}
		}
		else 
		{
			if (left == null) 
			{
				return false;
			}
			else
			{
				return left.contains(x);
			}
		}
	}
	
	public int getMax()
	{
		int x = this.value;
		IntegerTreeNode current = this;
		while (current.right != null)
		{
			if (current.right.value > x)
			{
				x = current.right.value;
				current = this.right;
			}
			else 
			{
				break;
			}
		}
		
		return x;
	}
	
	public int getMin()
	{
		int x = this.value;
		IntegerTreeNode current = this;
		while (current.left != null)
		{
			if (current.left.value < x)
			{
				x = current.left.value;
				current = this.left;
			}
			else 
			{
				break;
			}
		}
		
		return x;
	}
	
	/*public String toString(String complex_or_not)
	{
		String result;
		IntegerTreeNode current = this;
		if (complex_or_not == "complex")
		{
			while (current != null)
			{
				result = "[" + this.value;
				if (current.left == null)
				{
					result = result + " L[]";
				}
				else if (current.left != null)
				{
					result = result + " L[" + current.left.value + "]";
				}
				else if (current.right == null)
				{
					result = result + " R[]";
				}
				else if (current.right != null)
				{
					result = result + " R[" + current.right.value + "]";
				}
				
				current = current.*/
				
	public String toString() 
	{
		String s = "[";
			
			if (this.left != null ) 
			{
				s += this.value + this.left.toString()+" ";
			} 
			if (this.right != null) 
			{
				s+= this.value + this.right.toString();
			}
		
		s+= "]";
		return s;
}			
			

}	
	
		
		
