# Users Authentication (POC) Solution


# Running on Local environment

To run this application in local environment we need to :

 * Clone this repository.
 * Build a docker image. 
 * Run the docker-compose file.
 

## Clone this repository

`$ git clone https://github.com/jorgetavares89/users.git`

## Build Docker images

To build the docker images, we need to install the [https://gradle.org/install/](Gradle). and run `$ gradle buildDockerImage`. This command will generate all docker images from each Microservice. To check, run: `$ docker images`

It is **required** to generate the docker images of **all** projects, `user-gateway-ms`, `user-register-ms` and `user-auth-ms` trying to up this solution.

	Note: 
	The docker installed in the host machine must be executed in the admin domain (running without sudo)
	
## Running the application

Once you have generated the images of each application, you can get the containers up and running by using the `docker-compose` file on root path `(can be locale in users/docker-compose.yml)`.  Just run:  `$ docker-compose up` and the solution is coming up automatically. This command should be up the following architecture:

<p align="center"><img src="https://github.com/jorgetavares89/users/blob/master/users_arch.png"/></p>

	Note:
	In the root app path, has a Postman collections .json exported to test the APIs.

