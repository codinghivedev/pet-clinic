package dev.codinghive.petclinic.data.controllers;

import dev.codinghive.petclinic.data.services.OwnerService;
import dev.codinghive.petclinic.data.services.map.OwnerServiceMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping({"/owners"})
@Controller
public class OwnerController {

    @RequestMapping({"","/","/index","/index.html"})
    public String listOwners(){

        return "owners/index";
    }
}
