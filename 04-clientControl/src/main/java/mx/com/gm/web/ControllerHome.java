
package mx.com.gm.web;

import lombok.extern.slf4j.Slf4j;
import mx.com.gm.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@Slf4j
public class ControllerHome {
    @Autowired
    private PersonaService personService;
    @GetMapping("/")
    public String Home(Model model){
        var persons = personService.listPersons();

        return "index";
    }
}
