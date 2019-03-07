
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class Index extends JPanel{
	
	private static Stock stock;
	private JList<Produto> lista = new JList<Produto>();
	private JPanel p2;
	private JScrollPane scrollPane;
	private JTextArea  info = new JTextArea(5, 20);
	private JLabel img = new JLabel("");
	
	
	public Index(){
		super();
		this.scrollPane = new JScrollPane();
		stock = new Stock();
		listarStock();
		this.p2 = new JPanel();
		
		setupPage();
		setupActions();
		
		info.setLineWrap(true);
		info.setWrapStyleWord(true);
		
		
	}
	
	public void listarStock(){
		lista = new JList<Produto>(stock.getFullStock());
	}
	
	
	
	// setup da pagina dos produtos
		public void setupPage(){
			setLayout(new GridLayout(1,2));
			add(scrollPane);
			p2.setLayout(new GridLayout(2,1));
			add(p2);
			scrollPane.setViewportView(lista);
			scrollPane.setBackground(Color.BLUE);
			p2.add(img);
			p2.add(info);
			
		}
		
		public void setupActions(){
			lista.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent e) {
					Produto p = lista.getSelectedValue();
					if(p!=null){
					info.setText(p.getDescricao()+" Preço por unidade:"+p.getPreco()+" Eur");
					img.setIcon(new ImageIcon(getClass().getResource("img/"+p.getId()+".jpg")));
					}
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
				public void mouseClicked(MouseEvent e) {
					Produto p = lista.getSelectedValue();
					if(p!=null){
					info.setText(p.getDescricao()+" Preço por unidade:"+p.getPreco()+" Eur");
					img.setIcon(new ImageIcon(getClass().getResource("img/"+p.getId()+".jpg")));
					}
				}
				
			});
		}
		
		public void ordenarPreco(){
			/*Collections.sort(stock, new Comparator<Produto>() {
				@Override
				public int compare(Produto p, Produto p2){
					return Integer.toString(p.getPreco()).compareTo(Integer.toString(p2.getPreco()));
				}
			});*/
		}
		
		public Stock getStock(){
			return stock;
		}
		
		public void setSelected(int i){
			lista.setSelectedValue(i, true);
		}
		
		public Produto getSelected(){
			return lista.getSelectedValue();
		}
		
		public JList getLista(){
			return lista;
		}

}
