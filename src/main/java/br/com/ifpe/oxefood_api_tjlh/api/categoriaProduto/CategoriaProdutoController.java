package br.com.ifpe.oxefood_api_tjlh.api.categoriaProduto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifpe.oxefood_api_tjlh.model.categoriaProduto.CategoriaProduto;
import br.com.ifpe.oxefood_api_tjlh.model.categoriaProduto.CategoriaProdutoService;

@RestController
@RequestMapping("/api/categoriaproduto")
@CrossOrigin
public class CategoriaProdutoController {
  
  @Autowired
  private CategoriaProdutoService categoriaProdutoService;

  @PostMapping
  public ResponseEntity<CategoriaProduto> save(@RequestBody CategoriaProdutoRequest request) {
    CategoriaProduto categoriaProduto = categoriaProdutoService.save(request.build());
    return new ResponseEntity<CategoriaProduto>(categoriaProduto, HttpStatus.CREATED);
  }

  @GetMapping
  public List<CategoriaProduto> listarTodos(){
    return categoriaProdutoService.listarTodos();
  }

  @GetMapping("/{id}")
  public CategoriaProduto obterPorID(@PathVariable Long id){
    return categoriaProdutoService.obterPeloID(id);
  }

  @PutMapping("/{id}")
  public ResponseEntity<CategoriaProduto> update(@PathVariable("id") Long id, @RequestBody CategoriaProdutoRequest request){
    categoriaProdutoService.update(id, request.build());
    return ResponseEntity.ok().body(null);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> delete(@PathVariable Long id){

    categoriaProdutoService.delete(id);
    return ResponseEntity.ok().build();
  }
}
