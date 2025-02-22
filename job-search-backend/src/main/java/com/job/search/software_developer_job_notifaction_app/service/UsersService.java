package com.job.search.software_developer_job_notifaction_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.job.search.software_developer_job_notifaction_app.entity.Users;
import com.job.search.software_developer_job_notifaction_app.repository.UsersRepository;

@Service
public class UsersService {
    
    @Autowired
    UsersRepository usersRepository;
    
    public void save(Users user) {
        usersRepository.save(user);
    }

    public Users delete(Users user) {
        usersRepository.delete(user);
        return user;
    }

    public Users findByEmail(String email) {
        return usersRepository.findByEmail(email);
    }

    public Users findById(int id) {
        return usersRepository.findById(id);
    }   

    public Users findByFirstNameAndLastName(String firstName, String lastName) {
        return usersRepository.findByFirstNameAndLastName(firstName, lastName);
    }

    public void deleteById(int id) {
        usersRepository.deleteById(id);
    }
}
