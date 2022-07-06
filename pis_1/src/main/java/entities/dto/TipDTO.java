package entities.dto;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class TipDTO {
    private Integer question_id ;
    private String type;
    private String tip;
}