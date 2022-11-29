package librarymangement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


import librarymangement.entity.Librarian;


public interface LibrarianRepo extends JpaRepository<Librarian,String>{}
