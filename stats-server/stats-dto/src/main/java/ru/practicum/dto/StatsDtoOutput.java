package ru.practicum.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StatsDtoOutput {

    String app;
    String uri;
    Long hits;
}
