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

import jp.co.flm.infrastructure.entity.master.User;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryTest {

	private static boolean initialized = false;

	@Autowired
	private TestEntityManager testEntityManager;

	@Autowired
	private UserRepository testee;

	@Before
	public void 前処理() {
		// クラス実行時に一度だけテストデータを作成
		if (!initialized) {
			testEntityManager.persist(new User("テストユーザー1"));
			testEntityManager.persist(new User("テストユーザー2"));
		}
	}

	@Test
	public void 任意の名前でユーザを検索できること() {
		// テスト対象のメソッドを実行
		List<User> actuals = testee.findByName("テストユーザー1");

		// 検証
		assertThat(actuals.size()).isEqualTo(1);
		assertThat(actuals.get(0).getId()).isEqualTo(1L);
		assertThat(actuals.get(0).getName()).isEqualTo("テストユーザー1");
	}
}