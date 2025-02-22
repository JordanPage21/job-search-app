package com.job.search.software_developer_job_notifaction_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.job.search.software_developer_job_notifaction_app.entity.Users;
import com.job.search.software_developer_job_notifaction_app.service.UsersService;

@Controller
@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    UsersService usersService;
    
    @PostMapping("/save")
    public ResponseEntity<HttpStatus> save(@RequestBody Users user){
        usersService.save(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }   

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> deleteById(@PathVariable String id){
        usersService.deleteById(Integer.parseInt(id));
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
