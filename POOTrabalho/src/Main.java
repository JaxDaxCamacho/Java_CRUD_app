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
	JPanel p = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	
	
	
	Menu menu = new Menu();
	
	// objectos para navegacao
	Index index = new Index();
	Create create = new Create();
	Ajuda ajuda = new Ajuda();
	Edit edit = new Edit();
	
	Alert alerta = new Alert();
	CRUDUI crudui = new CRUDUI();
	
	
	public Main(){
		setSize(800,600);
		setTitle("Gestor de Stock- Loja de Caça e Sobrevivencia ");
		setLayout(new BorderLayout());
		setupLayout();
		setupActions();
		setVisible(true);
	}
	
	
	
	
	
	public void setupActions(){	
		
	}
	
	
	
	
	// setup do menu de navegacao
	public void setupLayout(){
		setJMenuBar(menu.getMenu());
		setLayout(new GridLayout(2,1));
		add(index);
		add(crudui);
	}

	public static void main(String[] args) {
		Main m = new Main();
		

	}

}
