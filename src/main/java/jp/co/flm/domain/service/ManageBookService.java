package jp.co.flm.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.flm.infrastructure.repository.BookRepository;

/**
 * サービス：書籍情報を操作・参照するためのクラス
 */
@Service
public class ManageBookService {
	@Autowired BookRepository bookRepository;
	/**
	 * 書籍名を取得
	 * @return 書籍名
	 */
	public String getName() {
		return bookRepository.findByName("テスト書籍1").get(0).getName();
	}
}