import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

public class Index extends JPanel{
	
	private Stock stock;
	private JList<Produto> lista;
	private JPanel p;
	private JPanel p2;
	private JLabel lbl = new JLabel("");
	private JLabel img = new JLabel("Imagem");
	
	public Index(){
		super();
		this.stock = new Stock();
		this.lista = new JList<Produto>(listarStock());
		this.p = new JPanel();
		this.p2 = new JPanel();
		setupPage();
		setupActions();
	}
	
	
	
	public Vector<Produto> listarStock(){
		 Vector<Produto> tmp = new Vector<Produto>();
		 for(int i=0; i < stock.stockSize();i++){
			 tmp.add(stock.getProduto(i));
		 }
		 return tmp;
	}
	
	// setup da pagina dos produtos
		public void setupPage(){
			setLayout(new GridLayout(1,2));
			add(p);
			p.setLayout(new BorderLayout());
			p2.setLayout(new GridLayout(2,1));
			add(p2);
			p.add(lista);
			p.setBackground(Color.BLUE);
			p2.add(img);
			p2.add(lbl);
			
		}
		
		public void setupActions(){
			lista.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent arg0) {
					Produto p = lista.getSelectedValue();
					lbl.setText(p.getDescricao());
					
				}
				
				@Override
				public void mousePressed(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseExited(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseClicked(MouseEvent arg0) {
					Produto p = lista.getSelectedValue();
					lbl.setText(p.getDescricao());
					
				}
				
			});
		}

}
