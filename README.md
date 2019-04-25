# translate-api
Spring-boot based application which implements Translate API to translate the text to target language.

Please follow the following prerequisite in order to execute the project.

- Step 1 : Clone this repository.
- Step 2 : mvn clean install
- Step 3 : java -jar target/translate-service-0.0.1-SNAPSHOT.jar 

Following scenarios are covered up in task.

I have used two services for the text translation each service need its own api key to execute. 
Please add the keys in order to execute the project 
  1. Yandex service key
  2. Add Googele key at you sysytem. only if google api is required.
  
Once application has been started please pass follwing curl 
curl -X POST \
  http://localhost:8080/translate \
  -H 'Content-Type: application/json' \
  -d '{
	"text":"Hi how are you",
	"lang":"hi"
}' 
you be getting following response
{
    "statusCode": 200,
    "Response": {
        "text": [
            "हाय आप कैसे हैं"
        ]
    }
}
As the language translation is in hindi

to get all language code use the following curl
curl -X GET   http://localhost:8080/translate/lang;

Follwing are code for some of the indian language
TAMIL = "ta";
TELUGU = "te";
MARATHI = "mr";
KANNADA = "kn";
HINDI = "hi"
please use following code to corresponding type.
