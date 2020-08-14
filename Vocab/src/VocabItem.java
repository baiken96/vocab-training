import javax.swing.ImageIcon;

public class VocabItem
{
	
	ImageIcon pic;
	String word;
	
	public VocabItem(String word, ImageIcon pic)
	{
		
		this.pic = pic;
		this.word = word;
		
	}
	
	public ImageIcon pic()
	{
		
		return pic;
		
	}
	
	public String word()
	{
		
		return word;
		
	}

}