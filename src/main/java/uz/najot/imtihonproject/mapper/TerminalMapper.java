package uz.najot.imtihonproject.mapper;

import org.mapstruct.Mapper;
import uz.najot.imtihonproject.dto.TerminalDto;
import uz.najot.imtihonproject.entity.Terminal;

@Mapper(componentModel = "spring")
public interface TerminalMapper extends EntityMapper<TerminalDto, Terminal> {


}