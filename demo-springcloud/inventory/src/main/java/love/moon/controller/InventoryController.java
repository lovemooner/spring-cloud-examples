package love.moon.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import love.moon.pojo.InvDTO;

@RestController
@RequestMapping("/inventory")
public class InventoryController {
    Logger logger = LoggerFactory.getLogger(InventoryController.class);


    @GetMapping()
    String get() {
        //mapped to hostname:port/home/
        return "Hello from inventory get ";
    }

    @PostMapping(value = "/save")
    public String save(@RequestBody InvDTO dto) {
        System.out.println(dto.getAmount());
        return "success";
    }
}