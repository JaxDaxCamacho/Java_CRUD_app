import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class Produtos extends JPanel{

	private Index index = new Index();
	private CRUDUI crudui = new CRUDUI();
	private Create create = new Create();
	private ConfirmUI confirm = new ConfirmUI();
	Produto aeditar;
	private boolean novo = true;
	
	public Produtos(){
		setLayout(new GridLayout(2,1));
		setupLayout();
		setupActions();
	}
	
	public void setupActions(){	
		crudui.apagarBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Produto p = index.getSelected();
				index.getStock().apagaProduto(p.getId());
				p.reduceCounter();
				p = null;
				index.getLista().setSelectedValue(index.getStock().getPrimeiroProduto(), true);
				//index.setSelected(0);
				updateUI();
			}
		});
		
		crudui.ordenarIdBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				index.ordenarPreco();
				
			}
		});
		
		crudui.criarBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				novo = true;
				createSetUp();
			}
		});
		confirm.Confirmar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(novo){
					index.getStock().addProduto(create.nome.getText(), create.descricao.getText(),(Integer) create.preco.getValue());
					removeAll();
					add(index);
					add(crudui);
					revalidate();
					repaint();
					
				}
				else{
					
					index.getStock().setProduto(aeditar.getId(),aeditar.getId(),create.nome.getText(), create.descricao.getText(),(Integer) create.preco.getValue());
					removeAll();
					add(index);
					add(crudui);
					revalidate();
					repaint();
					novo = true;
				}
				
			}
		});
		crudui.editarBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				aeditar = index.getSelected();
				novo=false;
				createSetUp();

				
			}
		});
	}
	
	public void setupLayout(){
		add(index);
		add(crudui);
	}
	
	public Index getIndex(){
		return this.index;
	}
	
	public void createSetUp(){
		removeAll();
		add(create);
		add(confirm);
		revalidate();
		repaint();
	}
}
