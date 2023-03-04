package uz.najot.imtihonproject.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import uz.najot.imtihonproject.dto.HistoryDto;
import uz.najot.imtihonproject.model.ResMessage;
import uz.najot.imtihonproject.service.HistoryService;
import uz.najot.imtihonproject.service.ReportService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/report")
public class HistoryController {
    private final HistoryService historyService;
    private final ReportService reportService;

    @PostMapping("/pay")
    public ResMessage payment(@RequestBody HistoryDto historyDto){
        return historyService.historyEntity(historyDto);
    }

    @GetMapping("/{id}")
    public ResMessage findHistoryByCardId(@PathVariable Integer id){
        return reportService.getHistoryByCardId(id);
    }


}
