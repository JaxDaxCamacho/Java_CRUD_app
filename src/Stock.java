import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class Stock {
	private static Vector<Produto> stock;
	
	public Stock(){
		stock = new Vector<>();
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
		stock.add(new Produto("Garra de Gravidade Subito", " Pequeno e compacto, pode ser usado como gancho de gravidade ou gancho, muito fácil de transportar e usar, coloque-o no seu saco quando precisar.",4));
		stock.add(new Produto("Pulseira de Sobrevivência Ajustável", " Fabricado depende do padrão militar usando 100 por cento de tamanho.",5));
		stock.add(new Produto("Butano Isqueiro Duplo ", " Perfeito para iluminação de cigarros, camping, pesca, caça, churrasco, soldagem ",8));
		stock.add(new Produto("Medical Kits Trauma Pak", "It's all about acting fast and controlling bleeding at the scene so advanced care can be sought later. ",18));
		stock.add(new Produto("Mil-Spec Plus 550 Paracord, 300", "Ideal stuff for tie-downs, cargo transport, camping and more. Cord has 7 inner strands and 550-lb. tensile strength. Strands can be used alone as fishing line or shoe laces. Tug of war anyone? Made in the USA.",9));
		stock.add(new Produto("Saaler Arco Composto", "Arco de força alta, 16-25kg. para caça média. RIS para acessório",220));
		stock.add(new Produto("Saaler Cabeça de Flecha caça grossa", "ponta de flecha de aço para penetração/precisão",12));
		stock.add(new Produto("Umarex Conjunto Flechas Caça x5", "5 flechas de ponta de aço para caça média/pequena",60));
		stock.add(new Produto("cZ USA- Scorpion Evo 3", "Carabina 9mm para caça média/grande, 2 magazines de 40 munições",1029));
		System.out.println("Stock inicializado");
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
		System.out.println("produto "+id+" apagado");
	}
	
	public Vector<Produto> getFullStock(){
		return stock;
	}
	
	public Produto getPrimeiroProduto(){
		return stock.get(0);
	}
	
	public void ordenarPreco(){
		
		}
	
	public void setProduto(int id,int newId, String nome, String descricao, int preco){
		stock.set(id, new Produto(newId, nome, descricao, preco));
	}

	@Override
	public String toString() {
		return "Stock [stock=" + stock + "]";
	}

}
