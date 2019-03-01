import java.util.Vector;

public class Stock {
	private static Vector<Produto> stock;
	
	public Stock(){
		stock = new Vector<>();
		stockTeste();
	}
	
	public void stockTeste(){
		stock.add(new Produto("Xanax", "Calmante de potencia media", 15));
		stock.add(new Produto("Parabellum 9mmx19", "Municoes de baixo calibre", 26));
		stock.add(new Produto("Frago Instantaneo", "Mistura de frago, refeição calorica", 5));
		stock.add(new Produto("Lanterna Military", "Foco de longo alcance", 10));
		stock.add(new Produto("Machado Irony", "Machado multiusos sobrevivencia", 25));
		stock.add(new Produto("Ruger MK1 22Lr", "Pistola para caça pequena", 289));
		stock.add(new Produto("BioLight LightStick", "Stick de iluminação quimica", 1));
		stock.add(new Produto("Tenda Berg", "Tenda para duas pessoas, montagem rapida",399));
	}
	
	public void addProduto(String nome, String descricao, int preco ){
		stock.add(new Produto(nome, descricao, preco));
	}
	
	public int stockSize(){
		return stock.size();
	}
	
	public Produto getProduto(int id){
		return stock.elementAt(id);
	}
	
	public void apagaProduto(int id){
		stock.remove(id);
	}

	@Override
	public String toString() {
		return "Stock [stock=" + stock + "]";
	}

}
