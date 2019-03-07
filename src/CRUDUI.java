import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

public class CRUDUI extends JPanel {

	
	JLabel space =new JLabel("");
	
	JButton editarBtn = new JButton("Editar Produto");
	JButton apagarBtn = new JButton("Apagar Produto");
	JButton criarBtn = new JButton("Criar novo Produto");
	JButton ordenarPrecoBtn = new JButton("Ordenar Eur");
	JButton ordenarIdBtn = new JButton("Ordenar #");
	
	public CRUDUI(){
		super();
		setupPage();
		setupActions();
	}
	
	public void setupPage(){
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		GridBagConstraints c2 = new GridBagConstraints();
		
		c.weightx = 0.5;
		c.ipadx = 2;
		c2.ipadx = 0;
		c2.weighty =1;
		c2.gridy = 2;
		
		add(editarBtn,c2);
		add(apagarBtn,c2);
		add(criarBtn,c2);
		add(space);
		add(ordenarPrecoBtn,c);
		add(ordenarIdBtn,c);
	}
	
	public void setupActions(){
		
		
	}
	
	public JButton editarBtn(){
		return editarBtn;
	}
	public JButton apagarBtn(){
		return apagarBtn;
	}
	public JButton criarBtn(){
		return criarBtn;
	}
	public JButton ordenarPrecoBtn(){
		return ordenarPrecoBtn;
	}
	public JButton ordenarIdBtn(){
		return ordenarIdBtn;
	}
}
