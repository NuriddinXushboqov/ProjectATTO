package uz.najot.imtihonproject.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import uz.najot.imtihonproject.dto.TerminalDto;
import uz.najot.imtihonproject.model.ResMessage;
import uz.najot.imtihonproject.service.TerminalService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/terminal")
public class TerminalController {
    private final TerminalService terminalService;
    @GetMapping
    public ResMessage getAll(){
        return  terminalService.getAll();
    }
    @GetMapping("/{id}")
    public ResMessage getById(@PathVariable int id){
        return terminalService.getById(id);
    }
    @PostMapping
    public  ResMessage save(@RequestBody TerminalDto terminalDto){
        return terminalService.save(terminalDto);
    }
}
