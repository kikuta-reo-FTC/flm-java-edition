package jp.co.flm.domain.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringRunner;

import jp.co.flm.infrastructure.entity.master.Book;
import jp.co.flm.infrastructure.repository.BookRepository;

@RunWith(SpringRunner.class)
public class ManageBookServiceTest {
	@Mock
	private BookRepository bookRepositoryMock;

	@InjectMocks
	private ManageBookService testee;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void モックテストのサンプル() {
		// モックの戻り値を定義
		List<Book> books = new ArrayList<Book>();
		books.add(new Book("テスト書籍1"));
		books.add(new Book("テスト書籍2"));
		
		// モックの振る舞いを定義
		when(bookRepositoryMock.findByName("テスト書籍1")).thenReturn(books);
		
		// テスト対象のメソッドを実行
		String actual = testee.getName();
		
		// 検証
		assertThat(actual).isEqualTo("テスト書籍1");
	}
}