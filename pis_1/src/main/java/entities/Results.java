package entities;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Results {
    private Commands command;
    private Integer grade;
}