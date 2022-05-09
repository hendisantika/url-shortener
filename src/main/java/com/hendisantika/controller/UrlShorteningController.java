package com.hendisantika.controller;

import com.hendisantika.service.UrlService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : url-shortener
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 10/05/22
 * Time: 05.07
 */
@RestController
@Slf4j
@RequiredArgsConstructor
public class UrlShorteningController {
    private final UrlService urlService;

}
