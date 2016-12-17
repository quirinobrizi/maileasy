# MailEasy

MailEasy is a REST accessible SMTP server, it has been designed to be used when performing acceptance tests.

A docker image is provided to make it easier to start the application and get up and running, just type the following command to run MailEasy in detached mode: 
```bash
docker run -t -d -p 8025:8025 -p 8080:8080 quirinobrizi/maileasy
```

Using the command above the SMTP connector is exposed on the host on port 8025 and the REST interface is exposed on the host on port 8080.

##REST APISs

MailEasy support the following REST APIs.

###Search
Allows to search e-mails on the SMTP server.

*HTTP Method*
 
 - GET

*Accepted filters:*

 - subject

*Accepted Matchers:*

 - contains
 - equals
 
 *Example*
 
Retrieve all messages who's subject is equals to `abcd`:
```bash
curl http://localhost:8080/mails?subject=equals:abcd 
```

Retrieve all messages who's subject is contains `abcd`:
```bash
curl http://localhost:8080/mails?subject=contains:abcd 
```