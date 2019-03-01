
public class Produto {

	private int id;
	private String Nome;
	private String Descricao;
	private int preco;
	
	
	private static int idcounter = 0;


	public Produto(String nome, String descricao, int preco) {
		idcounter ++;
		this.id = idcounter;
		Nome = nome;
		Descricao = descricao;
		this.preco = preco;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return Nome;
	}


	public void setNome(String nome) {
		Nome = nome;
	}


	public String getDescricao() {
		return Descricao;
	}


	public void setDescricao(String descricao) {
		Descricao = descricao;
	}


	public int getPreco() {
		return preco;
	}


	public void setPreco(int preco) {
		this.preco = preco;
	}


	public static int getIdcounter() {
		return idcounter;
	}


	public static void setIdcounter(int idcounter) {
		Produto.idcounter = idcounter;
	}


	@Override
	public String toString() {
		return Nome;
	}
	
	
	
}
