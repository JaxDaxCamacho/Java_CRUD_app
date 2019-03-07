import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ConfirmUI extends JPanel{

	JButton Confirmar = new JButton("Confirmar");
	JButton Voltar = new JButton("Voltar");

	
	public ConfirmUI(){
		super();
		setupPage();
		setupActions();
	}
	
	public void setupPage(){
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.weightx = 0.5;
		c.ipadx = 2;
		add(Confirmar, c);
		add(Voltar, c);
	}

	public void setupActions(){
		
	}
}

