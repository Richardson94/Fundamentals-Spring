
package mx.com.gm;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ControllerHome {
   
    @GetMapping("/")
    public String Home(){
        log.info("executing the controller Rest");
        return "Hello World from springBoot";
    }
}
