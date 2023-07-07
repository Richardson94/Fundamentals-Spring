
package mx.com.gm.web;

import lombok.extern.slf4j.Slf4j;
import mx.com.gm.dao.IPersonDao;
import mx.com.gm.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;


@Controller
@Slf4j
public class ControllerHome {
    @Autowired
    private IPersonDao personDao;
    @GetMapping("/")
    public String Home(Model model){
        var persons = personDao.findAll();

        return "index";
    }
}
