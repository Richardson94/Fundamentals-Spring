
package mx.com.gm.web;

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


        return "index";
    }
}
