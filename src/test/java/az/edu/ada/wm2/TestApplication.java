package az.edu.ada.wm2;

import az.edu.ada.wm2.lab6.Lab6Application;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan(
        basePackages = "az.edu.ada.wm2.lab6",
        excludeFilters = @ComponentScan.Filter(
                type = FilterType.ASSIGNABLE_TYPE,
                classes = Lab6Application.class
        )
)
public class TestApplication {
}
