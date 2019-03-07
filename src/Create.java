import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class Create extends JPanel{

	JTextField nome = new JTextField("Nome do Produto");
	JTextField descricao = new JTextField("Descricao do produto",4);
	JSpinner preco = new JSpinner();
	
	public Create(){
		super();
		setupPage();
		setupActions();
	}
	
	public void setupPage(){
		setLayout(new GridLayout(3,1));
		add(nome);
		add(descricao);
		add(preco);
	}

	public void setupActions(){
		
	}
}
