
package mx.com.gm;

import lombok.extern.slf4j.Slf4j;
import mx.com.gm.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;


@Controller
@Slf4j
public class ControllerHome {
   
    @GetMapping("/")
    public String Home(Model model){
        var message = "hello world from Thymeleaf";
        var person = new Person();
        person.setName("Richard");
        person.setLastName("Cori");
        person.setEmail("Richard@mail.com");
        person.setPhone("123456");
        log.info("executing the controller Spring MVC");
        model.addAttribute("message",message);
        model.addAttribute("Person",person);
        return "index";
    }
}
