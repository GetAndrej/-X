package package_server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/chatx")
public class ChatController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public  String getChatix(ModelMap modelMap){
        return "My Chat";
    }
}
