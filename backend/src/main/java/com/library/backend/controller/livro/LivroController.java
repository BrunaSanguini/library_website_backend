package com.library.backend.controller.livro;

import com.library.backend.dto.livro.LivroDetalheDTO;
import com.library.backend.dto.livro.LivroRequestDTO;
import com.library.backend.dto.livro.LivroResumoDTO;
import com.library.backend.model.Livro;
import com.library.backend.services.LivroService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/livros")
@RequiredArgsConstructor
public class LivroController {

    private final LivroService livroService;

    @GetMapping
    public ResponseEntity<List<LivroResumoDTO>> getAllLivros(){
        List<LivroResumoDTO> livros = livroService.listar();

        if(livros.isEmpty()){
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(livros);
    }

    @GetMapping("/{id}")
    public ResponseEntity<LivroDetalheDTO> getLivroById(@PathVariable Long id){

        LivroDetalheDTO livro = livroService.buscar(id);


        return ResponseEntity.ok(livro);
    }


    @PostMapping
    public ResponseEntity<LivroDetalheDTO> salvarEstanteLivro(@RequestBody @Valid LivroRequestDTO livroRequestDTO){

        LivroDetalheDTO dto = livroService.salvarEstante(livroRequestDTO);

        return ResponseEntity.status(201).body(dto);
    }

//    public ResponseEntity<Livro> editar (@PathVariable Long id, @RequestBody Livro livroAtualizacao){
//        Livro livroEditado = livroService.alterar(id, );
//
//        return ResponseEntity.ok(livroEditado);
//    }

    @GetMapping("/titulo")
    public ResponseEntity<List<Livro>> buscaPorTitulo(@RequestParam String tituloInformado) {
        List<Livro> livros = livroService.buscaPorTitulo(tituloInformado);

        if (livros.isEmpty()) {
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(livros);
    }

    @GetMapping("/data")
    public ResponseEntity<List<Livro>> buscaPorDataApos(@RequestParam LocalDate dataInformada) {
        List<Livro> livros = livroService.buscaPorDataPublicacao(dataInformada);

        if (livros.isEmpty()) {
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(livros);
    }

}
