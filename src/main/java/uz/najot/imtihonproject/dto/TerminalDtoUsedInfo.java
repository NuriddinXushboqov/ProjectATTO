package uz.najot.imtihonproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TerminalDtoUsedInfo {
    private Integer terminal_id;
    private String terminal_name;
    private String station_name;
    private Integer count;


}
