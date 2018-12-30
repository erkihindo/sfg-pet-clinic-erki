package erki.springframework.sfgpetclinicerki.controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController implements ErrorController {

    @RequestMapping({"/", "", "index.html"})
    public String index() {

        return "index";
    }

    private static final String PATH = "/error";

    @RequestMapping(value = PATH)
    public String error() {
        return "notimplemented";
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }
}
