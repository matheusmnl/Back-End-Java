package com.example.userapi.controller;

import com.example.userapi.dto.UserDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class UserController {

    @GetMapping("/users")
    public java.util.List<UserDTO> getUsers() {
        return usuarios;
    }



    public static List<UserDTO> usuarios = new ArrayList<>();

    @PostConstruct
    public void initiateList(){
        UserDTO userDTO = new UserDTO();
        userDTO.setNome("matheus");
        userDTO.setCpf("083");
        userDTO.setEndereco("chibatolandia");
        userDTO.setEmail("fewfew");
        userDTO.setTelefone("frfe");
        userDTO.setDataCadastro(new Date());

        UserDTO userDTO2 = new UserDTO();
        userDTO.setNome("matheus");
        userDTO.setCpf("083");
        userDTO.setEndereco("chibatolandia");
        userDTO.setEmail("fewfew");
        userDTO.setTelefone("frfe");
        userDTO.setDataCadastro(new Date());

        UserDTO userDTO3 = new UserDTO();
        userDTO.setNome("matheus");
        userDTO.setCpf("083");
        userDTO.setEndereco("chibatolandia");
        userDTO.setEmail("fewfew");
        userDTO.setTelefone("frfe");
        userDTO.setDataCadastro(new Date());

        usuarios.add(userDTO);
        usuarios.add(userDTO2);
        usuarios.add(userDTO3);
    }

    }

