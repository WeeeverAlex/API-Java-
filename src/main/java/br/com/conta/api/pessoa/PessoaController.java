package br.com.conta.api.pessoa;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PessoaController {
    private List<Pessoa> pessoas = new ArrayList<>();
    @GetMapping("/pessoa")
    public List<Pessoa> getPessoa() {
        return pessoas;
    }

    @GetMapping("/pessoa/{id}")
    public Pessoa getPessoa(@PathVariable Integer id){
        return pessoas.get(id);
    }

    @PostMapping("/pessoa")
    public Pessoa salvarPessoa(@RequestBody Pessoa pessoa){
        pessoas.add(pessoa);
        return pessoa;
    }
}
