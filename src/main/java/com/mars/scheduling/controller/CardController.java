package com.mars.scheduling.controller;

import com.mars.scheduling.entity.Card;
import com.mars.scheduling.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cards")
 public class CardController {

    @Autowired
    private CardService cardService;

    @PostMapping("")
    public List<Card> getAllSchedules() {
        cardService.exportExcel();
        return null;
    }
}
