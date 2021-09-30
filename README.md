# BAE12 Group 4 Final Project

This is my README for our Final Project. Please ensure to read the whole document so that no information is missed.

## DevOps Group Project

### **Contents**

1. Resources
2. Brief
3. Initial Research
4. Kanban Board
5. Risk Assessment
6. Network Diagram and Structure
7. Backend
8. Frontend
9. Future Goals
10. Final Words and Acknowledgements

> ### **Resources**

Jira Board [Located Here](https://demo-af.atlassian.net/jira/software/projects/FP/boards/5 "Jira Board")

Project Presentation [Located Here](ENTER URL HERE)

Network Diagram [Located Here](https://1drv.ms/u/s!AgYV89-MT2ojkVTfEujMFCz0gIlI "Network Diagram")

Risk Assessments [Located Here](https://1drv.ms/u/s!AgYV89-MT2ojkUEMKHnAB6V_1-_w?e=OFqoPu "Link to Risk Assessments")

### **Brief**

The purpose of this project is to create an application stack from scratch in order to fit the requirements of one or more given scenarios as provided by BAE. It is to have a UI built with simplicity in mind, a functional backend that completes the requests of the front end and a secure database to hold the confidential data in a secure manner.

An exhaustive list of the technologies, methodologies and best of breed practices can be found below:

1) Project Management - including use of Jira for a Kanban board, GitHub for version control.
2) Cloud Platform - Amazon Web Services (AWS) was used to host the servers that served the application. The database will also be hosted within the cloud platform.
3) CI Pipeline - Jenkins was used for a CI server which run the CI Pipeline.
4) Containerisation - Docker and Dockerhub were utilised for containerisation and image building / repository.
5) Application Testing and Coverage Reporting -  COMPLETE WHEN COMPLETED.

### **Initial Research**

We decided during the initial research and planning phase to use Lucid Chart to easily visualise and produce various diagrams which would be used for reference during the project and documentation post-completion of the project. The below pictures show the network diagram, [Located Here](https://1drv.ms/u/s!AgYV89-MT2ojkVTfEujMFCz0gIlI "Network Diagram"), CI pipeline diagram, [Located Here](https://1drv.ms/u/s!AgYV89-MT2ojkRkzu8szWE7NqIrq?e=g1RQhU "CI Pipeline Diagram"), and progression of the Jira board as we moved through the project workload, [Located Here](https://1drv.ms/u/s!AgYV89-MT2ojkVVjMmqi42hP9f9Z "Jira Board In Progress") and [Located Here](https://onedrive.live.com/?cid=236A4F8CDFF31506&id=236A4F8CDFF31506%212203&parId=236A4F8CDFF31506%212175&o=OneUp "Jira Board At End Of Project"). 

Here you can see our wireframe of what we wanted our project to look like:

![Imgur](https://i.imgur.com/E02TRZp.png)



The above pictures showcase the planning phase of our project.

> ### **Kanban Board**

Our Kanban board utilised the Jira online software, and was using the model of an Agile Scrum Board with two sprints (one for the first week, and another for the second). The board is available [here](https://demo-af.atlassian.net/jira/software/projects/FP/boards/5 "Jira Board") for viewing. We made use of six epics: AWS, Frontend, Backend, Testing, Database and Documentation. Below are two pictures which contains come examples of the stories and showing the progression of the board throughout the project. As you can see from this we utilised for prioritisation, ownership, story point estimate and made effective use of the commenting functionality on each story. As we began working, made progress or completed worked on each of the stories we updated them in real time in order to ensure that the board was both up to date and accurate so that we knew what each of the team members were working on and to be able to visualise the overall progress being made on the project. 

#### Picture in progress in the middle of the second sprint

![Imgur](https://i.imgur.com/3bDlZMj.png))

 ### **Risk Assessment**

At the start of the project we created a risk assessment that we intended on keeping as a living document during the whole of the sprint to ensure that we were working safely and mitigating risk as much as possible. We evaluated several varieties of risks to the project including personally physical risks, technical and environmental risks. 

We updated the risk assessment several times (10 versions total) throughout our project due to finding different risks as we progressed through the project. All of the risk assessments will be made available in the resources section of this document, or [here](https://1drv.ms/u/s!AgYV89-MT2ojkS4FdK-GI2_Yos_M?e=zM3bBW "Link to Risk Assessments"). Below are pictures of the first, fifth and tenth risk assessments so that we can show the progression of these risk assessments as 'living documents' throughout the life of the sprint and project. Multiple versions of this document were created due to the shifting risk of the project during it's life. Though there are different versions of this document, it is cumulative, with the final document being the most up to date and further having all the most up to date reflections of past risks.

#### Start of Project Risk Assessment
![Imgur](https://i.imgur.com/yY2h06W.png)
#### Middle of Project Risk Assessment
![Imgur](https://i.imgur.com/AR0322v.png)
#### End of Project Risk Assessment
![Imgur](https://i.imgur.com/gr0t2p9.png)

> ### **Network Diagram and Structure**

In this section I will explain how the group went about creating the AWS Infrastructure and the thought process that went into it.

To start - the network diagram below shows what we aimed to achieve and had thought about during the planning phase.

![Imgur](https://i.imgur.com/5erZg1H.png)

We utilised AWS's VPC creation wizard in order to automate most of the processes.

The VPC uses an IPv4 CIDR block of 172.10.0.0/16. The public subnet uses the IP range 172.10.1.0/24 linked to the internet gateway by the route table. The private subnet uses 172.10.2.0/24 and is linked to the NAT gateway by routetable. The NAT Gateway links the private subnet to the public subnet so that it can be accessed using either of the manager virtual machines as a bastion host.

#### SSH Access for Devs and Jenkins Open

![Imgur](https://i.imgur.com/2T1hFqs.png)

With the utilisation of Docker containers however from an infrastructure perspective no containers actually reside in the private subnets, therefore this is just being used for the RDS database. However it could also be used as a backup for an EC2 instance which contains an SQL database in the event that the RDS database were to fall for a prolonged period of time. With this setup in the secure manner that it is, it would mean that you'd only need to setup the instance, install the database (which comes pre-installed with many images), import the latest database backups, then simply redirect the data to the EC2 instance rather than the RDS database.

#### EC2 Instances

This brings us to the creation of the EC2 Instances within the public subnet. Appropriately named for their roles, two manager t2.xlarge EC2's were created alongside four worker t2.medium EC2's. 

![Imgur](https://i.imgur.com/ozO0ovj.png)

Each of the instances were supplied a public IP address, and as previously shown were locked down to the IP addresses of just the developers. During the creation of these virtual machines a new SSH key was created and is the sole key with access to these machines. This key was securely shared by encrypted message with other members of the team for everyone to have access. 

On signing into the machines successfully we first ran updates for the OS and then began installing all the needed software packages. 

* Docker
* Docker-Compose
* Tree

Additionally the managers also had SQL core installed on it, so that we could access the AWS RDS database and begin the setup of the database.

Following this we cloned down the repository containing the application that we were required to deploy to the cloud platform. Initially we checked through the files to ensure we had all the pertinent information to hand including any ports that were required for the application to run properly and performed research on the ports required for the Docker Swarm we were to create. We double checked the security groups and ensured that these ports were open on the security group to make sure that no network issue would cause the application not to work. 

From here we went about creating three Dockerfiles, one each for the frontend, backend and database. We also created the NGINX.conf. The pictures below show the Dockerfiles for the frontend, database and the NGINX.conf file in that order.

#### Frontend Dockerfile
![Imgur](https://i.imgur.com/DQSAAcQ.png)

#### Backend Dockerfile
![Imgur](https://i.imgur.com/3txR0lO.png)

#### NGINX Configuration File
![Imgur](https://i.imgur.com/vFHalH2.png)

> Testing the work so far

With this work completed we decided it was a good point at which to test out our work so far. We therefore ran the services for the first time to ensure that what we had completed was working as intended.

* The docker images were created using the `docker build` commands.
* NGINX also required the use of the `--mount` options for the nginx.conf file to ensure that this was setup appropriately for the project.

This confirmed that what we had completed so far was functional. At this point we pushed to images to a locally setup registry: `docker run -d -p 5000:5000 --restart=always --name registry registry:2`.

We then created the docker-compose.yaml file for the swarm orchestration. Please see this pictured below.

#### Docker-Compose.yaml file.
![Imgur](https://i.imgur.com/LXknF5a.png)

We then ran this with `docker-compose build`, `docker-compose push` and finally `docker-compose up`. This ran out containers:

#### Picture of the running containers
![Imgur](https://i.imgur.com/h94KIEB.png)

This leads us to the application being publically available on the instances IP address.

![Imgur](https://i.imgur.com/CHI29XY.png)

### **GitHub Repo**

![Imgur](https://i.imgur.com/i7YXtPr.png)

We also were merging feature / file specific branches into teh dev branch and then merging into the main branch from there. This produced a clean feature branch model:

![Imgur](https://i.imgur.com/vymsPYs.png)

### **Backend**

Our Backend application is a Spring Boot application running java and Maven. Using the spring boot framework has allowed us a rapid and simple deployment. 

Building of the project 

We started off by creating 15 different entities for each table that we felt were needed to complete the scenario. We then created all other required files like the controller and services. Next, we went through all the entities created, linking them through many to one/one to many relationships as well as specifying the columns needed to join the tables correctly. 

We also created a new table in the database that contains usernames and passwords for the users that will have permission to access this application. This allowed us to create a login function to the application controlling who can make searches for suspects information. 

Once the relationships were created, we started writing our DTOs (Data Transfer Objects), which allowed us to pick and choose what data we wanted to send to the frontend. As a group we decided that we would want 5 different types of DTO, as this would allow us to split up the information we were given as well as separate the information easily onto different pages. As a result of us having 5 DTOs, this also required us to have 5 mapToDTO methods that specified what information was coming from which tables. However, another result was that it required us to have 5 different repos that extended the JpaRepository library to allow us access to already exiting methods. 

When creating our get request functions in the controller we decided that we wanted to specify who we were trying to get information off by putting their forename, surname and date of birth into the body of a request meaning you can be more specific in who you are looking for as multiple people have the same first name. However, this did mean that we could no longer use the default @GetMapping this is because this annotation can't take in a request containing a body. So, we deiced to you the annotation @PostMapping as this allowed us to send a request with information inside the request body. 

Running the project 

To be able to run the java application the user must have access to the database. The purpose of our app is to query a database using requests from the frontend (or postman) and return the required information. Without database access this cannot happen. 

Therefore, while the database and DevOps environment was being built, we decided to create a mock database containing mock data allowing us to test our java application while not having access to correct information. This turned out to be very useful as once the mock database was up we ran the java application which led us to find out that certain relationship links weren't working as the two columns that needed joining didn’t have the same column names. 

Future Goals 

We are very happy with the amount of work we have been able to get done in the time period there is a lot more goals that we would like to be completed if there was more time available.  

The first goal that we would like to be completed would be to have some automatic testing that we could run like unit tests and Integration testing. We preferably would have like to had it done in the original time frame however under the pressure of time and wanting to have a working application to show we decided to hold off on testing till we had a working application, this led to not having any time to complete test. Therefore, this is one off our main goals that we would like to achieve if there were more time, as well as one is most important goals we have.  

Another goal that we would want to have completed if there were more time would be that whenever a request for a person's information is made JavaScript would automatically write to a text file or a database with the user's login username as well as who that user has searched for. This is a goal we wanted to be completed because of the sensitive information stored in the database we would want to keep track of who is accessing the what information and when.  

### **Frontend Application** 

Our frontend application is a react application written in JSX. We decided to make a react application so that our frontend is a single page application meaning that the application never changes page, but instead re-renders the page when required. When the application first runs a login page should load, one you have entered your credentials and hit submit it will check that the users' credentials are in the user table. Once they have been checked the page will be re-rendered to show the search page. 

Once the search page appears and the user will input the Citizens forenames surnames and dateOfBirth this will then send a request to java that will grab all the Citizens that matches the information the user entered. The page will re-render to output all the Citizens that meets the input. There is also a button at the top of the page, which when clicked will send the user back to the search page we added this function a user's trying to search for a Citizen that doesn’t exist they can go back and make a different request. Now the page has loaded with each Citizen that matched the request there is an information button next to each citizen when clicked brings up all information about that specific citizen.  

Once all the information about the citizen is outputted there is three buttons financial records, phone records, vehicle records. When each button is clicked it will render the page to out put the relevant data. The request used to return the data is done through axios.

### **Future Goals**

We are very happy with the amount of work we have been able to get done in the time period there is a lot more goals that we would like to be completed if there was more time available.  

The first goal that we would like to be completed would be to have some automatic testing that we could run like unit tests and Integration testing. We preferably would have like to had it done in the original time frame however under the pressure of time and wanting to have a working application to show we decided to hold off on testing till we had a working application, this led to not having any time to complete test. Therefore, this is one off our main goals that we would like to achieve if there were more time, as well as one is most important goals we have.  

Another goal that we would want to have completed if there were more time would be that whenever a request for a person's information is made JavaScript would automatically write to a text file or a database with the user's login username as well as who that user has searched for. This is a goal we wanted to be completed because of the sensitive information stored in the database we would want to keep track of who is accessing the what information and when.

Running the project 

To be able to run the react application the user must have access to the java backend. The purpose of our app is to send a http request to the backend that queries a database. Therefore, the frontend cannot run correctly without having access to both the backend and the database. 

> ### **Final Words and Acknowledgements**

The group would like to acknowledge the assistance from Jordan Harrison and Piers Barber in this project, it wouldn't have gotten completed without them.

___
## Project by Charlotte Cartwright, Emily Penrice, Ashleigh Francis, Samuel Thornton and Christian Window
___