package librarymangement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import librarymangement.entity.Author;

public interface AuthorRepo extends JpaRepository<Author, Integer >{}
