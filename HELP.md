
1. curl --location 'http://localhost:8080/api/resume/demographic/101'
``` JSON
    {
        "firstName": "Ravi",
        "lastName": "Eragapati",
        "currentRole": "Principal Application Engineer"
    }
```

2. curl --location 'http://localhost:8080/api/resume/demographic/103'
```text
    404_NOT_FOUND
```


3. curl --location 'http://localhost:8080/api/resume/contact/101'
``` JSON
    {
        "emailId": "e.ravikanth@live.com",
        "phoneNum": "(000)-00-0000",
        "linkedIn": "www.linkedin.com/in/ekrkanth",
        "gitHub": "github.com/RavikanthEragapati",
        "website": "www.eragapati.com"
    }
```


4. curl --location 'http://localhost:8080/api/resume/contact/101'
```text
    404_NOT_FOUND
```



oc new-build --name=abcd --image=openjdk:17-alpine --binary=true
