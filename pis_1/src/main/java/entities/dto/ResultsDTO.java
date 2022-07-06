package entities.dto;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class ResultsDTO {
    private Integer pack_num ;
    private Integer command_id;
    private Integer grade;
}