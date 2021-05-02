# CredHub-Demo
CredHub Demo

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

