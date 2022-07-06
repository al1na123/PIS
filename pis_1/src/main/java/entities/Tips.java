package entities;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Tips {
    private Questions questions;
    private String type;
    private String tip;
}