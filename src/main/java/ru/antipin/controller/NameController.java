package ru.antipin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.antipin.entity.Name;
import ru.antipin.service.NameService;

@Controller
@RequestMapping("/name")
public class NameController {

    @Autowired
    @Qualifier("rmiNameService")
    private NameService nameService;

    @GetMapping("/create")
    String create(Model model) {
        model.addAttribute("name", new Name());
        return "name-form";
    }

    @GetMapping("/all")
    String findAll(Model model) {
        model.addAttribute("names", nameService.findAll());
        return "names";
    }

    @PostMapping("/save")
    String save(@ModelAttribute Name name) {
        nameService.save(name);
        return "redirect:/name/all";
    }

    @PostMapping("/delete/{id}")
    String delete(@PathVariable Long id) {
        nameService.deleteById(id);
        return "redirect:/name/all";
    }
}
