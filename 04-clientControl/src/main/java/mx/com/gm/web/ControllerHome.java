
package mx.com.gm.web;

import lombok.extern.slf4j.Slf4j;
import mx.com.gm.domain.Person;
import mx.com.gm.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


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

    @GetMapping("/add")
    public String Add(Person person){
     return "modify";
    }

    @PostMapping("/save")
    public String save(Person person){
        personService.save(person);
        return "redirect:/";
    }

    @GetMapping("/edit/{idPerson}")
    public String edit(Person person,Model model){
        person = personService.findPerson(person);
        model.addAttribute("person",person);
        return "modify";
    }

    @GetMapping("/delete/{idPerson}")
    public String delete(Person person){
        personService.delete(person);
        return "redirect:/";
    }
}
