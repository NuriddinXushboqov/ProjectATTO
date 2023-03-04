package uz.najot.imtihonproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class HistoryDto {
    private Integer id;
    private Integer card_id;
    private Integer terminal_id;
}
