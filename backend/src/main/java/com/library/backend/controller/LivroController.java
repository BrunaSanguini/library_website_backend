package com.library.backend.controller;

import com.library.backend.services.LivroService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livro")
@RequiredArgsConstructor
public class LivroController {

    private final LivroService livroService;

    @GetMapping("/livros")
    public  void getAllLivros(){}

}
