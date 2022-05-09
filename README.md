# url-shortener

### Things todo list:

1. Clone this repository: `git clone https://github.com/hendisantika/url-shortener.git`
2. Navigate to the folder: `cd url-shortener`
3. Run the application: `mvn clean spring-boot:run`
4. Generate URL:
   Request:

```shell
curl --location --request POST 'http://localhost:8080/urls/generate' \
--header 'Content-Type: application/json' \
--data-raw '{
    "url": "https://github.com/hendisantika"
}'
```

Response:

```shell
{
    "originalUrl": "https://github.com/hendisantika",
    "shortLink": "85b24fd6",
    "expirationDate": "2022-05-10T05:16:55.08314"
}
```

5. Get Short link:

```shell
curl --location --request GET 'http://localhost:8080/urls/85b24fd6'
```
