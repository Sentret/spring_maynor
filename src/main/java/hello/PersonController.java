package hello;

/**
 * Created by eugene on 18.05.17.
 */


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PersonController {
    @Autowired
    PersonRepository personRepository;
    @RequestMapping("/")
    public ModelAndView peopleList() { return new ModelAndView("person", "people", personRepository.findAll()); }
}
