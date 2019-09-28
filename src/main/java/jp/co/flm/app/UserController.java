package jp.co.flm.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * コメントサンプル
 */
@RestController
public class UserController {
	/**
	 * コメントサンプル
	 * @return JSON形式のデータを返却予定
	 */
	@RequestMapping("/user")
	public List<String> test() {
		return Arrays.asList("未実装", "未実装", "未実装");
	}
}