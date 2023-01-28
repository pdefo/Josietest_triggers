package dev.josiedefo.healthbuddy.controller;

import dev.josiedefo.healthbuddy.entity.Goaltype;
import dev.josiedefo.healthbuddy.exception.InternalServerError;
import dev.josiedefo.healthbuddy.repository.GoaltypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class GoaltypeController {
    @Autowired
    GoaltypeRepository goaltypeRepository;

    @PostMapping ("/goaltype")
    public ResponseEntity<Goaltype> createGoaltype(@RequestBody Goaltype goaltype){
        try{
            Goaltype newgoaltype = new Goaltype(goaltype.getGoalname(), goaltype.getGoaldescription());
            goaltypeRepository.save(newgoaltype);
            return new ResponseEntity<>(newgoaltype, HttpStatus.CREATED);
        }catch (Exception e){
            throw new InternalServerError(e.getMessage());
        }
    }

    @GetMapping("/hello")
    public String hello(){
        return "Full Stack Java with Spring and Vue Js!";
    }

}
