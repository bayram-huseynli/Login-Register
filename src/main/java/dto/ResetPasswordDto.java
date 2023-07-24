package dto;

import lombok.Data;

@Data
public class ResetPasswordDto {
    private String eMail;
    private String newPassword;
    private String confirmnewPassword;
}
