# User Gateway Java Microservice

This is the user Gateway microservice, a `Spring Cloud Netflix Zuul Proxy` responsible to filter and redirect requests from User register and Authentication MS. 


# Running on Local environment

To run this application in local environment we need to :

 * Clone this repository.
 
 * Build a docker image. (Is necessary to have a Gradle installed)
 
 * Run the docker-compose file.
 

## Clone this repository

`$ git clone [repo url]`

## Build Docker image

To build de docker image, we need to install the [https://gradle.org/install/](Gradle) or use the wrapper that can be find in root application path. After cloned the repos, run: `$ gradle buildDockerImage` (in application root path) alfter that, the image should be generated with the name  `user-gateway-ms:0.0.1`
. To check, run: `$ docker images` 

	Notes: 
	1-The docker installed at host, needs to be in the admin domain (running without sudo)
	2-If you have to regeneated the image, we have a shell script on app root path, to do it, just run `$ bash regenerateDockerImage` and enjoy. :)
	
## Running the application

To up the docker container generated, we have a `docker-compose`file on root path. That's contains all dependencies to up this microservice (isolated of the solution, just to unit test). To run the `docker-compose`file, run: `$ docker-compose up`







