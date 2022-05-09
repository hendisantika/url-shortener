package com.hendisantika.service;

import com.hendisantika.dto.UrlDTO;
import com.hendisantika.model.Url;
import com.hendisantika.repository.UrlRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * Created by IntelliJ IDEA.
 * Project : url-shortener
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 10/05/22
 * Time: 05.02
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class UrlService {
    private final UrlRepository urlRepository;

    public Url generateShortLink(UrlDTO urlDto) {
        if (StringUtils.isNotEmpty(urlDto.getUrl())) {
            String encodedUrl = encodeUrl(urlDto.getUrl());
            Url urlToPersist = new Url();
            urlToPersist.setCreationDate(LocalDateTime.now());
            urlToPersist.setOriginalUrl(urlDto.getUrl());
            urlToPersist.setShortLink(encodedUrl);
            urlToPersist.setExpirationDate(getExpirationDate(urlDto.getExpirationDate(),
                    urlToPersist.getCreationDate()));
            Url urlToRet = persistShortLink(urlToPersist);

            return urlToRet;
        }
        return null;
    }
}
