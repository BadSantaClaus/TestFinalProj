package ru.egartech.tmsystem.domain.filter.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class FilterDto {
    LocalDateTime startPeriod;
    LocalDateTime endPeriod;
}
