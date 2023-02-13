package mall.common;


import mall.DeveryApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { DeveryApplication.class })
public class CucumberSpingConfiguration {
    
}
