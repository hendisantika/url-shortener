package com.hendisantika.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by IntelliJ IDEA.
 * Project : url-shortener
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 10/05/22
 * Time: 05.00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UrlErrorResponseDto {
    private String status;
    private String error;
}
