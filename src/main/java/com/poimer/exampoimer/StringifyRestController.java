package com.poimer.exampoimer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringifyRestController {

    @GetMapping("api/modify")
    public String getModifiedString(@RequestParam(required = true) String string) {
        String modified = "";

        var shouldUppercase = false;
        for (Character c : string.toCharArray()) {
            modified += shouldUppercase
                    ? Character.toUpperCase(c)
                    : Character.toLowerCase(c);
            shouldUppercase = !shouldUppercase;
        }

        return modified;
    }


}
