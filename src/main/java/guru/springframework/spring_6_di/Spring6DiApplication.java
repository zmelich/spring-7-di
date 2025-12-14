package guru.springframework.spring_6_di;

import guru.springframework.spring_6_di.controllers.assignment4.DataSourceController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring6DiApplication {

	public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Spring6DiApplication.class, args);

        DataSourceController controller = ctx.getBean(DataSourceController.class);


        System.out.println("In Main method");

        System.out.println(controller.getDataSourceString());
	}

}
