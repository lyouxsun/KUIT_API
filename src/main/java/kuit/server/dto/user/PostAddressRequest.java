package kuit.server.dto.user;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PostAddressRequest {
    @NotBlank(message = "address: {NotBlank}")
    private String address;
}
