package com.hendisantika.repository;

import com.hendisantika.model.Url;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : url-shortener
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 10/05/22
 * Time: 05.01
 */
public interface UrlRepository extends JpaRepository<Url, Long> {
    Url findByShortLink(String shortLink);
}
