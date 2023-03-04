package uz.najot.imtihonproject.mapper;

import org.mapstruct.Mapper;
import uz.najot.imtihonproject.dto.HistoryDto;
import uz.najot.imtihonproject.entity.History;

@Mapper(componentModel = "spring")
public interface HistoryMapper extends EntityMapper<HistoryDto, History> {
}
