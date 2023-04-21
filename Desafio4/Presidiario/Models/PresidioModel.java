package br.com.Desafio4.Presidiario.Models;

import br.com.Desafio4.Presidiario.Models.PresidiarioModel;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class PresidioModel {


    //presidio quase finalizado

    private List<PresidiarioModel> Listapresidiario= new ArrayList<>();
    private Integer codigoPresidio;
    private String nomePresidio;
}

//aqui é onde vai conter os presidiarios