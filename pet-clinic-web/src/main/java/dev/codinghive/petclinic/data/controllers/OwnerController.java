package dev.codinghive.petclinic.data.controllers;

import dev.codinghive.petclinic.data.services.OwnerService;
import dev.codinghive.petclinic.data.services.map.OwnerServiceMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class OwnerController {
    @Autowired
    dev.codinghive.petclinic.data.services.map.OwnerServiceMap OwnerServiceMap;
}
