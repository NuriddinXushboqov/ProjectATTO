package uz.najot.imtihonproject.mapper;

import org.mapstruct.Mapper;
import uz.najot.imtihonproject.dto.CardDto;
import uz.najot.imtihonproject.entity.Card;
@Mapper(componentModel = "spring")
public interface CardsMapper extends EntityMapper<CardDto, Card> {
   private static void hello(){
        System.out.println();
    }

}