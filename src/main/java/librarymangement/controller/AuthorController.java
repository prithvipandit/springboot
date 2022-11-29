package librarymangement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import librarymangement.entity.*;
import librarymangement.repo.*;

@RestController
public class AuthorController {

  @Autowired
  AuthorRepo repo;

	@GetMapping(path="/author",produces={"application/json"})
    public List<Author> getAuthors() {
		
		return repo.findAll();
	}
	
	@GetMapping(path="/author/{name}",produces={"application/json"})
	public Optional<Author> getBook(@PathVariable("name") Integer authorId) {
		return repo.findById(authorId);
	}
}
