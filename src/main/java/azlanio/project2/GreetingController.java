package azlanio.project2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/")
    public String getGreeting() {
        return "AWS Elastic Beanstalk  Project2 Deployment Successful Too";
    }
}
