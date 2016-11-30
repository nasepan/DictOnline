import java.util.ArrayList;

public class Card implements Cloneable{

	private ArrayList<String> exp;
	private String dst;
	public Card()
	{
		exp = null;
		dst = null;
	}

	public Card(ArrayList<String> exp, String dst)
	{
		this.exp = exp;
		this.dst = dst;
	}

	public void setDst(String dst)
	{
		this.dst = dst;
	}
	public void setExp(ArrayList<String> ext)
	{
		this.exp = new ArrayList<String>(exp);
	}
	public Object clone()
	{
		try
		{
			Card t = (Card)super.clone();
			t.dst = new String(this.dst);
			t.exp = new ArrayList<String>(this.exp);
			return t;
		}
		catch(CloneNotSupportedException ex)
		{
			return null;
		}
	}
}
