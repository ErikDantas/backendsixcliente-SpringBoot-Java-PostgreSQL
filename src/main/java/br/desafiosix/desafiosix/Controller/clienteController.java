package br.desafiosix.desafiosix.Controller;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.desafiosix.desafiosix.Model.Cliente;
import br.desafiosix.desafiosix.Repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class clienteController {

    private ClienteRepository clienteRepository;

    public clienteController(ClienteRepository clienteRepository){
        this.clienteRepository=clienteRepository;
    }

    @CrossOrigin
    @GetMapping("/")
    public List<Cliente> getClientes(){
        return clienteRepository.findAll(Sort.by(Sort.Direction.DESC, "codCliente"));
    }

    @CrossOrigin
    @GetMapping("/{codCliente}")
    public void excluirCliente(@PathVariable("codCliente") Long codCLiente, Cliente cliente){
        var x = clienteRepository.findById(codCLiente);
        if(x.isPresent()){
            Cliente c = x.get();
            clienteRepository.delete(c); 
        }
        
    }

    @CrossOrigin
    @PostMapping("/incluir")
    public void inserirCliente(@RequestBody Cliente cliente){
        clienteRepository.save(cliente);
    }

    @CrossOrigin
    @PutMapping("/alterar/{codCliente}")
    public ResponseEntity<String> alterarBairro(@PathVariable("codCliente") Long codCliente,@RequestBody Cliente cliente){
        clienteRepository.findById(codCliente)
        .map(x -> {
            x.setCnpj(cliente.getCnpj());
            x.setContatoPrincipal(cliente.getContatoPrincipal());
            x.setNomeFantasia(cliente.getNomeFantasia());
            x.setTelefone(cliente.getTelefone());
            x.setRazaoSocial(cliente.getRazaoSocial());
            Cliente cliAtualizado = clienteRepository.save(x);
            return ResponseEntity.ok().body(cliAtualizado);
        }).orElse(ResponseEntity.notFound().build());
        return null;
    }
}
