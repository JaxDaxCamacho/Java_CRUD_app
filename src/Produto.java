
public class Produto {

	private int id;
	private String Nome;
	private String Descricao;
	private int preco;
	
	
	private static int idcounter = 0;


	public Produto(String nome, String descricao, int preco) {
		this.id = idcounter;
		Nome = nome;
		Descricao = descricao;
		this.preco = preco;
		idcounter ++;
	}
	
	public Produto(int newId,String nome, String descricao, int preco) {
		this.id = newId;
		Nome = nome;
		Descricao = descricao;
		this.preco = preco;
		idcounter ++;
	}


	public int getId() {
		return this.id;
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
	
	public void reduceCounter(){
		idcounter--;
	}
	
	
	
}
