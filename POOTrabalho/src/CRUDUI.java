import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

public class CRUDUI extends JPanel {

	private Stock stock;
	
	JLabel space =new JLabel("");
	JButton editarBtn = new JButton("Editar Produto");
	JButton apagarBtn = new JButton("Apagar Produto");
	JButton criarBtn = new JButton("Criar novo Produto");
	JButton ordenarPrecoBtn = new JButton("Ordenar Eur");
	JButton ordenarIdBtn = new JButton("Ordenar #");
	
	public CRUDUI(){
		super();
		this.stock = new Stock();
		setupPage();
		setupActions();
	}
	
	public void setupPage(){
		setLayout(new GridLayout(3,2));
		add(editarBtn);
		add(apagarBtn);
		add(criarBtn);
		add(space);
		add(ordenarPrecoBtn);
		add(ordenarIdBtn);
	}
	
	public void setupActions(){
		
	}
}
