import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu {
	
	public Menu(){
		setupMenu();
		
	}
		private JMenuBar MB = new JMenuBar();
		private JMenu Home = new JMenu("Home");
		private JMenu Produtos = new JMenu("Produtos");
		private JMenu Ajuda = new JMenu("Ajuda");
		private JMenu Sair = new JMenu("Sair");
		private JMenuItem Novo = new JMenuItem("Novo Produto");
		private JMenuItem Index = new JMenuItem("Listar Produtos");
		private JMenuItem Edit = new JMenuItem("Editar/Apagar Produto");
		private JMenuItem About = new JMenuItem("Sobre");
		private JMenuItem Version = new JMenuItem("Version");
	
	
	public void setupMenu(){
		MB.add(Home);
		MB.add(Produtos);
		MB.add(Ajuda);
		MB.add(Sair);
		Produtos.add(Index);
		Produtos.add(Novo);
		Produtos.add(Edit);
		Ajuda.add(About);
		Ajuda.add(Version);
		
	}
	
	public JMenuBar getMenu(){
		return this.MB;
	}

}
