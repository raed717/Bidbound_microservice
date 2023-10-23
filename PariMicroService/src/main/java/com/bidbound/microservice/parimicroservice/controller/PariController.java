package com.bidbound.microservice.parimicroservice.controller;

import com.bidbound.microservice.parimicroservice.entite.Pari;
import com.bidbound.microservice.parimicroservice.service.IPariService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/paris")
public class PariController {
    public PariController(IPariService pariService) {
        this.pariService = pariService;
    }

    private IPariService pariService ;
    @GetMapping("/All")
   public  ResponseEntity<List<Pari>> findAllParis(){
        List<Pari> ListPari =  this.pariService.findAllParis() ;
        return new ResponseEntity<>(ListPari , HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Pari> findPariById(@PathVariable Long id){
        return new ResponseEntity<>(this.pariService.findPariById(id)  , HttpStatus.OK);
    }
    @PostMapping("/Add")
    public ResponseEntity<Pari>  createPari(@RequestBody Pari pari){
        return new ResponseEntity<> ( this.pariService.createPari(pari) , HttpStatus.CREATED);
    }
    @PutMapping("/Put")
    public ResponseEntity<Pari>  updatePari( @RequestBody Pari Newpari){
        if ( this.pariService.updatePari(Newpari)  != null )
        return new ResponseEntity<> ( this.pariService.updatePari(Newpari)  , HttpStatus.ACCEPTED) ;
        else return  new ResponseEntity<> (null , HttpStatus.NOT_FOUND) ;
     }
     @DeleteMapping("/Delete")
    public ResponseEntity<Void> deletePari(@PathVariable Long id){
           this.pariService.deletePari(id)  ;
         return new ResponseEntity<> (HttpStatus.OK ) ;
     }
}
