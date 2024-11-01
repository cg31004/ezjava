package com.hw.project1.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.HashMap;
import java.util.Map;

@Service
public class TelegramBotService {
    // todo: use token
    private final String BOT_TOKEN = "YOUR_BOT_TOKEN";
    private final String CHAT_ID = "YOUR_CHAT_ID";

    public void sendReminder(String message) {
        String url = "https://api.telegram.org/bot" + BOT_TOKEN + "/sendMessage";
        Map<String, String> params = new HashMap<>();
        params.put("chat_id", CHAT_ID);
        params.put("text", message);

        RestTemplate restTemplate = new RestTemplate();
        restTemplate.postForObject(url, null, String.class, params);
    }
}
