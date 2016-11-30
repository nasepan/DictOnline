import java.util.ArrayList;

public class Server2Client implements Cloneable{

	private ArrayList<String> expBaidu;
	private ArrayList<String> expBing;
	private ArrayList<String> expYoudao;
	private ArrayList<String> online;
	private int[] like;
	private boolean isCard;
	private boolean isLogin;
	private boolean isExp;
	private Card card;
	
	public Server2Client()
	{
		expBaidu = null;
		expYoudao = null;
		expBing = null;
		online = null;
		like = new int[3];
		isCard = false;
		isLogin = false;
		isExp = false;
		card = null;
	}
	public void setExpBaidu(ArrayList<String> expBaidu)
	{
		this.expBaidu = new ArrayList<String>(expBaidu);
	}
	public void setExpBing(ArrayList<String> expBing)
	{
		this.expBing = new ArrayList<String>(expBing);
	}
	public void setExpYoudao(ArrayList<String> expYoudao)
	{
		this.expYoudao = new ArrayList<String>(expYoudao);
	}
	public void setOnline(ArrayList<String> online)
	{
		this.online = new ArrayList<String>(online);
	}
	public void setLike(int[] like)
	{
		this.like = new int[3];
		this.like[1] = like[1];
		this.like[2] = like[2];
		this.like[3] = like[3];
	}
	public void setIsCard(boolean isCard)
	{
		this.isCard = isCard;
	}
	public void setIsLogin(boolean isLogin)
	{
		this.isLogin = isLogin;		
	}
	public void setIsExp(boolean isExp)
	{
		this.isExp = isExp;
	}
	public void setCard(Card card)
	{
		this.card = (Card)card.clone();
	}
	
	public Object clone()
	{
		try
		{
			Server2Client t = (Server2Client)super.clone();
			t.expBaidu = new ArrayList<String>(this.expBaidu);
			t.expBing = new ArrayList<String>(this.expBing);
			t.expYoudao = new ArrayList<String>(this.expYoudao);
			t.online = new ArrayList<String>(this.online);
			t.like[1] = this.like[1];
			t.like[2] = this.like[2];
			t.like[3] = this.like[3];
			t.isCard = this.isCard;
			t.isExp = this.isExp;
			t.isLogin = this.isLogin;
			t.card = (Card)this.card.clone();
			return t;
		}
		catch(CloneNotSupportedException ex)
		{
			return null;
		}
	}
}
