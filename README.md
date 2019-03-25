# recuritmentApp

Aplikacja udostępnia restowe endpointy do zarządzania pracownikami i ich adresami.
Możliwe jest dodanie nowego pracownika wraz z adresem, dodanie adresu do istniejącego użytkownika, jak również przeglądnięcie wszystkich pracowników wraz z ich adresami. 

Aplikacja wystawia endpoint swaggera umożliwający sprawdzenie wystawionych endpointów do zarządzania aplikacją. 
http://localhost:8080/swagger-ui.html

http://localhost:8080/application/address/userId - zapisywanie adresu (tylko jeśli najpierw zostanie zapisywany user): 
POST /address/1 HTTP/1.1
Host: localhost:8080
Content-Type: application/json
cache-control: no-cache
{
                "city": "TESTADRESS",
                "postalCode": "TEST",
                "country": "TEST",
                "street": "123123"
}

http://localhost:8080/application/users - > pobieranie użytkowników 

http://localhost:8080/application/user - > POST do zapisywania nowego użytkownika: przykładowy curl:
POST /application/user HTTP/1.1
Host: localhost:8080
Content-Type: application/json
cache-control: no-cache
{
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
}


