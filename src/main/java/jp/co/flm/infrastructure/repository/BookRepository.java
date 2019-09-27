package jp.co.flm.infrastructure.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.co.flm.infrastructure.entity.master.Book;;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
	List<Book> findByName(String name);
}