package uz.najot.imtihonproject.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.najot.imtihonproject.dto.StationDto;
import uz.najot.imtihonproject.entity.Station;
import uz.najot.imtihonproject.mapper.StationMapper;
import uz.najot.imtihonproject.model.ResMessage;
import uz.najot.imtihonproject.repository.StationRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StationService {
        private final StationRepository stationRepository;
        private final StationMapper stationMapper;

        public ResMessage save (StationDto stationDto){
            Station station = stationMapper.toEntity(stationDto);
            return ResMessage.getSuccess(stationRepository.save(station));
        }
         public ResMessage getAll(){
             List<Station> all = stationRepository.findAll();
             return new  ResMessage(0,"OK",stationMapper.toDto(all));
         }

    public ResMessage getById(int id) {
        Station station = stationRepository.getById(id);
        StationDto stationDto = stationMapper.toDto((station));
        if (station.getId() != null) {
            return new ResMessage(0, "OK", stationDto);
        }
        return new ResMessage(101, "Not found ;(", null);

    }
}
