package org.muahangsieure.chatbot.fbmessenger;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String allAccess() {
        return "Public Content.";
    }

    @GetMapping("/webhook")
    public ResponseEntity<?> getWebhook(@RequestParam("hub.mode") String mode, @RequestParam("hub.verify_token") String verify_token, @RequestParam("hub.challenge") String challenge) {
        if (mode.equals("subscribe'") && verify_token.equals("EAADO4cZA6ZAXkBAKYhfKZAYW1CyIcjbqYack3KePdoZCEZAZCXZCkjibKkR84S83YUIp0nXHKEpXJuNw4h4RMz6tO7ClC0p0IEahY8ZAoZA1TTDsVNZCs9qp44JuISx2Le6naEdtA846oVRnC3PhaaWBTXuUKs5EI4rGuSiMU519jJOS0QNdJWZCQ2d")){
            return ResponseEntity.status(200).body(challenge);
        }else{
            return ResponseEntity.status(403).body("");
        }
    }
    
    @PostMapping("/webhook")
    public ResponseEntity<?> postWebhook(@RequestBody String body) {
        System.out.println("body:" + body);
        return ResponseEntity.status(200).body("Received");
    }
}
