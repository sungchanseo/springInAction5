package tacos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import tacos.Ingredient.Type;
import tacos.data.IngredientRepository;

@SpringBootApplication
public class TacoCloudApplication implements WebMvcConfigurer{

	public static void main(String[] args) {
		SpringApplication.run(TacoCloudApplication.class, args);
	}

	//따로 WebConfig 화일을 만들 수도 있지만, 부트스트랩을 통해 맵핑할 수도 있다. 
	//하지만, 부트스트랩의 단순성, 관심사의 분리를 위해서는 따로 만드는 것이 좋다. 
//	@Override
//	public void addViewControllers(ViewControllerRegistry registry) {
//		registry.addViewController("/").setViewName("home");
//	}
	
	@Bean
	public CommandLineRunner dataLoader (IngredientRepository repo) {
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				repo.save(new Ingredient("FLTO", "Flour Tortilla", Type.WRAP));
				repo.save(new Ingredient("COTO", "Corn Tortilla", Type.WRAP));
				repo.save(new Ingredient("GRBF", "Ground Beef", Type.PROTEIN));
				repo.save(new Ingredient("CARN", "Carnitas", Type.PROTEIN));
				repo.save(new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES));
				repo.save(new Ingredient("LETC", "Lettuce", Type.VEGGIES));
				repo.save(new Ingredient("CHED", "Cheddar", Type.CHEESE));
				repo.save(new Ingredient("JACK", "Monterrey Jack", Type.CHEESE));
				repo.save(new Ingredient("SLSA", "Salsa", Type.SAUCE));
				repo.save(new Ingredient("SRCR", "Sour Cream", Type.SAUCE));
				
			}
		};
	}
	

}
