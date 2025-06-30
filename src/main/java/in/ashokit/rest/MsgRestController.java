package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.service.MsgService;

@RestController
@RequestMapping("/api")
@RequestMapping("/network")
public class MsgRestController {
	
	@Autowired
	private MsgService msgService;
	
	@GetMapping("/welcome")
	public String getMsg() {
		int i = 10;
                int p =20;
		int j = 20;
		int z = 30:
		int age = 16;
<<<<<<< HEAD
		
=======
		int kage = 30;
>>>>>>> 61f8ce534ca27ff196d786b8b290467a257f6ae9
		return msgService.getWelcomeMsg();
	}
	
}
