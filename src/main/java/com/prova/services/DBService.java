package com.prova.services;

import com.prova.domains.Paciente;
import com.prova.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;

@Service
public class DBService {

    @Autowired
    private PacienteRepository pacienteRepo;

    public void initDB(){
        Paciente paciente01 = new Paciente(0,"Rogerio",LocalDate.now(),new BigDecimal(300.00));
        Paciente paciente02 = new Paciente(0,"Pedro",LocalDate.now(),new BigDecimal(300.00));

        pacienteRepo.save(paciente01);
        pacienteRepo.save(paciente02);
    }
}
