package com.blogpessoal.blogpessoal.contoller;

import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
import com.blogpessoal.blogpessoal.model.Postagem;
import com.blogpessoal.blogpessoal.repository.PostagemRepository;
 
@RestController
@RequestMapping ("/postagens")
@CrossOrigin ("*")
public class PostagensController {
 
	@Autowired
	private PostagemRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Postagem>> GetAll (){
		
		return ResponseEntity.ok(repository.findAll());
}
}