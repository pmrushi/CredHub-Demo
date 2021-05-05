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
cf create-service credhub default mycredhub -c '{"mySecretKey":"secretkey123"}'
````

{
  "client_id": "demo-id",
  "client_secret": "demo-secret",
  "uri": "https://example.com"
}
