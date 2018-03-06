package com.iba.mooringball.controller;

import com.iba.mooringball.entity.MooringBall;
import com.iba.mooringball.service.MooringBallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MooringBallController {
    @Autowired
    MooringBallService service;

    @GetMapping(value = "/mooringballs", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<MooringBall> getMooringBalls(){
        return service.getMooringBalls();
    }

    @GetMapping(value = "/mooringball/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public MooringBall getMooringBall(@PathVariable Long id){
        return service.getMooringBallById(id);
    }

    @PostMapping(value = "/mooringball", produces = MediaType.APPLICATION_JSON_VALUE)
    public MooringBall addMooringBall(@RequestBody MooringBall ball){
        return service.addMooringBall(ball);
    }

    @PutMapping(value = "/mooringball/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public MooringBall updateMooringBall(@RequestBody MooringBall ball, @PathVariable Long id){
        if(id.equals(ball.getId())){
            return service.updateMooringBall(ball);
        } else {
            //
            return null;
        }
    }

    @DeleteMapping(value = "/mooringball/{id}")
    public void deleteBooringBallById(@PathVariable Long id){
        service.deleteMooringBall(id);
    }
}
