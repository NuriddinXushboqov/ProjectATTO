package uz.najot.imtihonproject.mapper;

import org.mapstruct.Mapper;
import uz.najot.imtihonproject.dto.StationDto;
import uz.najot.imtihonproject.entity.Station;

@Mapper(componentModel = "spring")
public interface StationMapper extends EntityMapper<StationDto, Station> {

}