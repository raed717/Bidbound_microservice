package com.bidbound.microservice.parimicroservice.controller;

import com.bidbound.microservice.parimicroservice.entite.Pari;
import com.bidbound.microservice.parimicroservice.service.IPariService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/paris")
public class PariController {

    private IPariService pariService ;
    @GetMapping("/All")
   public  List<Pari> findAllParis(){
        return this.pariService.findAllParis();
    }
    @GetMapping("/{id}")
    public Pari findPariById(@PathVariable Long id){
        return this.pariService.findPariById(id) ;
    }
    @PostMapping("/Add")
    public Pari createPari(@RequestBody Pari pari){
        return this.pariService.createPari(pari) ;
    }
    @PutMapping("/Put")
    public Pari updatePari( @RequestBody Pari Newpari){
        return this.pariService.updatePari(Newpari) ;
     }
     @DeleteMapping("/Delete")
    public void deletePari(@PathVariable Long id){
         this.pariService.deletePari(id);
     }
}
