package br.com.Desafio4.Presidiario.Controllers;

import br.com.Desafio4.Presidiario.Models.PresidiarioModel;
import br.com.Desafio4.Presidiario.Services.PresidiarioService;
import br.com.Desafio4.Presidiario.Services.PresidioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


    @RestController
    @RequestMapping(value = "/presidiario")
    public class PresidiarioController {

        @Autowired
        private PresidiarioService service;


        @Autowired
        private PresidioService presidio;





        @PostMapping(value = "/add")
        public ResponseEntity novoPresidiario(@RequestParam Integer codigoPresidio,
                                              @RequestBody PresidiarioModel presidiario){

            presidiario.setPresidio(presidio.buscarPorCodigo(codigoPresidio));
            service.adicionar(presidiario);
            return new ResponseEntity(presidiario, HttpStatus.CREATED);

        }






        @GetMapping(value = "/listar")
        public ResponseEntity ListarTodos(){
            return new ResponseEntity(service.ListaTodos(),HttpStatus.OK);

        }



        @GetMapping(value = "/listarRg{resgistro}")
        public ResponseEntity ListarPorRegistro(@PathVariable Integer registro){

            Optional<PresidiarioModel> Preso = service.buscarPorResgistro(registro);
            if (Preso == null){
                return new ResponseEntity<>("registro invalido", HttpStatus.BAD_REQUEST);

            }
            return new ResponseEntity( Preso,HttpStatus.OK);


        }


        @DeleteMapping(value = "/deletar/{registro}")
        public ResponseEntity deletar(@PathVariable String registro){
            service.remove(registro);
            return new ResponseEntity(HttpStatus.OK);
        }





    }









