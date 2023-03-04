package uz.najot.imtihonproject.service;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
import uz.najot.imtihonproject.dto.CardDto;
import uz.najot.imtihonproject.entity.Card;
import uz.najot.imtihonproject.mapper.CardsMapper;
import uz.najot.imtihonproject.model.ResMessage;
import uz.najot.imtihonproject.repository.CardRepository;

import java.util.List;

@Service
@RequiredArgsConstructor

public class CardService {
    private final CardRepository cardRepository;
    private final CardsMapper cardMapper;

    public ResMessage save(CardDto cardDto){
        Card card = cardMapper.toEntity(cardDto);
        return ResMessage.getSuccess(cardRepository.save(card));
    }
    public ResMessage getAll(){
        List<Card> all = cardRepository.findAll();
        return new  ResMessage(0,"OK",cardMapper.toDto(all));
    }

    public ResMessage getById(int id){
        Card card = cardRepository.getById(id);
        CardDto cardDto = cardMapper.toDto(card);
        if (card.getId()!=null) {
            return new ResMessage(0, "OK", cardDto);
        }
        return new ResMessage(102, "Not found ;(", null);
    }

    public ResMessage edit(CardDto cardDto){
        Card card = cardRepository.getById(cardDto.getId());
        card.setBalance(card.getBalance()+cardDto.getBalance());
        Card save = cardRepository.save(card);
        return new ResMessage(0, "Updated", save);
    }


}
