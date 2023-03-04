package uz.najot.imtihonproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class History extends BaseEntity{
    @JoinColumn(nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private Card card;

    @JoinColumn(nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private Terminal terminal;

}
