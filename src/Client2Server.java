public class Client2Server implements Cloneable{

	private String word;
	private String id;
	private String password;
	private String dst;
	private boolean isLogin;
	private boolean isReg;
	private boolean isSearch;
	private boolean isCard;
	private boolean[] like;
	private Card card;
	
	public Client2Server()
	{
		word = null;
		id = null;
		password = null;
		dst = null;
		isLogin = false;
		isReg = false;
		isSearch = false;
		isCard = false;
		card = null;
	}
	public String getWord()
	{
		return this.word;
	}
	public String getID()
	{
		return id;
	}
	public String getPassWord()
	{
		return password;
	}
	public String getDst()
	{
		return dst;
	}
	public boolean getIsLogin()
	{
		return isLogin;
	}
	public boolean getIsReg()
	{
		return isReg;
	}
	public boolean getIsSearch()
	{
		return isSearch;
	}
	public boolean getIsCard()
	{
		return isCard;
	}
	public boolean[] getLike()
	{
		return like;
	}
	public Card getCard()
	{
		return card;
	}
	public void setWord(String word)
	{
		this.word = new String(word);
	}
	public void setID(String id)
	{
		this.id = new String(id);
	}
	public void setPassword(String password)
	{
		this.password = new String(password);
	}
	public void setDst(String dst)
	{
		this.dst = new String(dst);
	}
	public void setLogin(boolean isLogin)
	{
		this.isLogin = isLogin;
	}
	public void setReg(boolean isReg)
	{
		this.isReg = isReg;
	}
	public void setSearch(boolean isSearch)
	{
		this.isSearch = isSearch;
	}
	public void setIsCard(boolean isCard)
	{
		this.isCard = isCard;
	}
	public void setLike(boolean[] like)
	{
		this.like = new boolean[like.length];
		for(int i = 0; i < like.length; i++)
		{
			this.like[i] = like[i];
		}
	}
	public void setCard(Card card)
	{
		this.card = (Card)card.clone();
	}

	public Object clone()
	{
		try
		{
			Client2Server t = (Client2Server)super.clone();
			t.word = new String(this.word);
			t.id = new String(this.id);
			t.password = new String(this.password);
			t.dst = new String(this.dst);
			t.isLogin = this.isLogin;
			t.isReg = this.isReg;
			t.isSearch = this.isSearch;
			t.isCard = this.isCard;
			t.like = new boolean[this.like.length];
			for(int i = 0; i < this.like.length; i++)
			{
				t.like[i] = this.like[i];
			}
			t.card = (Card) this.card.clone();
			return t;
		}
		catch(CloneNotSupportedException ex)
		{
			return null;
		}
	}
}
