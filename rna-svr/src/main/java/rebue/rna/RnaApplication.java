package rebue.rna;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.SpringCloudApplication;

@ServletComponentScan("rebue")
@SpringCloudApplication
public class RnaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RnaApplication.class, args);
	}

}
