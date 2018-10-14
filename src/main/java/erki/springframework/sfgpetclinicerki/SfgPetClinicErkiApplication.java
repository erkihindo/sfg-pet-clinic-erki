package erki.springframework.sfgpetclinicerki;

import erki.springframework.sfgpetclinicerki.controllers.SomeController;
import lombok.val;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SfgPetClinicErkiApplication {

	public static void main(String[] args) {
		val ctx = SpringApplication.run(SfgPetClinicErkiApplication.class, args);

		SomeController controller = (SomeController) ctx.getBean("someController");
		controller.hello();
	}
}
