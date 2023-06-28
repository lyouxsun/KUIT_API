package kuit.server.dto.user;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
@NoArgsConstructor
public class PatchPasswordRequest {

    //기존 password와 일치하는지 확인하는 부분 -> 맞으면 그때 새로운 비밀번호로 변경 가능
    //?????그럼 지금 비밀번호==입력한비밀번호 같은지 확인하려면 -> 현재 저장되어 있는 비밀번호를 복호화 해야하는거지?????
    @NotBlank(message = "password: {NotBlank}")
    private String password;

    //새롭게 변경할 password 입력받는 부분
    @NotBlank(message = "password: {NotBlank}")
    @Length(min = 8, max = 20,
            message = "password: 최소 {min}자리 ~ 최대 {max}자리까지 가능합니다")
    @Pattern(regexp = "(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}",
            message = "password: 대문자, 소문자, 특수문자가 적어도 하나씩은 있어야 합니다")
    private String password;     //이부분어떻게해야되노ㅠㅠㅠㅠㅠ
}
