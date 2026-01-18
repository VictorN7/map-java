package application;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import entity.Product;

public class Program {

    public static void main(String[] args) {

        // TreeMap ordena os elementos pela chave.
        // Como a chave é String, a ordenação é alfabética.
        Map<String, String> cookies = new TreeMap<>();

        // Inserindo elementos no Map (chave, valor)
        cookies.put("username", "João");
        cookies.put("email", "maria@hotmail.com");
        cookies.put("phone", "1199887766");

        // Remove o elemento associado à chave "email"
        cookies.remove("email");

        // O valor será substituído porque o Map NÃO aceita chaves duplicadas
        cookies.put("phone", "1199887733");

        // Verifica se existe a chave
        System.out.println("Contains phone key: " + cookies.containsKey("phone"));

        // Obtém o valor associado à chave
        System.out.println("Phone number: " + cookies.get("phone"));

        // Retorna null, pois a chave foi removida
        System.out.println("email: " + cookies.get("email"));

        // Retorna null, pois a chave nunca existiu
        System.out.println("address: " + cookies.get("address"));

        // Tamanho do Map
        System.out.println("size: " + cookies.size());

        System.out.println("All cookies:");
		
		// keySet - Retorna um Set<K> de cookies. Então permite trazer cada elemento para ser lido pelo foreach
		for (String key : cookies.keySet()) {
			System.out.println(key +": "+cookies.get(key));
		}
		
		// ===============================
        // Exemplo com objeto como chave
        // ===============================

        Map<Product, Double> stock = new HashMap<>();

        stock.put(new Product("TV", 900.0), 10000.0);
        stock.put(new Product("Notebook", 1200.0), 20000.0);
        stock.put(new Product("Tablet", 400.0), 15000.0);

        Product p1 = new Product("Notebook", 1200.0);

        // Só funciona corretamente porque Product sobrescreve equals() e hashCode()
        System.out.println("Contains p1 key: " + stock.containsKey(p1));
	}
}