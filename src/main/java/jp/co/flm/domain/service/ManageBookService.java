package jp.co.flm.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.flm.infrastructure.repository.BookRepository;

@Service
public class ManageBookService {
	@Autowired BookRepository bookRepository;
	public String getName() {
		return bookRepository.findByName("テスト書籍1").get(0).getName();
	}
}