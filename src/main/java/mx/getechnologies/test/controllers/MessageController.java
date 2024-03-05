package mx.getechnologies.test.controllers;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.getechnologies.test.models.MessageDTO;

@RestController
public class MessageController {

    @GetMapping("/api/saludo")
	public MessageDTO getMethodName() {
		return new MessageDTO(LocalDateTime.now(), "Hola mundo!");
	}

}
