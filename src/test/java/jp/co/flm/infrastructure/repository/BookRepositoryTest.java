package jp.co.flm.infrastructure.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import jp.co.flm.infrastructure.entity.master.Book;;

@RunWith(SpringRunner.class)
@DataJpaTest
public class BookRepositoryTest {

	private static boolean initialized = false;

	@Autowired
	private TestEntityManager testEntityManager;

	@Autowired
	private BookRepository testee;

	@Before
	public void 前処理() {
		// クラス実行時に一度だけテストデータを作成
		if (!initialized) {
			testEntityManager.persist(new Book("テスト書籍1"));
			testEntityManager.persist(new Book("テスト書籍2"));
		}
	}

	@Test
	public void 任意の名前で書籍を検索できること() {
		// テスト対象のメソッドを実行
		List<Book> actuals = testee.findByName("テスト書籍1");

		// 検証
		assertThat(actuals.size()).isEqualTo(1);
		assertThat(actuals.get(0).getId()).isEqualTo(1L);
		assertThat(actuals.get(0).getName()).isEqualTo("テスト書籍1");
	}
}