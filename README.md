


# Jenkins Administrator's Guide 

<a href="https://www.packtpub.com/product/jenkins-administrator-s-guide/9781838824327?utm_source=github&utm_medium=repository&utm_campaign=9781838824327"><img src="https://static.packt-cdn.com/products/9781838824327/cover/smaller" alt="Jenkins Administrator's Guide " height="256px" align="right"></a>

This is the code repository for [Jenkins Administrator's Guide ](https://www.packtpub.com/product/jenkins-administrator-s-guide/9781838824327?utm_source=github&utm_medium=repository&utm_campaign=9781838824327), published by Packt.

**Install, manage and scale a CI/CD build and release system to accelerate your product life cycle**

## What is this book about?
Jenkins is a renowned name among build and release CI/CD DevOps engineers because of its usefulness in automating builds, releases, and even operations. Despite its capabilities and popularity, it's not easy to scale Jenkins in a production environment. Jenkins Administrator's Guide will not only teach you how to set up a production-grade Jenkins instance from scratch, but also cover management and scaling strategies. 

This book covers the following exciting features:
* Set up a production-grade Jenkins instance on AWS and on-premise
* Create continuous integration and continuous delivery (CI/CD) pipelines triggered by GitHub pull request events
* Use Jenkins Configuration as Code to codify a Jenkins setup
* Backup and restore configurations and plan for disaster recovery
* Plan, communicate, execute, and rollback upgrade scenarios
* Identify and remove common bottlenecks in scaling Jenkins
* Use Shared Libraries to develop helper functions and create new DSLs

If you feel this book is for you, get your [copy](https://www.amazon.com/dp/1838824324) today!

<a href="https://www.packtpub.com/?utm_source=github&utm_medium=banner&utm_campaign=GitHubBanner"><img src="https://raw.githubusercontent.com/PacktPublishing/GitHub/master/GitHub.png" 
alt="https://www.packtpub.com/" border="5" /></a>

## Instructions and Navigations
All of the code is organized into folders. For example, ch1.

The code will look like the following:
```
{
    "Version": "2012-10-17",
    "Statement": [
        {
            "Effect": "Allow",
            "Action": [
                "route53:GetChange",
                "route53:ListHostedZones"
            ],
            "Resource": "*"
        },
```

**Following is what you need for this book:**
This book is for both new Jenkins administrators and advanced users who want to optimize and scale Jenkins. Jenkins beginners can follow the step-by-step directions, while advanced readers can join in-depth discussions on Script Security, removing bottlenecks, and other interesting topics. Build and release CI/CD DevOps engineers of all levels will also find new and useful information to help them run a production-grade Jenkins instance following industry best practices.

With the following software and hardware list you can run all code files present in the book (Chapter 1-11).
### Software and Hardware List
| Chapter | Software required | 
| -------- | ------------------------------------ | 
| 1-11 | Ubuntu 20.04 for the virtual machines and EC2 instances |
| 1-11 | Docker 18 or higher, used in the Ubuntu 20.04 hosts | 
| 1-11 | Git and OpenSSL, which are preinstalled in Ubuntu 20.04 | 
| 1-11 | Jenkins 2.263.1-LTS or higher | 


We also provide a PDF file that has color images of the screenshots/diagrams used in this book. [Click here to download it](https://static.packt-cdn.com/downloads/9781838824327_ColorImages.pdf).

### Related products
* Repeatability, Reliability, and Scalability through GitOps  [[Packt]](https://www.packtpub.com/product/repeatability-reliability-and-scalability-through-gitops/9781801077798?utm_source=github&utm_medium=repository&utm_campaign=9781801077798) [[Amazon]](https://www.amazon.com/dp/1801077797)

* Modern DevOps Practices  [[Packt]](https://www.packtpub.com/product/modern-devops-practices/9781800562387?utm_source=github&utm_medium=repository&utm_campaign=9781800562387) [[Amazon]](https://www.amazon.com/dp/1800562381)



## Get to Know the Authors
**Calvin Sangbin Park**
is a CI/CD DevOps engineer in NVIDIA. He's been using Jenkins throughout his career to automate the builds for Arduino Maker boards, Android tablets, enterprise software packages, and even firmware for an industrial laser for etching CPUs. Lately, he's been focusing on Kubernetes, monitoring, and process visualizations. He plans to contribute to the open-source community by developing a plugin that optimizes the Kubernetes cluster management.

**Lalit Adithya**
is a software engineer with the DevOps team at NVIDIA. He has built code commit to production pipelines using Jenkins and GitHub actions. He has built and scaled business-critical applications that serve several thousand requests every minute. He has also built frameworks that have boosted developer productivity by abstracting away the complexities of networking, request/response routing, etc. He knows the ins and outs of several public cloud platforms and can architect cost-effective and scalable cloud-native solutions.

**Samuel Gleske**
has been a Jenkins user and contributor for 10 years since 2011. He's contributed documentation, plugins, and discovered security issues. Some notable plugins Sam has maintained include: Slack plugin, GHPRB plugin, GitHub Authentication plugin, and a half dozen others. Sam has presented on and shared scripts for the Script Console documentation including being the primary author of its wiki page. Since 2014 Sam has been developing Jervis: Jenkins as a service which enables Jenkins to scale to more than 4,000 users and 30,000 jobs in a single Jenkins controller. Jervis emphasizes full self-service within Jenkins for users while balancing security.
### Download a free PDF

 <i>If you have already purchased a print or Kindle version of this book, you can get a DRM-free PDF version at no cost.<br>Simply click on the link to claim your free PDF.</i>
<p align="center"> <a href="https://packt.link/free-ebook/9781838824327">https://packt.link/free-ebook/9781838824327 </a> </p>