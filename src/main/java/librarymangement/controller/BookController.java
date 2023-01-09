package librarymangement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import librarymangement.entity.*;
import librarymangement.repo.*;

@RestController
public class BookController {
	
	@Autowired
    BookRepo repo;

	@GetMapping(path="/book",produces={"application/json"})
    public List<Book> getBook() {
		
		return repo.findAll();
	}
	
	@GetMapping(path="/book/{bId}",produces={"application/json"})
	public Optional<Book> getBook(@PathVariable("bId") Integer bId) {
		return repo.findById(bId);
	}
	
	@PostMapping(path="/book",produces= {"application/json"})
	@ResponseBody
	public Book addBook(@RequestBody Book b) {
		
		System.out.println(b.getbId());
		repo.save(b);
		return b;
	}
	
	@DeleteMapping("/book/{bId}")
	public String deleteBook(@PathVariable Integer bId) {
		
		Book b=repo.getOne(bId);
		
		repo.delete(b);
		
		return "deleted";
	}
	
	
	@PutMapping(path="/book",produces={"application/json"})
	@ResponseBody
	public Book updateBook(@RequestBody Book b) {
		
		repo.save(b);
		
		return b;
	}
	
}
