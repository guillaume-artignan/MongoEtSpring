package com.ipi.nosql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/ban")
public class BanController  {

    @Autowired
    AddressRepository repo;

    @RequestMapping("/all")
    public Page<Address> all(Pageable p,
                             @RequestParam(value="ville",required = false) String ville){
        if (ville==null)
        return repo.findAll(p);
        else return repo.trouveParVille(p,ville);

    }
}
