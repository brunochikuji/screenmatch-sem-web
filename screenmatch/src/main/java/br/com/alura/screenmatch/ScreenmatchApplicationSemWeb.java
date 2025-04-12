//package br.com.alura.screenmatch;
//
//import br.com.alura.screenmatch.principal.Principal;
//import br.com.alura.screenmatch.repository.SerieRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//
//@SpringBootApplication
//public class ScreenmatchApplicationSemWeb implements CommandLineRunner {
//
//	@Autowired
//	private SerieRepository repositorio;
//
//	public static void main(String[] args) {
//		SpringApplication.run(ScreenmatchApplicationSemWeb.class, args);
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		Principal principal = new Principal(repositorio);
//		principal.exibeMenu();
//
////		List<DadosTemporada> temporadas = new ArrayList<>();
////
////		for(int i = 1; i <= dados.totalTemporadas(); i ++) {
////			json = consumo.obterDados("http://www.omdbapi.com/?t=gilmore+girls&Season=" + i + "&apikey=72fd5992");
////			DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
////			temporadas.add(dadosTemporada);
////		}
////
////		temporadas.forEach(System.out::println);
//
//	}
//
//}
