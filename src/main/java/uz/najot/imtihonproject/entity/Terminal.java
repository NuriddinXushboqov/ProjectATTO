package uz.najot.imtihonproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Terminal extends BaseEntity{
    private String name;
    @ManyToOne
    private Station station;

}
