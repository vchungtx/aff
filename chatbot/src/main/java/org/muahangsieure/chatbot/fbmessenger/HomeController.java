package org.muahangsieure.chatbot.fbmessenger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String allAccess() {
        return "Public Content.";
    }
}
