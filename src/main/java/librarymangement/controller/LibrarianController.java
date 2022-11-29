
package librarymangement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import librarymangement.entity.Librarian;
import librarymangement.repo.LibrarianRepo;

@RestController
public class LibrarianController {
	
	@Autowired
	LibrarianRepo repo;

	@GetMapping(path="/librarian",produces={"application/json"})
    public List<Librarian> getBooks() {
		
		return repo.findAll();
	}
	
	@GetMapping(path="/librarian/{email}",produces={"application/json"})
	public Optional<Librarian> getBook(@PathVariable("email") String email) {
		return repo.findById(email);
	}
	
}
