# CredHub-Demo
CredHub Demo

````
$ ../gradlew assemble
$ cf push -f manifest.yml
````

After deploying the application, send an HTTP request to the demo application with this command:

````
$ curl -X POST https://spring-credhub-demo.cf.example.com/test -d @demo.json -H "Content-type: application/json"
````

