package uz.najot.imtihonproject.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import uz.najot.imtihonproject.dto.StationDto;
import uz.najot.imtihonproject.model.ResMessage;
import uz.najot.imtihonproject.service.StationService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/station")
public class StationController {
    private final StationService service;
    @GetMapping
    public ResMessage getAll(){
        return service.getAll();
    }
    @GetMapping("/{id}")
    public ResMessage getById(@PathVariable int id){
            return service.getById(id);
    }

    @PostMapping
    public ResMessage save(@RequestBody StationDto stationDto){
        return service.save(stationDto);
    }
}
