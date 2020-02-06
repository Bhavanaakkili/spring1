package response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Welcomecontroller {

@RequestMapping(value="respbody", method= RequestMethod.GET)
@ResponseBody
public String respBodyMethod1() {
	return "ResponseBody example";
}
}
