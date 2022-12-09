package com.hair.ryan_hair_back.controller;

import com.hair.ryan_hair_back.model.Haircut;
import com.hair.ryan_hair_back.service.HaircutService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/haircut")
public class HaircutController {

    private HaircutService haircutService;

    public HaircutController(HaircutService haircutService) {
        this.haircutService = haircutService;
    }

    @GetMapping()
    public Iterable<Haircut> readHaircut(){
        return haircutService.readHaircut();
    }

    @GetMapping("/{id}")
    public Optional<Haircut> readOneHaircut(@PathVariable Long id){
        return haircutService.readOneHaircut(id);
    }

    @PostMapping()
    public Haircut createHaircut(@RequestBody Haircut haircut){
        return haircutService.createHaircut(haircut);
    }

    @DeleteMapping("/{id}")
    public void deleteHaircut(@PathVariable Long id){
        haircutService.deleteHaircut(id);
    }

    @PutMapping("/{id}")
    public Haircut updateHaircut(@PathVariable Long id, @RequestBody Haircut haircut){
        return haircutService.updateHaircut(id, haircut);
    }
}
