package model;

import lombok.*;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Courier {
    @NonNull
    private String login;
    @NonNull
    private String password;
    private String firstname;
}