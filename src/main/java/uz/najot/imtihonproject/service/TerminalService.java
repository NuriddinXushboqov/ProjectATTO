package uz.najot.imtihonproject.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.najot.imtihonproject.dto.TerminalDto;
import uz.najot.imtihonproject.dto.TerminalDto2;
import uz.najot.imtihonproject.entity.Station;
import uz.najot.imtihonproject.entity.Terminal;
import uz.najot.imtihonproject.mapper.TerminalMapper;
import uz.najot.imtihonproject.model.ResMessage;
import uz.najot.imtihonproject.repository.StationRepository;
import uz.najot.imtihonproject.repository.TerminalRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TerminalService {
    private final TerminalRepository terminalRepository;
    private final TerminalMapper terminalMapper;
    private final StationRepository stationRepository;

    public ResMessage save(TerminalDto terminalDto) {
        Terminal terminal = terminalMapper.toEntity(terminalDto);
        Station byId = stationRepository.getById(terminalDto.getStation_id());
        terminal.setStation(byId);
        terminalRepository.save(terminal);
        return ResMessage.getSuccess("SAVED");
    }

    public ResMessage getAll() {
        List<Terminal> all = terminalRepository.findAll();
//        List<TerminalDto2> terminalDtos = terminalMapper.toDto(all);
        return new ResMessage(0, "OK", all);
    }

    public ResMessage getById(int id) {
        Terminal terminal = terminalRepository.getById(id);
            return new ResMessage(0, "OK", terminal);
    }

}