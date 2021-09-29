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
7. CI Pipeline Diagram and Structure
8. Issues and Resolutions
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

++++ NEED TO ADD CI PIPELINE DIAGRAM AND FINAL JIRA BOARD PICTURES ++++

Here you can see our wireframe of what we wanted our project to look like:

![Imgur](https://i.imgur.com/E02TRZp.png)



The above pictures showcase the planning phase of our project.

> ### **Kanban Board**

Our Kanban board utilised the Jira online software, and was using the model of an Agile Scrum Board with two sprints (one for the first week, and another for the second). The board is available [here](https://demo-af.atlassian.net/jira/software/projects/FP/boards/5 "Jira Board") for viewing. We made use of six epics: AWS, Frontend, Backend, Testing, Database and Documentation. Below are two pictures which contains come examples of the stories and showing the progression of the board throughout the project. As you can see from this we utilised for prioritisation, ownership, story point estimate and made effective use of the commenting functionality on each story. As we began working, made progress or completed worked on each of the stories we updated them in real time in order to ensure that the board was both up to date and accurate so that we knew what each of the team members were working on and to be able to visualise the overall progress being made on the project. 

#### First picture in progress in the middle of the second sprint

![Imgur](https://i.imgur.com/3bDlZMj.png))

#### Second picture at the end of the project

+++ PICTURE TO BE INSERTED +++

 ### **Risk Assessment**

At the start of the project we created a risk assessment that we intended on keeping as a living document during the whole of the sprint to ensure that we were working safely and mitigating risk as much as possible. We evaluated several varieties of risks to the project including personally physical risks, technical and environmental risks. 

We updated the risk assessment several times (10 versions total) throughout our project due to finding different risks as we progressed through the project. All of the risk assessments will be made available in the resources section of this document, or [here](https://1drv.ms/u/s!AgYV89-MT2ojkS4FdK-GI2_Yos_M?e=zM3bBW "Link to Risk Assessments"). Below are pictures of the first, fifth and tenth risk assessments so that we can show the progression of these risk assessments as 'living documents' throughout the life of the sprint and project. Multiple versions of this document were created due to the shifting risk of the project during it's life. Though there are different versions of this document, it is cumulative, with the final document being the most up to date and further having all the most up to date reflections of past risks.

#### Start of Project Risk Assessment
++ INSERT SCREENSHOT HERE ++
#### Middle of Project Risk Assessment
++ INSERT SCREENSHOT HERE ++
#### End of Project Risk Assessment
++ INSERT SCREENSHOT HERE ++

> ### **Network Diagram and Structure**

In this section I will explain how the group went about creating the AWS Infrastructure and the thought process that went into it.

To start - the network diagram below shows what we aimed to achieve and had thought about during the planning phase.

![Imgur](https://i.imgur.com/5erZg1H.png)

We utilised AWS's VPC creation wizard in order to automate most of the processes.

The VPC uses an IPv4 CIDR block of 172.10.0.0/16. The public subnet uses the IP range 172.10.1.0/24 linked to the internet gateway by the route table. The private subnet uses 172.10.2.0/24 and is linked to the NAT gateway by routetable. The NAT Gateway links the private subnet to the public subnet so that it can be accessed using either of the manager virtual machines as a bastion host.

#### Public Security Group
+++ INSERT SCREENSHOT HERE +++

#### Private Security Group

+++ INSERT SCREENSHOT HERE +++

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

From here we went about creating three Dockerfiles, one each for the frontend, backend and database. We also created the NGINX.conf. The pictures below show the Dockerfiles for the frontend, backend, database and the NGINX.conf file in that order.

#### Frontend Dockerfile
+++ Insert Picture Here +++

#### Backend Dockerfile
+++ Insert Picture Here +++

#### Database Dockerfile
+++ Insert Picture Here +++

#### NGINX Configuration File
+++ Insert Picture Here +++

> Testing the work so far

With this work completed we decided it was a good point at which to test out our work so far. We therefore ran the services for the first time to ensure that what we had completed was working as intended.

* The docker images were created using the `docker build` commands.
* NGINX also required the use of the `--mount` options for the nginx.conf file to ensure that this was setup appropriately for the project.

This confirmed that what we had completed so far was functional. At this point we pushed to images to DockerHub knowing that these images would fulfil the needs of the project.

+++Image of dockerhub images+++

We then created the docker-compose.yaml file for the swarm orchestration. Please see this pictured below.

#### Docker-Compose.yaml file.
+++Docker-Compose.yaml picture +++

Once this was created we initiated the swarm on the EC2 Instance named "Manager#1" using the command `docker swarm init` and added "Manage#2" as the second manager. We then proceeded to add the workers to the swarm as well.Finally to confirm that the manager and worker were setup properly and both in the swarm, we ran `docker node ls` to produce the below output.

#### Docker Swarm Picture

+++DOCKER SWARM NODE PICTURE+++

Finally to ensure that the work so far worked with the docker swarm the command `docker stack deploy --compose-file docker-compose.yaml final_project` was run. Containers were then deployed to each of the VM's, as pictured below:

+++PICTURE OF CONTAINERS SHOWING THEY'RE UP AND RUNNING+++

### **CI Pipeline Diagram and Structure**

At this point we took stock of everything we had done and confirmed that the network was secure, the images were appropriately built, the swarm was functioning correctly and the application was accessible both internally and externally. Risk assessments were being kept up to date with the issues we had faced and the Jira board was showing good progression of tasks and that we've put outselves in a great position to finish the minimum viable product early so that we could start looking at additional features (see MoSCoW prioritisation list and MVP from the planning overview picture earlier in the document).

#### CI Pipeline Diagram

+++ PICTURE OF DIAGRAM FOR THE CI PIPELINE +++

With the above overview picture in mind we set about creating the Jenkins Pipeline.

1) Installed Jenkins onto the manager server, and ran the initial setup.
2)Created a pipeline, including build triggers, and some additional quality of life features for example limiting the numnber of builds to 5 as to not become cumbersome, and creating a link to the github repository for ease of access.

From here we were satisfied that this was the Jenkins side of the project was setup and that we needed to move onto the Jenkinsfile that would be held on the GitHub Repository. Please see this pictured below:

+++ PICTURE OF THE JENKINSFILE +++

Finally we created and tested the Webhooks on GitHub:

+++PICTURE OF THE CREATED AND WORKING WEBHOOKS+++

Finally to cover is the Github Repository. We created several branches by the end of the project:

+++PICTURES OF THE GITHUB BRANCHES+++

We also were merging feature / file specific branches into teh dev branch and then merging into the main branch from there. This produced a clean feature branch model:

+++PICTURE OF FEATURE BRANCH MODEL+++

### **Future Goals**

There are additional features that would like to have implemented however didn't have enough time, there were:

1)
2)
3)

> ### **Final Words and Acknowledgements**

The group would like to acknowledge the assistance from Jordan Harrison and Piers Barber in this project, it wouldn't have gotten completed without them.

___
## Project by Charlotte Cartwright, Emily Penrice, Ashleigh Francis, Samuel Thornton and Christian Window
___