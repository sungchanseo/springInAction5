package tacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

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
	
	

}
