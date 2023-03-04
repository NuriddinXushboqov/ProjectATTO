package uz.najot.imtihonproject.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import uz.najot.imtihonproject.dto.CardDto;
import uz.najot.imtihonproject.model.ResMessage;
import uz.najot.imtihonproject.service.CardService;
@RestController
@RequiredArgsConstructor
@RequestMapping("/card")
public class CardController {
    private final CardService cardService;
    @GetMapping
    public ResMessage getAll(){
        return cardService.getAll();
    }
    @GetMapping("/{id}")
    public ResMessage getById(@PathVariable int id){
       return cardService.getById(id);
    }
    @PostMapping
    public ResMessage save(@RequestBody CardDto cardDto){
        return cardService.save(cardDto);
    }

    @PutMapping()

    public ResMessage update(@RequestBody CardDto cardDto){
        return cardService.edit(cardDto);
    }

}
