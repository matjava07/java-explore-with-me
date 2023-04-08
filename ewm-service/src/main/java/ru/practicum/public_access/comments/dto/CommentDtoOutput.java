package ru.practicum.public_access.comments.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.practicum.admin_access.users.dto.UserShortDto;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CommentDtoOutput {

    Long id;
    UserShortDto creator;
    String description;
}
