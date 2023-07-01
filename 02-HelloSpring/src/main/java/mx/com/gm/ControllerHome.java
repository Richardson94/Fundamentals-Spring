
package mx.com.gm;

import lombok.extern.slf4j.Slf4j;
import mx.com.gm.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;


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

        var person2 = new Person();
        person2.setName("Carla");
        person2.setLastName("Gomez");
        person2.setEmail("Car12@mail.com");
        person2.setPhone("64897");

        List<Person> persons = new ArrayList<>();
        persons.add(person);
        persons.add(person2);
        model.addAttribute("message",message);
        model.addAttribute("Person",person);
        model.addAttribute("PersonsList",persons);
        return "index";
    }
}
