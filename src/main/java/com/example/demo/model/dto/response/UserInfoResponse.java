package com.example.demo.model.dto.response;

import com.example.demo.model.dto.request.UserInfoRequest;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class UserInfoResponse extends UserInfoRequest {
    Long id;
}
