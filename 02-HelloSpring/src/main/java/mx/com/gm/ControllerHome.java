
package mx.com.gm;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@Slf4j
public class ControllerHome {
   
    @GetMapping("/")
    public String Home(){
        log.info("executing the controller Spring MVC");
        return "index";
    }
}
