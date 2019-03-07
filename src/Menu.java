import javax.swing.JButton;
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
		
		private JMenuItem home = new JMenuItem("Pagina Principal");
		private JMenuItem leave = new JMenuItem("Fechar aplicativo");
		private JMenuItem Novo = new JMenuItem("Novo Produto");
		private JMenuItem Index = new JMenuItem("Listar Produtos");
		private JMenuItem About = new JMenuItem("Sobre");
		private JMenuItem Version = new JMenuItem("Version");
	
	
	public void setupMenu(){
		MB.add(Home);
		MB.add(Produtos);
		MB.add(Ajuda);
		MB.add(Sair);
		Home.add(home);
		Sair.add(leave);
		Produtos.add(Index);
		Produtos.add(Novo);
		Ajuda.add(About);
		Ajuda.add(Version);
		
	}
	
	public JMenuBar getMenu(){
		return this.MB;
	}
	
	public JMenuItem homeBtn(){
		return home;
	}
	
	public JMenuItem leaveBtn(){
		return leave;
	}

	public JMenuItem IndexBtn(){
		return Index;
	}

	public JMenuItem NovoBtn(){
		return Novo;
	}

	
	public JMenuItem AboutBtn(){
		return About;
	}
	
	public JMenuItem VersiontBtn(){
		return Version;
	}


}
