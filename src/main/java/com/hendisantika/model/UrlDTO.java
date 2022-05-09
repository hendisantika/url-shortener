package com.hendisantika.model;

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
 * Time: 04.59
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UrlDTO {
    private String url;
    private String expirationDate;
}
