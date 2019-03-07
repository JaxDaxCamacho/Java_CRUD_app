import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main extends JFrame {
	
	
	
	
	//instaciacao dos paineis
	private JPanel p = new JPanel();
	
	
	
	private Menu menu = new Menu();
	
	// objectos para navegacao
	private Home home = new Home();
	private Produtos produtos = new Produtos();
	private Create create = new Create();
	private Ajuda ajuda = new Ajuda();
	private Version version = new Version();
	private Edit edit = new Edit();
	
	private JLabel Welcome = new JLabel("Welcome message");
	
	private Alert alerta = new Alert();
	
	private static boolean startup =false;
	
	public Main(){
		setSize(800,600);
		setTitle("Gestor de Stock- Loja de Caça e Sobrevivencia ");
		setLayout(new BorderLayout());
		setupLayout();
		setupActions();
		startUp();
		produtos.getIndex().getStock().stockTeste();
		setVisible(true);
	}
	
	public void setupLayout(){
		setJMenuBar(menu.getMenu());
		setLayout(new BorderLayout());
		add(p);
		p.setLayout(new BorderLayout());
		
	}
	
	public void startUp(){
		if(!startup){
			p.add(home);
		}
	}
	
	public void setupActions(){	
		menu.IndexBtn().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				p.removeAll();
				produtos.removeAll();
				produtos.setupLayout();
				p.add(produtos);
				revalidate();
				repaint();
				
				
			}
		});
		
		
	menu.NovoBtn().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					p.removeAll();
					produtos.createSetUp();
					p.add(produtos);
					revalidate();
					repaint();
					
					
				}
			});
	
	menu.VersiontBtn().addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			p.removeAll();
			p.add(version);
			revalidate();
			repaint();
			
		}
	});
	
	menu.AboutBtn().addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			p.removeAll();
			p.add(ajuda);
			revalidate();
			repaint();
			
		}
	});
	
	menu.homeBtn().addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			p.removeAll();
			p.add(home);
			revalidate();
			repaint();
			
		}
	});
	
	menu.leaveBtn().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	

	
	
	
	
	// setup do menu de navegacao
	

	public static void main(String[] args) {
		Main m = new Main();
		

	}

}
