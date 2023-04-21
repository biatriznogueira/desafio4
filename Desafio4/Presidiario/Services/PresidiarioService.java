package br.com.Desafio4.Presidiario.Services;

import br.com.Desafio4.Presidiario.Models.PresidiarioModel;
import br.com.Desafio4.Presidiario.Models.PresidioModel;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PresidiarioService {

    //fazendo a lista dos presidiarios
    // aqui é como se fosse o "pai/cabeça" do codigo, onde contem o mais importante: a LISTA.



    private List<PresidiarioModel> presidiarioService = new ArrayList<>();

    public void adicionar(PresidiarioModel presidiarioSalvo){

        presidiarioService.add(presidiarioSalvo);

    }

    public List<PresidiarioModel> ListaTodos(){
        return presidiarioService;

    }
    public Optional<PresidiarioModel> buscarPorResgistro(Integer registro){
        return presidiarioService.stream().filter(p-> registro.equals(p.getRegistro())).findFirst();
    }





    public PresidioModel buscarPorPresidio() {
        return null;

    }



    public void remove(String registro) {

        return new ResponseEntity<registro>(HttpStatus.NO_CONTENT);
    }
    }
