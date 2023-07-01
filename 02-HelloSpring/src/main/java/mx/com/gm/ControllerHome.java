
package mx.com.gm;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;


@Controller
@Slf4j
public class ControllerHome {
   
    @GetMapping("/")
    public String Home(Model model){
        var message = "hello world from Thymeleaf";
        log.info("executing the controller Spring MVC");
        model.addAttribute("message",message);
        return "index";
    }
}
