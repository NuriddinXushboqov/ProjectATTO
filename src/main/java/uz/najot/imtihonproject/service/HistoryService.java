package uz.najot.imtihonproject.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.najot.imtihonproject.dto.HistoryDto;
import uz.najot.imtihonproject.entity.Card;
import uz.najot.imtihonproject.entity.History;
import uz.najot.imtihonproject.entity.Station;
import uz.najot.imtihonproject.entity.Terminal;
import uz.najot.imtihonproject.mapper.HistoryMapper;
import uz.najot.imtihonproject.model.ResMessage;
import uz.najot.imtihonproject.repository.CardRepository;
import uz.najot.imtihonproject.repository.HistoryRepository;
import uz.najot.imtihonproject.repository.StationRepository;
import uz.najot.imtihonproject.repository.TerminalRepository;

import javax.transaction.Transactional;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class HistoryService {
    private final HistoryMapper historyMapper;
    private final HistoryRepository historyRepository;
    private final TerminalRepository terminalRepository;
    private final CardRepository cardRepository;
    private final StationRepository stationRepository;

    public ResMessage save(HistoryDto historyDto){
        History history = historyMapper.toEntity(historyDto);
        History save = historyRepository.save(history);
        return ResMessage.getSuccess(save);
    }
    @Transactional
    public ResMessage historyEntity(HistoryDto historyDto) {
        Optional<Card> card = cardRepository.findById(historyDto.getCard_id());
        if (card.isPresent()) {
            Optional<Terminal> terminal = terminalRepository.findById(historyDto.getTerminal_id());
            if (terminal.isPresent()) {
                if (card.get().getBalance() >= 1400d) {
                    Optional<Station> station = stationRepository.findById(terminal.get().getStation().getId());
                    if (station.isPresent()) {
                        station.get().setBalance(station.get().getBalance() + 1400d);
                        stationRepository.save(station.get());
                        card.get().setBalance(card.get().getBalance() - 1400d);
                        cardRepository.save(card.get());

                        History history = new History();
                        history.setCard(card.get());
                        history.setTerminal(terminal.get());
                        save(history);

                        return new ResMessage(0, "OK", history);
                    }else{
                        return new ResMessage(107, "Station not found", null);
                    }
                } else {
                    return new ResMessage(106, "Has not enough money", null);
                }
            } else {
                return new ResMessage(105, "Terminal not found", null);
            }
        } else {
            return new ResMessage(104, "Card not found", null);
        }
    }
    public  void save(History history){
        historyRepository.save(history);
    }
}





