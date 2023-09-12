package com.discord.api.chatter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.discord.api.chatter.model.Webhook;
import com.discord.api.chatter.service.DiscordService;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class MessageController {

    @Autowired
    private DiscordService discordService;

    @GetMapping("/")
    public String homePage() {

        return "index";
    }

    @PostMapping(value = "/send-discord-message", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Webhook> sendMessageDiscordMessage(@RequestBody Webhook webhook, HttpServletResponse response) {
        discordService.sendDiscordMessage(webhook);

        return new ResponseEntity<Webhook>(webhook, HttpStatus.OK);
    }
}
