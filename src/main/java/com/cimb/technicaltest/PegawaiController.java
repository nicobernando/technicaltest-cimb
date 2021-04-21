package com.cimb.technicaltest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
public class PegawaiController {
    @Autowired

    private PegawaiRepository pegawaiRepo;

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Pegawai> getAllUsers() {
        // This returns a JSON or XML with the users
        return pegawaiRepo.findAll();
    }

    @PostMapping(path="/add-pegawai")
    public Object addPegawai(@Valid @RequestBody Pegawai model)
    {
       Pegawai emp = new Pegawai();
       pegawaiRepo.save(model);
        return model;
    }

    @GetMapping(path="/get-pegawai")
    public Optional<Pegawai> getPegawaiById(@RequestParam Long Userid){
        return pegawaiRepo.findById(Userid);
    }
}
