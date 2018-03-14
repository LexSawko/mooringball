package com.iba.mooringball.controller;


import com.iba.mooringball.entity.Harbor;
import com.iba.mooringball.service.HarborService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/harbors", produces = "application/json")
@Api(value="harbors", description="Operations pertaining to harbors")
public class HarborController {
    @Autowired
    HarborService service;

    @GetMapping
    @ApiOperation(value = "View a list of available harbors", response = List.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )
    public List<Harbor> getHarbors(){
        return service.getHarbors();
    }

    @GetMapping(value = "/{id}")
    @ApiOperation(value = "Search a harbor with an ID",response = Harbor.class)
    public Harbor getHarbor(@PathVariable Long id){
        return service.getHarborById(id);
    }

    @PostMapping(value = "/add")
    @ApiOperation(value = "Add a harbor",response = Harbor.class)
    public Harbor addHarbor(@RequestBody Harbor harbor){
        return service.addHarbor(harbor);
    }

    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "Update a harbor by ID",response = Harbor.class)
    public Harbor updateHarbor(@RequestBody Harbor harbor, @PathVariable Long id){
        harbor.setHarborId(id);
        return service.updateHarbor(harbor);
    }

    @DeleteMapping(value = "/{id}")
    @ApiOperation(value = "Delete a harbor")
    public void deleteHarborById(@PathVariable Long id){
        service.deleteHarbor(id);
    }
}
