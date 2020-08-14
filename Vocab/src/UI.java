import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.Box;

public class UI extends JFrame
{
	
	private JTextField txtInput;
	private ImagePanel imgPanel;
	private JButton btnConfirm;
	private JLabel lblFdbk;
	
	String sone = "abrir";
	String stwo = "cadeira";
	String sthree = "cama";
	String sfour = "cobertor";
	String sfive = "computadora";
	String ssix = "desligar";
	String sseven = "dormir";
	String seight = "estante";
	String snine = "fechar";
	String sten = "figura";
	String seleven = "forno";
	String stwelve = "foto";
	String sthirteen = "geladeira";
	String sfourteen = "janela";
	String sfifteen = "la^mpada";
	String ssixteen = "lar";
	String sseventeen = "lareira";
	String seighteen = "ler";
	String snineteen = "ligar";
	String stwenty = "livro";
	String stwentyone = "lugar";
	String stwentytwo = "mesa";
	String stwentythree = "mobi'lia";
	String stwentyfour = "porta";
	String stwentyfive = "sentar-se";
	String stwentysix = "sofa'";
	String stwentyseven = "talvez";
	String stwentyeight = "telefone";
	String stwentynine = "televisor";
	String sthirty = "travesseiro";
	String sthirtyone = "vizinho";
	String sthirtytwo = null;
	String sthirtythree = null;
	String sthirtyfour = null;
	String sthirtyfive = null;
	String sthirtysix = null;
	String sthirtyseven = null;
	String sthirtyeight = null;
	String sthirtynine = null;
	String sforty = null;
	String sfortyone = null;
	String sfortytwo = null;
	String sfortythree = null;
	String sfortyfour = null;
	String sfortyfive = null;
	String sfortysix = null;
	String sfortyseven = null;
	String sfortyeight = null;
	String sfortynine = null;
	String sfifty = null;
	String sfiftyone = null;
	String sfiftytwo = null;
	String sfiftythree = null;
	
	VocabItem one = new VocabItem(sone, new ImageIcon("C:/Users/beaik/Vocab/src/"+sone+".jpg"));
	VocabItem two = new VocabItem(stwo, new ImageIcon("C:/Users/beaik/Vocab/src/"+stwo+".jpg"));
	VocabItem three = new VocabItem(sthree, new ImageIcon("C:/Users/beaik/Vocab/src/"+sthree+".jpg"));
	VocabItem four = new VocabItem(sfour, new ImageIcon("C:/Users/beaik/Vocab/src/"+sfour+".jpg"));
	VocabItem five = new VocabItem(sfive, new ImageIcon("C:/Users/beaik/Vocab/src/"+sfive+".jpg"));
	VocabItem six = new VocabItem(ssix, new ImageIcon("C:/Users/beaik/Vocab/src/"+ssix+".jpg"));
	VocabItem seven = new VocabItem(sseven, new ImageIcon("C:/Users/beaik/Vocab/src/"+sseven+".jpg"));
	VocabItem eight = new VocabItem(seight, new ImageIcon("C:/Users/beaik/Vocab/src/"+seight+".jpg"));
	VocabItem nine = new VocabItem(snine, new ImageIcon("C:/Users/beaik/Vocab/src/"+snine+".jpg"));
	VocabItem ten = new VocabItem(sten, new ImageIcon("C:/Users/beaik/Vocab/src/"+sten+".jpg"));
	VocabItem eleven = new VocabItem(seleven, new ImageIcon("C:/Users/beaik/Vocab/src/"+seleven+".jpg"));
	VocabItem twelve = new VocabItem(stwelve, new ImageIcon("C:/Users/beaik/Vocab/src/"+stwelve+".jpg"));
	VocabItem thirteen = new VocabItem(sthirteen, new ImageIcon("C:/Users/beaik/Vocab/src/"+sthirteen+".jpg"));
	VocabItem fourteen = new VocabItem(sfourteen, new ImageIcon("C:/Users/beaik/Vocab/src/"+sfourteen+".jpg"));
	VocabItem fifteen = new VocabItem(sfifteen, new ImageIcon("C:/Users/beaik/Vocab/src/"+sfifteen+".jpg"));
	VocabItem sixteen = new VocabItem(ssixteen, new ImageIcon("C:/Users/beaik/Vocab/src/"+ssixteen+".jpg"));
	VocabItem seventeen = new VocabItem(sseventeen, new ImageIcon("C:/Users/beaik/Vocab/src/"+sseventeen+".jpg"));
	VocabItem eighteen = new VocabItem(seighteen, new ImageIcon("C:/Users/beaik/Vocab/src/"+seighteen+".jpg"));
	VocabItem nineteen = new VocabItem(snineteen, new ImageIcon("C:/Users/beaik/Vocab/src/"+snineteen+".jpg"));
	VocabItem twenty = new VocabItem(stwenty, new ImageIcon("C:/Users/beaik/Vocab/src/"+stwenty+".jpg"));
	VocabItem twentyone = new VocabItem(stwentyone, new ImageIcon("C:/Users/beaik/Vocab/src/"+stwentyone+".jpg"));
	VocabItem twentytwo = new VocabItem(stwentytwo, new ImageIcon("C:/Users/beaik/Vocab/src/"+stwentytwo+".jpg"));
	VocabItem twentythree = new VocabItem(stwentythree, new ImageIcon("C:/Users/beaik/Vocab/src/"+stwentythree+".jpg"));
	VocabItem twentyfour = new VocabItem(stwentyfour, new ImageIcon("C:/Users/beaik/Vocab/src/"+stwentyfour+".jpg"));
	VocabItem twentyfive = new VocabItem(stwentyfive, new ImageIcon("C:/Users/beaik/Vocab/src/"+stwentyfive+".jpg"));
	VocabItem twentysix = new VocabItem(stwentysix, new ImageIcon("C:/Users/beaik/Vocab/src/"+stwentysix+".jpg"));
	VocabItem twentyseven = new VocabItem(stwentyseven, new ImageIcon("C:/Users/beaik/Vocab/src/"+stwentyseven+".jpg"));
	VocabItem twentyeight = new VocabItem(stwentyeight, new ImageIcon("C:/Users/beaik/Vocab/src/"+stwentyeight+".jpg"));
	VocabItem twentynine = new VocabItem(stwentynine, new ImageIcon("C:/Users/beaik/Vocab/src/"+stwentynine+".jpg"));
	VocabItem thirty = new VocabItem(sthirty, new ImageIcon("C:/Users/beaik/Vocab/src/"+sthirty+".jpg"));
	VocabItem thirtyone = new VocabItem(sthirtyone, new ImageIcon("C:/Users/beaik/Vocab/src/"+sthirtyone+".jpg"));
	VocabItem thirtytwo = new VocabItem(sthirtytwo, new ImageIcon("C:/Users/beaik/Vocab/src/"+sthirtytwo+".jpg"));
	VocabItem thirtythree = new VocabItem(sthirtythree, new ImageIcon("C:/Users/beaik/Vocab/src/"+sthirtythree+".jpg"));
	VocabItem thirtyfour = new VocabItem(sthirtyfour, new ImageIcon("C:/Users/beaik/Vocab/src/"+sthirtyfour+".jpg"));
	VocabItem thirtyfive = new VocabItem(sthirtyfive, new ImageIcon("C:/Users/beaik/Vocab/src/"+sthirtyfive+".jpg"));
	VocabItem thirtysix = new VocabItem(sthirtysix, new ImageIcon("C:/Users/beaik/Vocab/src/"+sthirtysix+".jpg"));
	VocabItem thirtyseven = new VocabItem(sthirtyseven, new ImageIcon("C:/Users/beaik/Vocab/src/"+sthirtyseven+".jpg"));
	VocabItem thirtyeight = new VocabItem(sthirtyeight, new ImageIcon("C:/Users/beaik/Vocab/src/"+sthirtyeight+".jpg"));
	VocabItem thirtynine = new VocabItem(sthirtynine, new ImageIcon("C:/Users/beaik/Vocab/src/"+sthirtynine+".jpg"));
	VocabItem forty = new VocabItem(sforty, new ImageIcon("C:/Users/beaik/Vocab/src/"+sforty+".jpg"));
	VocabItem fortyone = new VocabItem(sfortyone, new ImageIcon("C:/Users/beaik/Vocab/src/"+sfortyone+".jpg"));
	VocabItem fortytwo = new VocabItem(sfortytwo, new ImageIcon("C:/Users/beaik/Vocab/src/"+sfortytwo+".jpg"));
	VocabItem fortythree = new VocabItem(sfortythree, new ImageIcon("C:/Users/beaik/Vocab/src/"+sfortythree+".jpg"));
	VocabItem fortyfour = new VocabItem(sfortyfour, new ImageIcon("C:/Users/beaik/Vocab/src/"+sfortyfour+".jpg"));
	VocabItem fortyfive = new VocabItem(sfortyfive, new ImageIcon("C:/Users/beaik/Vocab/src/"+sfortyfive+".jpg"));
	VocabItem fortysix = new VocabItem(sfortysix, new ImageIcon("C:/Users/beaik/Vocab/src/"+sfortysix+".jpg"));
	VocabItem fortyseven = new VocabItem(sfortyseven, new ImageIcon("C:/Users/beaik/Vocab/src/"+sfortyseven+".jpg"));
	VocabItem fortyeight = new VocabItem(sfortyeight, new ImageIcon("C:/Users/beaik/Vocab/src/"+sfortyeight+".jpg"));
	VocabItem fortynine = new VocabItem(sfortynine, new ImageIcon("C:/Users/beaik/Vocab/src/"+sfortynine+".jpg"));
	VocabItem fifty = new VocabItem(sfifty, new ImageIcon("C:/Users/beaik/Vocab/src/"+sfifty+".jpg"));
	VocabItem fiftyone = new VocabItem(sfiftyone, new ImageIcon("C:/Users/beaik/Vocab/src/"+sfiftyone+".jpg"));
	VocabItem fiftytwo = new VocabItem(sfiftytwo, new ImageIcon("C:/Users/beaik/Vocab/src/"+sfiftytwo+".jpg"));
	VocabItem fiftythree = new VocabItem(sfiftythree, new ImageIcon("C:/Users/beaik/Vocab/src/"+sfiftythree+".jpg"));
	
	VocabItem[] vocabulary = {one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen,
			sixteen, seventeen, eighteen, nineteen, twenty, twentyone, twentytwo, twentythree, twentyfour, twentyfive,
			twentysix, twentyseven, twentyeight, twentynine, thirty, thirtyone};/*, thirtytwo, thirtythree, thirtyfour,
			thirtyfive, thirtysix, thirtyseven, thirtyeight, thirtynine, forty, fortyone, fortytwo, fortythree, fortyfour,
			fortyfive, fortysix, fortyseven, fortyeight, fortynine, fifty, fiftyone, fiftytwo, fiftythree};*/
	
	Random r = new Random();
	
	int slot = 0;
	int count = 0;
	
	ConfirmHelper cfh = new ConfirmHelper();
	ClearHelper clh = new ClearHelper();
	EnterHelper eh = new EnterHelper();
	
	public UI()
	{
		
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		
		imgPanel = new ImagePanel();
		imgPanel.setPreferredSize(new Dimension(500, 500));
		getContentPane().add(imgPanel);
		
		Component verticalGlue = Box.createVerticalGlue();
		getContentPane().add(verticalGlue);
		
		JPanel fdbkPanel = new JPanel();
		getContentPane().add(fdbkPanel);
		
		lblFdbk = new JLabel("");
		fdbkPanel.add(lblFdbk);
		
		JPanel inptPanel = new JPanel();
		getContentPane().add(inptPanel);
		
		JLabel lblInput = new JLabel("Input:");
		inptPanel.add(lblInput);
		
		txtInput = new JTextField();
		inptPanel.add(txtInput);
		txtInput.setColumns(10);
		
		JPanel btnPanel = new JPanel();
		getContentPane().add(btnPanel);
		
		btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(cfh);
		btnPanel.add(btnConfirm);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(clh);
		btnPanel.add(btnClear);

		txtInput.setFocusable(true);
		txtInput.addKeyListener(eh);
		
		this.setPreferredSize(new Dimension(800, 500));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		
	}
	
	public void genWord()
	{
		
		if (empty(vocabulary))
			System.exit(-1);
		
		if (!empty(vocabulary))
		{
			
			do
			{
				
				slot = r.nextInt(vocabulary.length);
				
			} while (vocabulary[slot] == null);
			
		}
		
		imgPanel.removeAll();
		imgPanel.setImage(vocabulary[slot].pic());
		imgPanel.repaint();
		
	}
	
	void check()
	{
		
		if (!empty(vocabulary) && !txtInput.getText().equals(vocabulary[slot].word()))
		{
			
			count++;
			
			if (count == 1)
			{
				
				lblFdbk.setText("X - INCORRECT");
				
			}
			
			if (count == 2)
			{
				
				lblFdbk.setText("The first letter is " + vocabulary[slot].word().substring(0, 1));
				
			}
			if (count == 3)
			{
				
				lblFdbk.setText("Wrong, it was " + vocabulary[slot].word());
				genWord();
				
			}
			if (count == 4)
			{

				lblFdbk.setText("");
				count = 0;

			}
			
		}	
				
		else
		{
		
			vocabulary[slot] = null;
			slot = 0;
			count = 0;
			lblFdbk.setText("");
			txtInput.setText("");
			genWord();
		
		}
			
	}
	
	boolean empty(Object[] array)
	{
		
		for (int i = 0; i < array.length; i++)
		{
			
			if (array[i] != null)
				return false;
			
		}
		
		return true;
		
	}
	
	
	
	private class ConfirmHelper implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0)
		{

			check();
			
		}
		
	}
	
	private class EnterHelper implements KeyListener
	{

		@Override
		public void keyPressed(KeyEvent k)
		{

			if (k.getKeyCode() == KeyEvent.VK_ENTER)
				check();
			
		}

		@Override
		public void keyReleased(KeyEvent e)
		{
		}

		@Override
		public void keyTyped(KeyEvent e)
		{
		}
		
	}
	
	private class ClearHelper implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0)
		{

			txtInput.setText("");
			
		}
		
	}

}
