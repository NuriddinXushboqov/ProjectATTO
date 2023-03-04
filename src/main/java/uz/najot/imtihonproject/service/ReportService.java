package uz.najot.imtihonproject.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.najot.imtihonproject.dto.HistoryDtoByCardId;
import uz.najot.imtihonproject.entity.History;
import uz.najot.imtihonproject.model.ResMessage;
import uz.najot.imtihonproject.repository.CardRepository;
import uz.najot.imtihonproject.repository.HistoryRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ReportService {
    private final HistoryRepository historyRepository;

    public ResMessage getHistoryByCardId(Integer id){
        List<History> repositoryByCardId = historyRepository.findByCardId(id);
        List<HistoryDtoByCardId> list = new ArrayList<>();
        for (History byCardId:repositoryByCardId ) {
            list.add(new HistoryDtoByCardId(byCardId.getCard().getId(), byCardId.getTerminal().getStation().getName(),
                    byCardId.getCard().getBalance(), byCardId.getCard().getCreated_date()));
        }
        return new ResMessage(0, "OK", list);
    }

//    public ResMessage mostUsedTerminal(String to, String from){
//        historyRepository
//    }


}
