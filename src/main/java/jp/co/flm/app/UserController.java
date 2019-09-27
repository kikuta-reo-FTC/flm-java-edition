package jp.co.flm.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.co.flm.domain.service.ManageBookService;

@RestController
public class UserController {
	@Autowired ManageBookService manageBookService;
	@RequestMapping("/user")
	public String test() {
		return "未実装です。" + manageBookService.getName();
	}
}