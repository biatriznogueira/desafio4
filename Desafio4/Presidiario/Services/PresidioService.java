package br.com.Desafio4.Presidiario.Services;

import br.com.Desafio4.Presidiario.Models.PresidiarioModel;
import br.com.Desafio4.Presidiario.Models.PresidioModel;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PresidioService {



    ArrayList<PresidioModel> listaDePresidio= new ArrayList<PresidioModel>();

    public List<PresidioModel> listarTodos(){
        return listaDePresidio;
    }
    public void adicionar(PresidioModel P){
        listaDePresidio.add(P);
    }

    public Optional<PresidioModel> buscarPorCodigo(Integer codigoPresidio){

        return listaDePresidio.stream().filter(c-> codigoPresidio.equals(c.getCodigoPresidio())).findFirst();
    }
    }



