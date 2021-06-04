# CredHub-Demo
CredHub Demo

Ref links

````
https://docs.pivotal.io/credhub-service-broker/using.html

````

Run 
````
./gradlew bootRun
gradlew.bat bootRun
````


Push
````
$ ./gradlew assemble
$ cf push -f manifest.yml
````

Create CredHub service with values needed for application
````
cf create-service credhub default mycredhub -c '{"mySecretKey":"secretkey123", "myKey":"mykey123"}'
````

Update CredHub service with values needed for application
````
cf update-service mycredhub -c '{"mySecretKey":"secretkey123", "myKey":"mykey123"}'
````

Access

```
http://localhost:8080/credhub/keys
```
Response
```
{
  mySecretKey: "secretkey123",
  myKey: "mykey123"
}
```
