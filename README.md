# recuritmentApp

Aplikacja udostępnia restowe endpointy do zarządzania pracownikami i ich adresami.
Możliwe jest dodanie nowego pracownika wraz z adresem, dodanie adresu do istniejącego użytkownika, jak również przeglądnięcie wszystkich pracowników wraz z ich adresami. 

Aplikacja wystawia endpoint swaggera umożliwający sprawdzenie wystawionych endpointów do zarządzania aplikacją. 
http://localhost:8080/swagger-ui.html -> Dla metody POST można podejrzeć przykładowe jsony przechodzące walidację

http://localhost:8080/application/address/{userId} - zapisywanie adresu (tylko jeśli najpierw zostanie zapisywany user): 

curl -X POST \
  http://localhost:8080/application/address/1 \
  -H 'Content-Type: application/json' \
  -H 'cache-control: no-cache' \
  -d '{
                      "city": "TESTADRESS",
                      "postalCode": "50-550",
                      "country": "TEST",
                      "street": "123123"
}'


http://localhost:8080/application/users - > pobieranie użytkowników  curl:

curl -X GET \
  http://localhost:8080/application/users \
  -H 'cache-control: no-cache'

http://localhost:8080/application/user - > POST do zapisywania nowego użytkownika: przykładowy curl:

curl -X POST \
  http://localhost:8080/application/user \
  -H 'Content-Type: application/json' \
  -H 'cache-control: no-cache' \
  -d '{
        "firstName": "test",
        "lastName": "TEST",
        "pesel": 11111111111,
        "email": "test@test.pl",
        "phoneNumber": 9,
        "userAddresses": [
            {
                "city": "TEST",
                "postalCode": "50-550",
                "country": "TEST",
                "street": "123123"
            },
            {
                "city": "TEST",
                "postalCode": "50-550",
                "country": "TEST",
                "street": "123123"
            },
            {
                "city": "TEST",
                "postalCode": "50-550",
                "country": "TEST",
                "street": "123123"
            },
            {
                "city": "TEST",
                "postalCode": "50-550",
                "country": "TEST",
                "street": "123123"
            },
            {
                "city": "TEST",
                "postalCode": "50-550",
                "country": "TEST",
                "street": "123123"
            }
        ]
}'

