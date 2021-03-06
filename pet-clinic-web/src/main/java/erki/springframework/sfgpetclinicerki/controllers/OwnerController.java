package erki.springframework.sfgpetclinicerki.controllers;

import erki.springframework.sfgpetclinicerki.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/owners"})
    public String list(Model model) {
        model.addAttribute("owners", ownerService.findAll());

        return "owner/owners";
    }

    @RequestMapping({"/find"})
    public String find(Model model) {

        return "notimplemented";
    }
}
